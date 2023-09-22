  package week2.day5;

public class MissingNumber1 {
public static void main(String[] args) {
	
	int[] num= {1,2,3,4,7,6,8};
	//missing element 5
	
	//initialize the temp variable as sum1
	int sum1 =0;
	//Iterate the values 1 to 8 and store the values in sum1 variable
	for (int i = 1; i <=8; i++) {
		sum1=sum1+i;
	//	System.out.println(sum1);
	}
	System.out.println(sum1);
	
	//initialize the temp variable as sum2
	int sum2=0;
	//Iterate the values from given Arrays
	//int[] num= {1,2,3,4,7,6,8};
	for (int i = 0; i < num.length; i++) {
		sum2=sum2+num[i];
		System.out.println(sum2);
	}
	System.out.println(sum2);
//	
//	//print the missing number
//	int sum3=sum1-sum2;
//	System.out.println(sum3);
//	
	
}
}
