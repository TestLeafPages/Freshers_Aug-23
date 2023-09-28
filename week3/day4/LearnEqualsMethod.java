package week3.day4;

public class LearnEqualsMethod {
public static void main(String[] args) {
	String text1="Testleaf";
	String text2="Testleaf";
	if(text1==text2) {
		System.out.println("Both are equal");
	}else {
		System.out.println("Both are not equal");
	}
	
	String name1=new String("Mani");
	String name2=new String("mani");
	boolean equals = name1.equals(name2);
	if(name1.equals(name2)) {
		System.out.println("Equal method "+"Both are equal");
	}else {
		System.out.println("Equal method "+"Both are not equal");
	}
	if(name1==name2) {
		System.out.println("Both are equal");
	}else {
		System.out.println("Both are not equal");
	}
	
}
}
