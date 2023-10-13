package week5.day4;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumber2 {
public static void main(String[] args) {
	int[] num= {1,2,3,5,7,9,1,4,6,8,2,4};
	//duplicate number 1,2,4
	
	Set<Integer> numbers=new TreeSet<Integer>();
	
	for(int i=0;i<num.length;i++) {
		if(!numbers.add(num[i])) {
			System.out.println(num[i]);
		}
	}
	System.out.println(numbers);
	
}
}
