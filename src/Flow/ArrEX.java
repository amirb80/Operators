package Flow;

import java.util.Arrays;

public class ArrEX {

	public static void main(String[] args) {
//		int[] numArray = new int[] { 1, 2, 3 };
//		System.out.println(Arrays.toString(numArray));
//		// for(int current: numArray) ;

		int[] intarray = new int[4];
		for (int i = 0; i < intarray.length; i++) {
			int randomNumber = (int) (Math.random() * 10);
			intarray[i] = randomNumber;
			System.out.println(Arrays.toString(intarray));

		}
	}

}
