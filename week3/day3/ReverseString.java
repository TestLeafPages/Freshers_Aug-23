package week3.day3;

public class ReverseString {
public static void main(String[] args) {
	String name="Testleaf";
	//convert the String into char Array
	char[] charArray = name.toCharArray();
	
	System.out.println("charArray.length "+charArray.length);
	//reverse for loop
	for (int i =charArray.length-1;i>=0; i--) {
		System.out.print(charArray[i]);
	}
}
}
