package week2.day4;

import java.util.Arrays;

public class FindSecondLargestNumber {
public static void main(String[] args) {
	int[] num={10,500,20,98,1};
	//sort the given Array
	Arrays.sort(num);
	//Print second largest number
	System.out.println(num[num.length-2]);
}
}
