package az.project.l01_logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
	
	public static void main(String[] args) {
		
		// OFF: Loglama dayandir
		// FATAL: Fatal olanlari goster
		// ERROR: Error ve Fatal olanlari goster
		// WARNING: Warning,Error ve Fatal olanlari goster
		// INFI: Info,Warning,Error ve Fatal olanlari goster
		// DEBUG: Info,Warning,Error ve Fatal olanlari goster
		// ALL: Butun melumatlari goster
		
		Logger logger = LogManager.getLogger();
		
		logger.trace("First Trace Logging  !");
		logger.debug("First Debug Logging  !");
		logger.info("First Info Logging  !");
		logger.warn("First Warn Logging  !");
		logger.error("First Error Logging  !");
		logger.fatal("First Fatal Logging  !");
	}

}
