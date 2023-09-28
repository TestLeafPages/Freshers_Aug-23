package week3.day3;

public  class PrintEachCharacter{

public static void main(String[] args){

//Initialize the String
String text="GoodMorning";
//convert the String into char Array
 char[] eachCharacter =text.toCharArray();

//Iterate the values from eachCharacter
for(int i=0;i<eachCharacter.length;i++){
System.out.println(eachCharacter[i]);
}
}
}