package LinearStructures_01;
//@author Milica Jaric

/*
 * Write code that demonstrates explicit conversion, i.e. conversion that (with loss) converts from a wider to a narrower data type (Narrowing Casting).
It must be done manually by placing the appropriate data type in parentheses in front of the value
 */

public class ExplicitConversion {

	public static void main(String[] args) {
		double d = 10.82d;
		int i = (int) d;
		System.out.println("d " + d);
		System.out.println("i " + i);
	}
}
