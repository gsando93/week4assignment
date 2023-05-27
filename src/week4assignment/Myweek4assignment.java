package week4assignment;

import java.util.*;

public class Myweek4assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1:
int[] ages = {3, 9,23, 64, 2,8, 28, 93, 65};
System.out.println("The last element of the array is " + (ages[ages.length-1] - ages[0]));
int totalAge = 0;
for (int i=0; i < ages.length; i++) {
	totalAge += ages[i];
}
int avgAge = totalAge / ages.length;
System.out.println("The average age is " + avgAge);
//#2
String[] names = {"Sam", "Tommy", "Tim", "Sally", 
"Buck", "Bob"};
int totalStringLength = 0;
for (String name: names) {
	totalStringLength += name.length();
}
int avgNameLength = totalStringLength / names.length;
System.out.println("The average number of letters in a name is " + avgNameLength);
String nameList = "";
for (int j = 0; j<names.length; j++) {
	nameList += names[j] + " ";
	    
		}
	System.out.println("The names are " + nameList);
	
//#3 You access the last element of the array by returning
// the element in the length of the array minus one spot
// using the code array.length-1. This is because the index starts at 0.
	
//#4 You would use the code array[0] to
// access the first element, because the array index starts at 0.	

	
//#5
int[] nameLengths = new int[names.length];	
for (int i = 0; i < names.length; i++) {
	String namesInArray = names[i];
	nameLengths[i] = namesInArray.length();
}
System.out.print("The name lengths in order are: ");
for (int length : nameLengths) {
    System.out.print(length + " ");
	}
	
//#6 
int nameLengthTotal = 0;
for (int i = 0; i < nameLengths.length; i++) {
	nameLengthTotal += nameLengths[i];
}
System.out.println();
System.out.println("The number of characters is " + nameLengthTotal);

	
//#7 
String repeatedWord = multiplyWord("cow",5);
System.out.println(repeatedWord);

System.out.println(fullNameIs("Marky", "Mark"));
	}
public static String multiplyWord(String word,int n) {
		 
		String wordRepeated = "";
		for (int i = 0; i < n; i++) {
			wordRepeated += word; 
		}
		return wordRepeated;

		}
//#8
public static String fullNameIs(String firstName, String lastName) {
	return firstName + " " + lastName;
}

}

