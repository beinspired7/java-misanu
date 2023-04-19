package LinearStructures_01;
//@author Milica Jaric

import java.util.Scanner;

/*
 * /*The journey lasts n seconds. Write a program to calculate how many hours, minutes, and seconds that is.

Description of the first solution: An hour has 3600 seconds. Dividing the time in seconds by 3600 gives us the hours: hour = n / 3600. The remainder of seconds (sec1) is divided by 60 to get the minutes, and the remainder of sec1 divided by 60 is the seconds.

Description of the second solution: The relationship between hours, minutes, and seconds is 1 h = 60 min; 1 min = 60 s. After reading the value in seconds, the following is performed:

Variant I - calculation conversion h = n / 3600; // number of hours is the integer part of the division of seconds by 3600
the remainder in seconds is n1 = n % 3600
for minutes, we take only the integer part of dividing n1 by 60 i.e. m = n % 3600 / 60;
the seconds are the remainder of dividing n by 60 i.e. s = n % 60;

 */
public class Seconds {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Elapsed seconds: ");
		int n = input.nextInt();
		int hour = n / 3600;
		int sec1 = n % 3600;
		int min = sec1 / 60;
		int sec = sec1 % 60;
		System.out.println("elapsed hours: " + hour);
		System.out.println("minutes: " + min);
		System.out.println("seconds: " + sec);

		input.close();

	}

}
