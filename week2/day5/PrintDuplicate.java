package week2.day5;

public class PrintDuplicate{
public static void main(String[] args){

//Initialize the Arrays
int[] number={1,3,4,6,8,2,5,8,3,1};
//output 1,3,8

for(int i=0; i<number.length;i++){

    for(int j=i+1;j<number.length;j++){  // 0  0+1=j=1
                                         // 1 -==3
        if(number[i]==number[j]){
        	System.out.println(number[i]);
        }
                

}
}
}
}

