package managers;

import utilities.ConfigFileReader;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager(); // rule for singleton variables 
																				  //as private static
	private static ConfigFileReader configFileReader;

	private FileReaderManager() {
	}
	
	public static FileReaderManager getInstance() {  // Factory method
		return fileReaderManager;
	}
	
	public ConfigFileReader getConfigFileReader() {
		return (configFileReader==null)? new ConfigFileReader():configFileReader;
	}

}
