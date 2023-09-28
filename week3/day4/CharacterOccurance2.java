package week3.day4;

public class CharacterOccurance2 {
public static void main(String[] args) {
	
	String word="testleaf12345@gmail.com";
	String replaceAll = word.replaceAll("[^0-9]", "");
	System.out.println(replaceAll);
	System.out.println(replaceAll.length());
	
	//Another way
	char[] charArray = word.toCharArray();
	int count=0;
	for (int i = 0; i < charArray.length; i++) {
		if(Character.isDigit(charArray[i])) {
			count++;
		}
	}
	System.out.println(count);
}
}
