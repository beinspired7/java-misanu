package org.finalProject.project4.praksa;

import org.finalProject.project4.item.Item;
import org.finalProject.project4.loader.Type;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHelper {

	private final static String serializeFilePath = "resource/finalProject/project4/data.ser";

	private FileHelper() {}

	public static String loadMetaData() {
		StringBuffer characterData = new StringBuffer();
		File file = new File("resource/finalProject/project4/got_meta_data.txt");

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = buffer.readLine()) != null) {
				characterData.append(aLine);
				characterData.append(System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return characterData.toString();
	}

	public static List<String> loadMessages(String fileName) {
		List<String> messages = new ArrayList<String>();
		File file = new File("resource/finalProject/project4/message_logs/" + fileName);

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = buffer.readLine()) != null) {
				messages.add(aLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return messages;
	}

	public static void storeItems(Map<Type, List<Item>> items) throws IOException {
		FileOutputStream fos = new FileOutputStream(serializeFilePath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(items);
		oos.flush();
		oos.close();
	}

	public static Map<Type, List<Item>> getItems() throws IOException, ClassNotFoundException {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializeFilePath));
			HashMap<Type, List<Item>> items = (HashMap<Type, List<Item>>) ois.readObject();
			ois.close();

			return items;
		} catch (InvalidClassException e) {
			Files.deleteIfExists(Path.of(serializeFilePath));
			return new HashMap<>();
		}
	}
}
