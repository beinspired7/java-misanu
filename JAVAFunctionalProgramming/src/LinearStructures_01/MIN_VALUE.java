package LinearStructures_01;
//@author Milica Jaric

//Initialize all integer and double variables with their maximum values and print them to the screen.

public class MIN_VALUE {

	public static void main(String[] args) {

		int b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 9223_3720_3685_4775_807L; // Initialize ends 'L'
		float f = 3.4028235E38F; // Initialize ends F'
		double d = 1.7976931348623157E308D; // Initialize ends'D'

		System.out.println("Max value type BYTE is : " + b);
		System.out.println("Max value type tipa SHORT is : " + s);
		System.out.println("Max value type tipa INT is : " + i);
		System.out.println("Max value type LONG is : " + l);
		System.out.println("Max value type FLOAT is : " + f);
		System.out.println("Max value type DOUBLE is : " + d);
	}

}
