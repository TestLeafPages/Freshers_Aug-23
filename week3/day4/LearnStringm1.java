package week3.day4;

public class LearnStringm1 {
public static void main(String[] args) {
	String text="testLeaf";
	String upperCase = text.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = text.toLowerCase();
	System.out.println(lowerCase);
	
	String title="My Home | opentaps CRM";
	if(title.contains("My Home")) {
		System.out.println("Title is matched");
	}else {
		System.out.println("Title not matched");
	}
}
}
