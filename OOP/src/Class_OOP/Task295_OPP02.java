package Class_OOP;
//@author Milica Jaric

public class Task295_OPP02 {
/*
 * Define a class named Rastojanje that contains:

A field named stopala of type integer as a unit of measure
A field named inci of type double for the number of inches
Define a driver class named DemoPrikaz and in it do the following:

Create three objects of the class Rastojanje named 'r1', 'r2', and 'r3'.
Assign a value of 14 to the stopala field and 9.5 to the inci field of object 'r1'.
Assign a value of 19 to the stopala field and 5.5 to the inci field of object 'r2'.
Object 'r3' is created without assigning any values to its fields.
Finally, print the values of all the objects' fields.
Questions:
What are the default values of the fields of object 'r3'?
Why do they have those particular values?
 */
	public static void main(String[] args) {
		Rastojanje r1 = new Rastojanje();
		Rastojanje r2 = new Rastojanje();
		Rastojanje r3 = new Rastojanje();

		/* Assign values to the attributes of object r1 */
		r1.stopala = 14;
		r1.inci = 9.5;

		/* Assign values to the attributes of object r2 */
		r2.stopala = 19;
		r2.inci = 5.5;

		System.out.println("Rastojanje 1: " + r1.stopala + "\'-" + r1.inci + "\"");
		System.out.println("Rastojanje 2: " + r2.stopala + "\'-" + r2.inci + "\"");

		/* Since we did not assign any values to the attributes of object r3, 
		* they will have the default values.
		* The default value for the double type is '0.0'.
		* The default value for the int type is '0'.*/
		System.out.println("Rastojanje 3: " + r3.stopala + "\'-" + r3.inci + "\"");
	}

}
