package week5.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PrintReverseOrder {
public static void main(String[] args) {
	
	List<Integer> fruits=new ArrayList<Integer>();
	//Add the element in list
	
	fruits.add(400);
	fruits.add(100);
	fruits.add(500);
	fruits.add(200);
	fruits.add(300);
	
	System.out.println(fruits);
	//To sort the fruits in ascending order
	//Collections.sort(fruits);
	System.out.println(fruits);
	//To reverse the values in descending order
	Collections.reverse(fruits);
	System.out.println(fruits);
}
}
