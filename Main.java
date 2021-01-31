import java.util.HashMap;
import java.util.Scanner;
class SimpleScriptX {
	public static void main(String[] args) {
		int line = 0;
		HashMap<String,Integer> keywords = new HashMap<>();
		keywords.put("print",0);
		keywords.put("help",1);
		keywords.put("",2);
		keywords.put("*",3);
		keywords.put("clear",4);
		Scanner raw_input = new Scanner(System.in);
		System.out.print("\033[32;1m$ \033[34;1m");
		String input = raw_input.nextLine();
		System.out.println(input);
		if (keywords.get(input)==null) {
			System.out.printf("\033[31;1mSyntaxError on line %s %n",line);
		} else {
			switch (keywords.get(input)) {
				case 0:
					System.out.println("Found!");
					break;
				case 1:
					System.out.println(keywords);
					break;
				case 2:
					System.out.println("BLANK");
					break;
				case 3:
					System.out.println("COMMENT");
					break;
				case 4:
					System.out.println("\033[A\033[2J");
				default:
					System.out.printf("\033[31;1mError whil processing line %i",line);
					break;
			}
		System.out.println("\033[0;0m");
		}
	}
}