package org.finalProject.SerializationDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	/*
	 * Steps to Serilize
	 *  1.Your objeck class should implement Serializable interface
	 * 2.Add import java.io.Serializable; 
	 * 3.FileOutputStream fileOut = new  FileOutputStream(file path) 
	 * 4.ObjectOutputStream out = new  ObjectOutputStream(fileOut) 
	 * 5.out.writeObject(objectName)
	 * 6.out.close(); 
	 * fileOut.close();
	 */

	public static void main(String[] args) throws IOException {

		User user = new User();
		user.name = "Milica";
		user.password = "Nikola";

		// * 3.FileOutputStream fileOut = new FileOutputStream(file path)

		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");

		// * 4.ObjectOutputStream out = new ObjectOutputStream(fileOut)

		ObjectOutputStream out = new ObjectOutputStream(fileOut);

		// * 5.out.writeObject(objectName)
		out.writeObject(user);

		// * 6.out.close(); fileOut.close();

		out.close();
		fileOut.close();

		System.out.println("Object saved!");
	}

	/*
	 * Object serialization and deserialization are used in programming to convert
	 * objects into a format that is suitable for transfer or storage in a file, so
	 * that they can later be returned to object form. This is useful in network
	 * programming when an object needs to be sent across a network, or when objects
	 * are stored in databases or files.
	 * 
	 * In Java, the classes that enable object serialization and deserialization are
	 * ObjectOutputStream and ObjectInputStream.
	 *  These classes convert objects into bytes that can be sent across a network or written to a file.
	 
	 * 
	 * serialVersionUID is a unique identification of the class that is included in
	 * the serialized object. It is used when deserializing an object to check
	 * whether the class that was saved and the class in the program are the same.
	 * If the serialVersionUID does not match, an InvalidClassException will be
	 * thrown.
	 * 
	 */

}
