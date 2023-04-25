package LoopStructures_07;
//@author Milica Jaric

public class Task134_ForLoop30 {
	/*
	 * Write an algorithm and a program that prints all three-digit numbers that are
	 * divisible by both 2 and 3.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// m - a three-digit number
		// s - hundreds digit
		// d - tens digit
		// j - ones digit
		int m, s, d, j;
		System.out.println("All three-digit numbers that are divisible by both 2 and 3 are: ");
		for (s = 1; s <= 9; s++)
			for (d = 0; d <= 9; d++)
				for (j = 0; j <= 9; j++) {
					m = 100 * s + 10 * d + j;
					if (m % 2 == 0 && m % 3 == 0)
						System.out.println(m);
				}

		/*
		 * ANOTHER WAY
		 * 
		 * // m - a three-digit number System.out.
		 * println("All three-digit numbers that are divisible by both 2 and 3 are: ");
		 * for (int m = 100; m <= 999; m++) if(m % 2 == 0 && m % 3 == 0)
		 * System.out.println(m);
		 */
	}

}
