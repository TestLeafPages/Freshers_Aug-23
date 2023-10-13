package week5.day4;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	
	List<String> obj=new ArrayList<String>();
	//Add the element in list
	obj.add("Ajay");
	obj.add("Pranesh");
	obj.add("k7");
	obj.add("Anand");
	obj.add("k7");
	//To print the list
	System.out.println(obj);
	//To get the size of list
	System.out.println(obj.size());
	//To get particular element in list
	String string = obj.get(2);
	System.out.println(string);
	//To remove particular value in list
	//obj.remove(0);
	obj.remove("Ajay");
	System.out.println(obj);
	
	//To clear the all values from the list
	///obj.clear();
	//System.out.println(obj);
	
	//boolean empty = obj.isEmpty();
	//System.out.println(empty);
	
	boolean contains = obj.contains("k7");
	System.out.println(contains);
	
	obj.add(0, "Ajay");
	System.out.println(obj);
	
	
	
	
	for (String localVariableName : obj) {
		System.out.println(localVariableName);
	}
	
	
}
}
