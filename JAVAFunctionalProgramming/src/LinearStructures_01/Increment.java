package LinearStructures_01;
//@author Milica Jaric

/*
 * Let i = 3 and j = 4. Calculate:
			a) j = 3 + --i;
			b) j = 3 + i--;
			c) j = 3 + ++i;
			d) j = 3 + i++

 */
public class Increment {

	public static void main(String[] args) {

		// a)
		int i = 3, j = 4;
		System.out.println("Pod a)\ni = " + i + ", j = " + j);
		j = 3 + --i; // j = 3 + (i - 1) decrease i and then calculate
		System.out.println("i = " + i + "; j = " + j);

		// b)
		i = 3;
		j = 4;
		System.out.println("\nPod b)\ni = " + i + " j = " + j);
		j = 3 + i--; // j = 3 + i, i = i-i; i.e. calculate and then decrease i
		System.out.println("i = " + i + " j = " + j);

		// c)
		i = 3;
		j = 4;
		System.out.println("\nPod c)\ni = " + i + " j = " + j);
		j = 3 + ++i; // j = 3 + (i + 1) increase i and then calculate
		System.out.println("i = " + i + " j = " + j);

		// d)
		i = 3;
		j = 4;
		System.out.println("\nPod d)\ni = " + i + " j = " + j);
		j = 3 + i++; // j = 3 + i, i = i + i; i.e. calculate and then increase i
		System.out.println("i = " + i + " j = " + j);

	}
}
