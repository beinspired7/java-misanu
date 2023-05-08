package org.oop.exceptions_16;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Define the Item class and in it:
- data name of type String,
- data producer of type String,
- barcode data type String,
- double price data,
- double consumption data,
- get methods and set methods for this data.
  The price data must be greater than zero, and the String data must not be null. In the case of entering one of these values, it is necessary to throw an exception of the ExceptionItem class.

- redefined toString method of the Object class.
  This method should return a String containing the values of all item data.

Define the class ExceptionItem which inherits the class Exception and contains:
- a constructor that receives an error message as an input argument and calls the corresponding constructor of the superclass passing it the input argument.

Define a TestItem trigger class that:
- creates one object of class Item, into which it enters appropriate values and prints all data about the item on the screen.
 */
public class Task345_Exceptions_XVI {
    public class TestItem {
        public  void main(String[] args) throws Exception, IOException {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the item name: ");
            String name = input.readLine();
            System.out.println("Enter the manufacturer of the item: ");
            String producer = input.readLine();
            System.out.println("Enter the item barcode: ");
            String barcode = input.readLine();
            System.out.println("Enter the item price: ");
            double price = Double.parseDouble(input.readLine());
            Item a = new Item();
            try {
                a.setName(name);
                a.setProducer(producer);
                a.setBarcode(barcode);
                a.setPrice(price); /* Print item data */
                System.out.println("\nItem data entered is: ");
                System.out.println(a.toString());
            } catch (ExceptionItem e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
