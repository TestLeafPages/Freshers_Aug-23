package week2.day4;

public class MissingElementThree {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,7,6,8};
	int n=arr.length+1;
	int sum =n*(n+1)/2;
	
	for(int i=0;i<arr.length;i++) {
		sum=sum-arr[i];
		System.out.println("Missing number is="+sum );
		
	}
}
}
