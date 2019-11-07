package Flow;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("please enter name");

		String name = input.nextLine();
		String empty = "";
		// while(name.isEmpty() ; {
		while (name.equals(empty)) {

			System.out.println("wrong enter another");
			name = input.nextLine();

		}
		System.out.printf("Hellow %s", name);

		input.close();
	}
}
