package week5.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PrintFruits {
public static void main(String[] args) {
	
	List<String> fruits=new ArrayList<String>();
	//Add the element in list
	
	fruits.add("Orange");
	fruits.add("Papaya");
	fruits.add("Mango");
	fruits.add("Grapes");
	fruits.add("Apple");
	
	System.out.println(fruits);
	//To sort the fruits in ascending order
	Collections.sort(fruits);
	System.out.println(fruits);
	//To reverse the values in descending order
	Collections.reverse(fruits);
	System.out.println(fruits);
}
}
