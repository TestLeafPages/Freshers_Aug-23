package week3.day4;

public class LearnReplaceAll {
public static void main(String[] args) {
	String text="123abcdef23";
	//abcdef
	String replaceAll = text.replaceAll("[^0-9]", "");
	System.out.println(replaceAll);
}
}
