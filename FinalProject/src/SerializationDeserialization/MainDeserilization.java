package SerializationDeserialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class MainDeserilization {
	/*
	 * Steps to Deserializa
	 * 
	 * 1.Declare your object 
	 * 2.Your class should implement Serializable interface
	 * 3.Add import java.io.Serializable; 
	 * 4.FileInputStream fileIn = new FileInputStream(file path) 
	 * 5.ObjectInputStream in = new ObjectInputStream(fileIn) 
	 * 6.objectName = (Class) in.readObject(); 
	 * 7.In.close(); fileIn.close();
	 */

	public static void main(String[] args) throws IOException, ClassNotFoundException {

	//	 * 1.Declare your object 

		User user = null;
		
	//	 * 4.FileInputStream fileIn = new FileInputStream(file path) 
		FileInputStream fileIn = new FileInputStream("UserInfo.ser");
		
   // 	 * 5.ObjectInputStream in = new ObjectInputStream(fileIn) 
		 ObjectInputStream in = new ObjectInputStream(fileIn);
 
   //	 * 6.objectName = (Class) in.readObject(); 
		 user = (User) in.readObject();
		 
   //     * 7. In.close(); fileIn.close();
		 
		 in.close(); fileIn.close();
		 
		 System.out.println("user.name");
		 System.out.println("user.password");
		 user.Hello();
		 
		 
		 

	}

}
