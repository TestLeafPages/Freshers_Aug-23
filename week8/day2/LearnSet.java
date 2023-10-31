package week8.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	Set<Integer> num=new HashSet<Integer>();
	
	boolean add = num.add(5);
	System.out.println("first "+add);
	num.add(4);
	num.add(1);
	num.add(2);
	
	num.add(3);
	boolean add2 = num.add(5);
	System.out.println("Second " +add2);
	System.out.println(num);
	
}
}
