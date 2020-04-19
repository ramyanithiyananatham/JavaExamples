package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; // Import the File class
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Properties;
import java.util.Scanner;

public class TestFile {
	public static void main(String[] args) {
		TestFile t = new TestFile();
		t.createFile();// to create a file in current directory
		t.writeFile();// to write into the file
		t.readFile();
		t.fileInfoDelete();
		t.fileSearch();

	}

	public void createFile() {

		try {
			File myObj = new File("filename.txt");
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

	}

	public void writeFile() {
		try {
			// FileWriter myWriter = new FileWriter("filename.txt");//will write from
			// begining of file
			FileWriter fWriter = new FileWriter("filename.txt", true);// will add to content in file
			BufferedWriter myWriter = new BufferedWriter(fWriter);// actual IO operations are less, since buffered
																	// writer use internal buffer to write data into
																	// File
			myWriter.newLine();
			myWriter.append("I am appended");// pass a character sequence, StringBuilder or StringBuffer to append
			myWriter.write("Files in Java might be tricky, but it is fun enough!");// can pass only string
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public void readFile() {
		try {
			File myObj = new File("filename.txt");
			Scanner myReader = new Scanner(myObj);
			// Scanner class is meant to both read and parse text data into Java primitive types like int, short, float, double, and long.
			// And scanner is not syncronised, hence cannot share Scanner between multiple threads
			// but you can share the BufferedReader object.

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public void readFile2()
	{
		try
		{
			File f=new File(System.getProperty("filename.txt"));
			FileReader fr=new FileReader(f);
			BufferedReader read= new BufferedReader(fr);
			//System.out.println(	read.readLine());// when printing without while loop we have to repeat this statement
			
			/*while checking condition in while, it actually reads the first line, hence this block skips printing first line.
			 while(read.readLine()!=null) {
			System.out.println(	read.readLine());}*/
			
			String line=null;
			while((line=read.readLine())!=null) 
			{
				System.out.println(	line);
				}
			read.close();
		}
		catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	public void fileSearch() {
		try {
			File f1 = new File("filename.txt"); // Creation of File Descriptor for input file
			String[] words = null; // Intialize the word Array
			FileReader fr = new FileReader(f1); // Creation of File Reader object
			BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
			String s;
			String input = "Java"; // Input word to be searched
			int count = 0; // Intialize the word to zero
			while ((s = br.readLine()) != null) // Reading Content from the file
			{
				words = s.split(" "); // Split the word using space
				for (String word : words) {
					if (word.equals(input)) // Search for the given word
					{
						count++; // If Present increase the count by one
					}
				}
			}
			if (count != 0) // Check for count not equal to zero
			{
				System.out.println("The given word is present for " + count + " Times in the file");
			} else {
				System.out.println("The given word is not present in the file");
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public void fileInfoDelete() {
		File myObj = new File("filename.txt");
		
		if (myObj.exists()) {
			System.out.println("File name: " + myObj.getName());
			System.out.println("Absolute path: " + myObj.getAbsolutePath());
			System.out.println("Writeable: " + myObj.canWrite());
			System.out.println("Readable " + myObj.canRead());
			System.out.println("File size in bytes " + myObj.length());
			System.out.println("user dir"+System.getProperty("user.dir"));
		} else {
			System.out.println("The file does not exist.");
		}
		/*
		 * if (myObj.delete()) { System.out.println("Deleted the file: " +
		 * myObj.getName()); } else { System.out.println("Failed to delete the file.");
		 * }
		 */
	}
}
