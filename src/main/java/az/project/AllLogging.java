package az.project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AllLogging {
	
	public static void main(String[] args) {
		
		
		Logger logger = LogManager.getLogger();
		
		for (int i = 0; i < 500; i++) {
			logger.info("All Logging " + i);
		}
		
		
	}

}
