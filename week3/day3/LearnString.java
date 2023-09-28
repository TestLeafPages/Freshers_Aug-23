package week3.day3;

public class LearnString {
public static void main(String[] args) {
	String text="TestLeaf";
	//to get size of given String
	int length = text.length();
	System.out.println(length);
	//t
	//e
	//s
	//t
	//l
	//e
	//a
	//f
	             
	//t,e,s,t,l,e,a,f
	//convert the String into character Array
	char[] charArray = text.toCharArray();
	//to get the Array length
	System.out.println("Array size "+charArray.length);
	//Iterate the values from charArray
	for (int i = 0; i < charArray.length; i++) {
		//Print each character
		System.out.println(charArray[i]);
	}
	
}
}
