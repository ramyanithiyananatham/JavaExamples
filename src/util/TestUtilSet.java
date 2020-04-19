package util;

/* If you don't want duplicates, use Set ,
 * or SortedSet if you want sorted ordering,
 *  or Treeset if you want sorted ordering without null values, 
 *  or LinkedHashSet if you want to maintain insertion order. 
 *  If you want to allow duplicates, use List, and so on.*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//date,enum, enumset, arraylist, set
//HashMap however, store items in "key/value" pairs
public class TestUtilSet {

	enum Level {
		LOW, MEDIUM, HIGH
	}

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ravi");
		a.add("Vijay");
		a.add("Ajay");

		TestUtilSet t = new TestUtilSet();
		t.timeDate1();
		t.dateFormat();
		t.testEnum();
		t.printEnum();
		t.testArraylistInFile(a);
		t.linkedHashSetExample();
		t.set_Example();
		t.testHashmap();
	}

	/*
	 * An enum can, just like a class, have attributes and methods. The only
	 * difference is that enum constants are public, static and final (unchangeable
	 * - cannot be overridden). An enum cannot be used to create objects, and it
	 * cannot extend other classes (but it can implement interfaces).
	 */
	void testEnum() {
		Level myVar = Level.MEDIUM;
		switch (myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
	}

	void printEnum() {
		for (Level myVar : Level.values()) {
			System.out.println(myVar);
		}
		// enumset class inherits AbstractSet class and implements the Set interface.
		Set<Level> set1 = EnumSet.allOf(Level.class);
		System.out.println("allof" + set1);
		Set<Level> set2 = EnumSet.noneOf(Level.class);
		System.out.println("none of:" + set2);
	}

	// current time and date
	void timeDate1() {
		LocalDate myObj1 = LocalDate.now(); // Create a date object
		System.out.println("LocalDate" + myObj1);
		LocalTime myObj = LocalTime.now();
		System.out.println("LocalTime" + myObj);
	}

	// Local date time, Date formatter
	void dateFormat() {
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);
	}

	void testArraylistInFile(ArrayList<String> al) {
		try {
			al.add(1, "Sonoo");
			// al.remove(0);
			al.removeIf(str -> str.contains("Ajay"));
			System.out.println("ArrayList Is Empty: " + al.isEmpty());
			// Serialization
			FileOutputStream fos = new FileOutputStream("Text.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			// Deserialization
			FileInputStream fis = new FileInputStream("Text.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<String> list = (ArrayList) ois.readObject();
			ois.close();
			System.out.println(list);
			Collections.sort(list);
			list.get(1);
			list.set(2, "Manju");
			System.out.println("sorted array of size" + al.size());
			for (String i : list) {
				System.out.println(i);
				// forEach
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void set_Example() {

		// Set demonstration using HashSet
		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("Geeks");
		hash_Set.add("For");
		hash_Set.add("Geeks");
		hash_Set.add("Example");
		hash_Set.add("Set");
		System.out.print("Set output without the duplicates");

		System.out.println(hash_Set);

		// Set demonstration using TreeSet
		System.out.print("Sorted Set after passing into TreeSet");
		Set<String> tree_Set = new TreeSet<String>(hash_Set);
		System.out.println(tree_Set);
	}

	void linkedHashSetExample() {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		lhs.add("Amit");
		// insert first null key
		lhs.add(null);
		lhs.add("Vijay");
		lhs.add("Rahul");

		// insert second null key
		// which replace first null key value
		lhs.add(null);
		// insert duplicate
		lhs.add("Vijay");

		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private void testHashmap() {
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println("HasMap" + capitalCities);
		System.out.println("Capital of England" + capitalCities.get("England"));
		capitalCities.remove("England");// remove
		System.out.println("after Removing england" + capitalCities);
		capitalCities.clear();
		System.out.println("after Remove" + capitalCities);
	}

}