package Ex9218;

public class Ex5_2 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 100);

		if (random < 50) {
			System.out.println("bigger");
		}

		else if (random > 50) {
			System.out.println("less");
		}

		else {
			System.out.println("bingo");
		}

	}

}
