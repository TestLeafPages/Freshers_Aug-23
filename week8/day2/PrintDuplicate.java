package week8.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicate {
public static void main(String[] args) {
	
	int[] numbers= {1,2,3,5,2,3,1};
	Set<Integer> num=new HashSet<Integer>();
	
	
	
	for (int i = 0; i < numbers.length; i++) {
		if(!num.add(numbers[i])) {
			System.out.println(numbers[i]);
		}
			
	}
	
	//System.out.println(num);
	
}
}
