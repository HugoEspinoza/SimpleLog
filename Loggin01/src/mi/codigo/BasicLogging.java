package mi.codigo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BasicLogging {

	  private static final Log LOGGER = LogFactory.getLog(BasicLogging.class);

	  public void logTest() {

		if(LOGGER.isInfoEnabled()){
			LOGGER.info("Utilizando la implementacion:" +LOGGER.getClass().getName());
		}
	    if(LOGGER.isWarnEnabled()){
		    LOGGER.warn("esto es warn");
	    }
	    if(LOGGER.isDebugEnabled()){
	    	LOGGER.debug("Esto es un debug");
	    }
	    if(LOGGER.isErrorEnabled()){
	    	LOGGER.error("I caught a throwable!");
	    }
	    if(LOGGER.isFatalEnabled()){
	    	LOGGER.fatal("error fatal");
	    }
	    if(LOGGER.isTraceEnabled()){
		    LOGGER.trace("tracesssss");	    	
	    }

	  }
	  
	public static void main(String args[]) {
	    BasicLogging test = new BasicLogging();
	    test.logTest();
	  }
}
