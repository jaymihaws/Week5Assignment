
public class app {

	public static void main(String[] args) {
		
	Logger logger = new AsteriskLogger();
		
		logger.log("How are you?");
		logger.error("Failed to load");
		
	Logger logger1 = new SpacedLogger();
	
		logger1.log("Jaymi");
		logger1.error("Unknown");
	

	}

}
