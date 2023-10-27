package week7.day5;

public class REplaceAll {
public static void main(String[] args) {
	String text="₹16,499";

	//String replaceAll = text.replaceAll("[^0-9]", "");
	String replaceAll = text.replaceAll("\\D", "");
	System.out.println(replaceAll);
}

}
