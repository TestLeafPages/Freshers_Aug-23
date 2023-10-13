package week5.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnForEach {
public static void main(String[] args) {
	
	List<String> fruits=new ArrayList<String>();
	//Add the element in list
	String[] fruitsEle= {"Orange","Papaya","Mango","Grapes","Apple"};
	
	for (String local : fruitsEle) {
		fruits.add(local);
	}
	
	System.out.println(fruits);
	
	
	
	for (String string : fruits) {
		System.out.println(string);
	}
}
}
