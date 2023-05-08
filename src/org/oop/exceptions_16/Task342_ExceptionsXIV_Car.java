package org.oop.exceptions_16;
//@author Milica Jaric
/*

Define the Car class and in it:
- data name of type String,
- data producer of type String,
- year data of type int,
- double consumption data,
- the enterNameCar method to enter the name of the car,
- the enterCarManufacturer method for entering the car manufacturer,
- method enetiGodisteAutomobila for entering the year of the car, where the input is repeated until the whole number is entered,
- the method enterPotrosnjaAutomobila for entering the car's fuel consumption per 100 km, where the input is repeated until a real number is correctly entered,
- redefined toString method of the Object class that returns a single String. This String contains information about the car.

Define the launcher class TestAutomobile and in it:
- create an object of the Car class, enter the appropriate data and display it.
 */
public class Task342_ExceptionsXIV_Car {
    public class Car {

        /* Declare data */
        String name;
        String producer;
        int age;
        double consumption; /* Method to enter car name */

        void enterCarName() throws IOException {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter car name: ");
            name = input.readLine();
        } /* Method to enter car manufacturer */

        void enterAutomobileManufacturer() throws IOException {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the car manufacturer: ");
            producer = input.readLine();
        } /* Method to enter car year */

        void enterCarYear() {
            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the car year: ");
                age = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.out.println("You did not enter the number correctly");
                enterCarYear();
            }
        } /* Method to input car consumption */

        void enterPotrosnjuAutomobila() {
            while (true) {
                try {
                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter car consumption per 100 km: ");
                    consumption = Double.parseDouble(input.readLine());
                    break;
                } catch (Exception e) {
                    System.out.println("You have not entered the consumption of the car correctly");
                }
            }
        } /* Redefined method */

        public String toString() {
            return "Name: " + name + "\nManufacturer: " + manufacturer + "\nYear: " + year + "\nConsumption: "
                    + consumption;
        }
    }
}
