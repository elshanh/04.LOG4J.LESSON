package az.project.l03_rollingLogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RollingLogging {
	
	public static void main(String[] args) {
		
		Logger logger = LogManager.getLogger();
		
		for (int i = 0; i < 500; i++) {
			logger.info("Rolling Logging " + i);
		}
		
	}

}
