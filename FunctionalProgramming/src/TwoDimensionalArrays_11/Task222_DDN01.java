package TwoDimensionalArrays_11;

public class Task222_DDN01 {
	// @author Milica Jaric

	/*
	 * Print the values of the elements of a previously initialized two-dimensional
	 * array.
	 */
	public static void main(String[] args) {

		// First method: Initializing a two-dimensional array
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		// Printing the elements of the two-dimensional array:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
