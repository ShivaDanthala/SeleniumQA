package managers;

import utilities.ConfigFileReader;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager(); // rule for singleton variables 
																				  //as private static
	private static ConfigFileReader configFileReader;

	private FileReaderManager() { // rule for singleton, which is private constructor 
									//to restrict other classes instantiation 
	}
	
	public static FileReaderManager getInstance() {  // public Factory method to 
		return fileReaderManager;
	}
	
	public ConfigFileReader getConfigFileReader() {
		return (configFileReader==null)? new ConfigFileReader():configFileReader;
	}

}
