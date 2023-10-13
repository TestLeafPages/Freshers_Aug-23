package week5.day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	Set<String> obj=new LinkedHashSet<String>();
	//Add the element in list
	obj.add("Ajay");
	obj.add("Pranesh");
	boolean add = obj.add("K7");
	System.out.println("First time "+add);
	obj.add("Anand");
	boolean add2 = obj.add("K7");
	System.out.println("Second time "+add2);
	System.out.println(obj);
	//hash set
//	[k7, Anand, Ajay, Pranesh]
	
	//treeset
	//[Ajay, Anand, K7, Pranesh]
	
	//[Ajay, Pranesh, K7, Anand]
}
}
