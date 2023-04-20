package LoopStructures_07;
//@author Milica Jaric

public class Task132_ForLoop28 {
	/*
	 * Write an algorithm and program to print all three-digit Armstrong numbers.
	 * (another way of solving compared to Task 115)
	 * 
	 * Note: A number is an Armstrong number if it is equal to the sum of the cubes
	 * of its digits.
	 */
	public static void main(String[] args) {
		/* m - three-digit number */
		/* s - hundreds digit of the number */
		/* d - tens digit of the number */
		/* j - ones digit of the number */
		int m, s, d, j;
		System.out.println("Armstrong numbers from 100 to 999 are: ");
		for (s = 1; s <= 9; s++)
			for (d = 0; d <= 9; d++)
				for (j = 0; j <= 9; j++) {
					/* Finding Armstrong number */
					m = 100 * s + 10 * d + j;
					if (m == Math.pow(s, 3) + Math.pow(d, 3) + Math.pow(j, 3))
						System.out.println(m);
				}

	}
}
