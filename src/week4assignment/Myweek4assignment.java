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

	 
String repeatedWord = multiplyWord("cow",5);
System.out.println(repeatedWord);

System.out.println(fullNameIs("Marky", "Mark"));
	}
	
	//#7
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

//#9
public static boolean checkArraySum(int[] newArray) {
	int arraySum = 0;
	for (int i=0; i < newArray.length; i++) {
		arraySum += newArray[i];
	}
	if (arraySum < 100) {
		return false;
	} else return true;
}

//#10
public static double arrAverage(double[] newArray) {
	double arrSum = 0;
	for (int i = 0; i < newArray.length; i++) {
		arrSum += newArray[i];
	}
	double arrayAvg = arrSum / newArray.length;
	return arrayAvg;
}

//#11
public static boolean avgCheck(double[] newArray, double[] arrayTwo) {
	double arrSumOne = 0;
	for (int i = 0; i < newArray.length; i++) {
		arrSumOne += newArray[i];
	}
	double arrayAvgOne = arrSumOne / newArray.length;
	double arrSumTwo = 0;
	for (int i = 0; i < newArray.length; i++) {
		arrSumTwo += newArray[i];
	}
	double arrayAvgTwo = arrSumTwo / arrayTwo.length;	
	if (arrayAvgOne > arrayAvgTwo) {
		return true;
	} else return false;
}

//#12
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	if (isHotOutside == true && moneyInPocket > 10.50) {
		return true;
	} else return false;
}

//#13 With the rising concerns about how rapidly ai is developing,
//ai's need a killswitch so that we don't end up
//in a bit of a pickle like John and Sarah Connor. 
public static boolean destroyAllHumans(boolean askedNicelyNotTo) {
	if (askedNicelyNotTo == true) {
		System.out.println("Hasta la vista, baby.");
		return false;
	} else {
		System.out.println("I'll be back.");
		return true;
	}
}


}

