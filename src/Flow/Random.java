package Flow;

public class Random {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 10) + 1;
		int count = 1;
		int big = random;

		while (count < big) {
			System.out.println(count++);
		}

	}
}