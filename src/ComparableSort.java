//package com.tutorial.java;


import java.util.*;  
//The Comparable interface in util has compareTo(T obj) method which is used by sorting methods
//Comparator interface compare(Object o1, Object o2) method need to be implemented that takes two Object argument, it should be implemented in such a way that it returns negative int if the first argument is less than the second one and returns zero if they are equal and positive int if the first argument is greater than the second one.
import java.io.*;  
class Student implements Comparable<Student>{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
public int compareTo(Student st){  
if(age==st.age)  
return 0;  
else if(age>st.age)  //Comparator
return 1;  
else  
return -1;  
}  
}  
//Creating a test class to sort the elements  
public class ComparableSort { 
public static void main(String args[]){  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Jai",21));  
  
Collections.sort(al);  //comparable
for(Student st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  