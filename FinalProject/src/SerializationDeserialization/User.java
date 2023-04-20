package SerializationDeserialization;

import java.io.Serializable;

public class User  implements Serializable{

	String name;
	String password;

	public void Hello() {
		System.out.println("Cao " + name);
	}
}
