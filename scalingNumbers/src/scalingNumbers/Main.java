package scalingNumbers;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
	
	static String[] shortS = {"", "thousand", "million", "billion", "trillion", "quadrillion", "qunitillion", "sextillion"}; // English	
	static String[] longS = {"", "thousand", "million", "millard", "billion", "billard", "trillion", "trillard"}; // French
						
	static HashMap<String, String> hmap2 = new HashMap<>();
	
	public static void main(String[] args)
	{
		boolean a;
		String userInput;
		do {
			System.out.println("Type your number");
			Scanner input = new Scanner(System.in);
			userInput = input.nextLine();
			a = checkType(userInput);
		} while (!a);
		convert(userInput);		
	}
		
	public static boolean checkType(String a)
	{
		String regex = "^\\d+$"; // change into do-while loop
		if (!a.matches(regex)) //do 
		{
			return false; // if it was a word
		}
		else
		{
			return true; // while
		}
	}
	
	public static void convert(String a)
	{
		int c = a.length()/3;
		
		String shortString = "";
		String longString = "";
		
		for (int i = c-1; i>=0; i--)
		{	
			int remainder = a.length()%3;
			if (remainder == 0)
			{
				remainder = 3;
			}

			if (c < 1)
			{
				System.out.println(a);
			}
			
			String newString = a.substring(0, remainder);
			shortString += newString + " " + shortS[i];
			longString += newString + " " + longS[i];
			a = a.substring(remainder); // separating string from remainder upwards
			
			if (i == 1)
			{
				shortString += " and ";
				longString += " and ";
			}
			else if (i != 0) {
				shortString += ", ";
				longString += ", ";
			}
		}
		
		System.out.println("Short scale: " + shortString + "\nLong scale: " + longString);
	}

}
