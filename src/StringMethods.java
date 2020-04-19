//package com.tutorial.java;

import java.util.regex.Pattern;
// The default capacity of the Stringbuffer/ builder is 16, and both are mutable strings. If number of character increases,  it increases the capacity by (oldcapacity*2)+2.
//String Builder is non synchronised- so more performance
//StringTokenizer(String str, String delim) allows you to break a string into tokens
public class StringMethods {

		public static void main(String[] args) {
			String targetString = "Java is fun to learn";
			String s1= "JAVA";
			String s2= "Java";
			String s3 = "  Hello Java  ";
			   String date = String.join("/","25","06","2018"); //delimiter added from java 1.8   
			   System.out.println("date with delimiter"+date);
			System.out.println("Char at index 2(third position): " + targetString.charAt(2));
			System.out.println("After Concat: "+ targetString.concat("-Enjoy-"));
			System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
			System.out.println("Checking equals with case: " +s2.equals(s1));
			System.out.println("Checking Length: "+ targetString.length());
			System.out.println("Replace function: "+ targetString.replace("fun", "easy"));
			System.out.println("SubString of targetString: "+ targetString.substring(8));
			System.out.println("SubString of targetString: "+ targetString.substring(8, 12));
			System.out.println("Converting to lower case: "+ targetString.toLowerCase());
			System.out.println("Converting to upper case: "+ targetString.toUpperCase());
			System.out.println("Triming string: " + s3.trim());
			System.out.println("searching s1 in targetString: " + targetString.contains(s1));
			System.out.println("searching s2 in targetString: " + targetString.contains(s2));
			String[] arr = targetString.split("\\s",3);  
	        for (String w : arr) {  
	            System.out.println("splitted word"+w); }

			char [] charArray = s2.toCharArray();
			System.out.println("Size of char array: " + charArray.length);
			System.out.println("Printing last element of array: " + charArray[3]);

System.out.println("(2 letter word with 2nd char s)"+Pattern.matches(".s", "as"));//true (2 letter word with 2nd char s)  

		}

	}

