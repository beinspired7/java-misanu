package org.oop.exceptions_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestItem {
    public static void main(String[] args) throws  IOException {
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
