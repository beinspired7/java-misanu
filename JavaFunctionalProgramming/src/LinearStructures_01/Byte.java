package LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

//Write a program to convert a file size expressed in kilobytes to bytes.

public class Byte {

	public static final String MAX_VALUE = null;
	public static final String MIN_VALUE = null;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Conversion of memory size from kilobytes to bytes");
		System.out.println("File size in kilobytes: ");
		int kb = input.nextInt();
		System.out.print("File size in bytes: " + kb * 1024);
		input.close();
	}

}
