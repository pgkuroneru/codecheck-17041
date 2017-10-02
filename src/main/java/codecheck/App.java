package codecheck;

public class App {
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Hello!");
		} else {
			System.out.println("Hello " + args[0] + "World!");
		}
	}
}
