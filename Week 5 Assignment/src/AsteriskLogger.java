
public class AsteriskLogger implements Logger {

	public void log(String log) {
		System.out.println("***" + log.toString() + "***");

	}

	public void error(String error) {
		int n = error.length();
		for (int i = 0; i < n + 12; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("***" + "ERROR:" + error.toString() + "***");
		for (int i = 0; i < n + 12; i++) {
			System.out.print("*");
		}
		System.out.println();

	}

}


