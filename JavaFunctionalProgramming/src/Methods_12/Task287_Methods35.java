package Methods_12;
//@author Milica Jaric

//Convert Celsius to Fahrenheit degrees. Assume that today's temperature in Nis is 25°C. Print the value of the measured temperature in Fahrenheit degrees.

public class Task287_Methods35 {
	// Method for converting Celsius to Fahrenheit degrees
	public static double celsiusToFahrenheit(double celsius) {
		return (((9.0 / 5.0) * celsius) + 32);
	}

	public static void main(String[] args) throws Exception {
		// Measured temperature
		double temp = 25;

		// Printing the result
		System.out.println("Temperature converted to Fahrenheit is: " + celsiusToFahrenheit(temp));
	}
}
