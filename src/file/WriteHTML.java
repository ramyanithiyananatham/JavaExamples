package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteHTML {

	public static void main(String[] args) throws IOException {
		// System.out.println(System.getProperty("user.dir"));
		// File f=new
		// File(System.getProperty("user.dir")+"\\src\\Config\\myTestFile.html");

		File myObj = new File("filehtml.html");
		try {
			if (myObj.createNewFile()) // returns a boolean value: true if the file was successfully created
			{
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		// stream connectivity
		FileWriter fw = new FileWriter(myObj,true);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write("<html><body><title>Way2Automation</title><h1>Learning Java</hi</body></html>");
		writer.newLine();
		writer.close();
		System.out.println("FileCreated!..");

	}
}