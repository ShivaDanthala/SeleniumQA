package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.EnvironmentType;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath= "src\\test\\resources\\configurations\\config.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			System.out.println("Property created");
			try {
				properties.load(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException exception) {
			System.out.println("Properties file is not found "+ propertyFilePath +"\n"+exception.toString());
			throw new RuntimeException("Configuration property file not found at "+propertyFilePath );
		}
	}

	public String getBrowser() {

		String browser = properties.getProperty("browserName");
		if(browser!=null) {
			return browser;
		}
		else
			throw new RuntimeException("Browser name not found at "+propertyFilePath);
	}

	public void writeConfigFile(String browser) {
		// TODO Auto-generated method stub

	}

	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");

		if(environmentName==null || environmentName.equalsIgnoreCase("Browser")) {
			return EnvironmentType.BROWSER;
		}
		else if(environmentName==null || environmentName.equalsIgnoreCase("Mobile"))
			return EnvironmentType.MOBILE;
		else  
			throw new RuntimeException("EnvironmentType  not found at "+propertyFilePath);
	}
}
