package org.oop.exceptions_16;

public class Item {
    /* Declaring data */
    String name;
    String producer;
    String barcode;
    double price; /* Method to access the data name */

    public String getName() {
        return name;
    } /* Method to set data name */

    public void setName(String name) throws ExceptionItem {
        if (name.isBlank() || name.isEmpty())
            throw new ExceptionItem("Item name must not be null");
        this.name = name;
    } /* Method to access the producer data */

    public String getProducer() {
        return producer;
    } /* Method to set the producer data */

    public void setManufacturer(String manufacturer) throws ExceptionItem {
        if (manufacturer.isBlank() || manufacturer.isEmpty())
            throw new ExceptionItem("Item manufacturer must not be null");
        this.producer = producer;
    } /* Method to access barcode data */

    public String getBarcode() {
        return barcode;
    } /* Method to set barcode data */

    public void setBarcode(String barcode) throws ExceptionItem {
        if (barcode.isBlank() || barcode.isEmpty())
            throw new ExceptionItem("Item barcode must not be null");
        this.barcode = barcode;
    } /* Method to access price data */

    public double getPrice() {
        return price;
    } /* Method for setting price data */

    public void setPrice(double price) throws ExceptionItem {
        if (price <= 0)
            throw new ExceptionItem("Price must be greater than zero");
        this.price = price;
    } /* Method to print item data */

    public String toString() {
        return "Name: " + name + "\nManufacturer: "
                + producer + "\nBarcode: " + barcode + "\nPrice: " + price;
    }

    public void setProducer(String producer) {
    }
}
