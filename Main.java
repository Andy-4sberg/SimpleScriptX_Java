import java.util.HashMap;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		HashMap<String,Integer> keywords = new HashMap<>();
		keywords.put("print",0);
		Scanner raw_input = new Scanner(System.in);
		System.out.print("\033[32;1m$ \033[34;1m");
		String input = raw_input.nextLine();
		System.out.println(input);
	}
	public static String execute(String args, int line) {
		return "";
	}
}