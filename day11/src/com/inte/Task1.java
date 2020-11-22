package com.inte;
import java.util.Arrays;

public class Task1 {
public static void main(String[] args) {
	String[] array= {"a","is","bad","one"};
 System.out.println("Shortest to longest: ");
 Arrays.sort(array, (s1, s2) -> s1.length() - s2.length());
 Arrays.asList(array).forEach(System.out::println);

 System.out.println("\nLongest to shortest: ");
 Arrays.sort(array, (s1, s2) -> (s2.length() - s1.length()));
 Arrays.asList(array).forEach(System.out::println);

 System.out.println("\nAlphabetically by the first character only: ");
 Arrays.sort(array, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
 Arrays.asList(array).forEach(System.out::println);
 
 
}
}
