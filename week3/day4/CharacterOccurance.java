package week3.day4;

public class CharacterOccurance {
public static void main(String[] args) {
	
	String word="racecar";
	//r  count =2
	
	char[] charArray=word.toCharArray();
	
	int count=0;
	
	for (int i = 0; i < charArray.length; i++) {
		//System.out.println(charArray[i]);
		if(charArray[i]=='r') {
			count++;
		}
	}
	
	
	System.out.println(count);
	
}
}
