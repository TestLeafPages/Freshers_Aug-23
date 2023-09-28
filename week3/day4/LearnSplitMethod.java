package week3.day4;

public class LearnSplitMethod {
public static void main(String[] args) {
	
	String text="I love chicken briyani";
	//convert the String into words using split method
	String[] split = text.split(" ");
	//to get the size of an Array
	System.out.println(split.length);
	
	//another way
//initialize the temp variable as count
	int count=0;
	//Iterate the values from split
	for (int i = 0; i < split.length; i++) {
		//to increase the count
		
		count=count+1;
		System.out.println(split[i]);
	}
	//print the count values
	System.out.println(count);
	
	
	
	
	
}
}
