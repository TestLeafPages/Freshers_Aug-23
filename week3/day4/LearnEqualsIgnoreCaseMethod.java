package week3.day4;

public class LearnEqualsIgnoreCaseMethod {
public static void main(String[] args) {
	
	
	String name1=new String("Mani");
	String name2=new String("mani");
	boolean equals = name1.equals(name2);
	if(name1.equalsIgnoreCase(name2)) {
		System.out.println("Equal method "+"Both are equal");
	}else {
		System.out.println("Equal method "+"Both are not equal");
	}
	
	
}
}
