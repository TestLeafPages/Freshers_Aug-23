package week3.day3;

import java.util.Scanner;

public class ReverseStringUserScannerClass {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your name");
	//To get the input from user
	String nextLine = scan.nextLine();
	System.out.println(nextLine);
	//convert the String into charArray
	char[] charArray = nextLine.toCharArray();
	//Iterate the values from charArray using reverse for loop
	for (int i =charArray.length-1;i>=0; i--) {
		//print each character
		System.out.println(charArray[i]);
	}
}
}
