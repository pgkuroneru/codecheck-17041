package codecheck;

public class App {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Hello!");
		} else {
			System.out.println("Hello " + args[0] + "!");
		}
	}
}
