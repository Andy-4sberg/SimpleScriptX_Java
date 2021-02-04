// Packages
import java.io.BufferedReader;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.io.IOException;

// Main class [SimpleScriptX doesn't work]
class Main {

	// User input
	public static void main(String[] args) throws IOException {

		// Version
		System.out.println("\033[34;1mSimpleScript X (Java) v1.0.4a");

		// Line
		int line = 0;

		// BufferedReader input
		BufferedReader raw_input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\033[32;1m$ \033[34;1m");
		String input = raw_input.readLine();

		// [DEBUG] Print input
		System.out.println(input);

		// Execute input
		execute(input, line);
	}

	// Execute command
	public static void execute(String input, int line) {

		// HashMap setup
		HashMap<String,Integer> keywords = new HashMap<String,Integer>();
		keywords.put("print",0);
		keywords.put("help",1);
		keywords.put("",2);
		keywords.put("*",3);
		keywords.put("clear",4);

		// Unknown command
		if (keywords.get(input)==null) {
			System.out.printf("\033[31;1mSyntaxError on line %s %n",line);
		}
		// Known command switch
		else {
			switch (keywords.get(input)) {
				case 0: // print
					System.out.println("Found!");
					break;
				case 1: // help
					System.out.println(keywords);
					break;
				case 2: // empty line
					// System.out.println("BLANK");
					break;
				case 3: // comment
					//System.out.println("COMMENT");
					break;
				case 4: // clear
					System.out.println("\033[A\033[2J");
				default: // if glitch
					System.out.printf("\033[31;1mError whil processing line %i",line);
					break;
			}
		
		// Removes\ color
		System.out.println("\033[0;0m");
		}
	}
}