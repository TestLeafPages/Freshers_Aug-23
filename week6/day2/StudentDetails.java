package week6.day2;

public class StudentDetails extends LearnConstructor {
	String studentName;
	int registerNumber;
	String address;
	
	StudentDetails(){
		System.out.println("Default constructor");
	}
	StudentDetails(String studentName,int registerNumber,String address){
		
		super();
		this.studentName=studentName;
		this.registerNumber=registerNumber;
		this.address=address;
		System.out.println("Parameterized Constructor");
	}
	public void add() {
		
	}
public void sub() {
		this.add();
	}

	
	
	
	public static void main(String[] args) {
		
		StudentDetails constructor=new StudentDetails("Dinesh",101,"chennai");
		System.out.println(constructor.studentName);
		System.out.println(constructor.registerNumber);
		System.out.println(constructor.address);
	}
}
