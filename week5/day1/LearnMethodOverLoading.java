package week5.day1;

public class LearnMethodOverLoading {

	
	public void add() {
		
	}
	
public void add(int a,int b) {
		System.out.println(a+b);
	}

public void add(int a,int b,int c) {
	System.out.println(a+b+c);
}

public void add(int a,String name ) {
	
}

public void add(String name ,int a) {
	
}

public static void main(String[] args) {
	
	LearnMethodOverLoading ol=new LearnMethodOverLoading();
	
	ol.add(4, 7);
	ol.add(3, 10, 7);
}



}
