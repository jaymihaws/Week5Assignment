
public class SpacedLogger implements Logger {

	public void log(String log) {
		int n = 1;
		StringBuilder addSpaces = new StringBuilder(log.toString());
		int word = addSpaces.length() - n;
		while (word > 0) {
			addSpaces.insert(word, " ");
			word = word - n;
		}
		System.out.println(addSpaces.toString());
	}

	public void error(String error) {
		int n = 1;
		StringBuilder addSpaces = new StringBuilder(error.toString());
		int word = addSpaces.length() - n;
		while (word > 0) {
			addSpaces.insert(word, " ");
			word = word - n;
		}
		System.out.println("ERROR:" + addSpaces.toString());
	}

}
