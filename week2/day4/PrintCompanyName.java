package week2.day4;

import java.util.Arrays;

public class PrintCompanyName {
public static void main(String[] args) {
	
	String[] companyName=new String[4];
	companyName[0]="TestLeaf";
	companyName[1]="Qeagle";
	companyName[2]="CTS";
	companyName[3]="Agilysis";
	
	//sort the name
	Arrays.sort(companyName);
	for (int i = 0; i < companyName.length; i++) {
		System.out.println(companyName[i]);
	}
			
}
}
