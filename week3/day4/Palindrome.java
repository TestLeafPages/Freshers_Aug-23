package week3.day4;

public class Palindrome {
public static void main(String[] args) {
	

		//Initialize the String
		String text="malayalam";
		//Initialize the empty String
		String reverse="";
       //Convert the String into character Array
		char[] charArray=text.toCharArray();
//Iterate the character from charArray using reverse for loop
		for(int i=charArray.length-1;i>=0;i--){
			//store the character in reverse String
			reverse=reverse+charArray[i];
		       System.out.println(reverse);
			//System.out.println(charArray[i]);
		}
		//To compare both String are equal
		//If it is match the given String is palindrome
		if(reverse.equals(text)){
		System.out.println("The given String is palindrome");
		}
		//If not, not a palindrome
		else{
		System.out.println("The given String not palindrome");
		}
		}
		}
