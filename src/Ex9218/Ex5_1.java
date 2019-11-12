package Ex9218;

public class Ex5_1 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 10) + 1;
		int random2 = (int) (Math.random() * 10) + 1;

		System.out.println("[" + random + "]" + "," + ("[" + random2 + "]"));

		if (random > random2) {
			;
			System.out.println(random);
		} else {
			System.out.println(random2);
		}
	}

}