package codecheck;

public class App {
	public static void main(String[] args) {
		if (args.equals(null) || args.length == 0 || args[0].equals("")) {
			System.out.println("Hello!");
		} else {
			System.out.println("Hello " + args[0] + "!");
		}
	}
}
