package az.project.l02_fileLogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileLogging {
	
	public static void main(String[] args) {
		
		Logger logger = LogManager.getLogger();
		logger.info("First File Log !");
	}

}
