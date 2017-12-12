package basicexercises;

import java.util.ArrayList;

public class intermediate {
	// creating empty ArrayList
	static ArrayList<Person> personList = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(blackJack(3, 45));
		System.out.println(uniqueSum(10, 10, 10));
		System.out.println(tooHot(100, false));
		
		// constructor for Person class
		// creating objects from Person class
		Person p1 = new Person("Jane", 23, "Teacher");
		Person p2 = new Person("Ted", 40, "CEO");
		Person p3 = new Person("Jeremy", 28, "Manager");
		
		// add p1, p2, p3 into personList
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		showPeopleList(personList);
		System.out.println(searchPerson(personList, "bob"));
		
		
	}
	
	public static int blackJack(int a, int b)
	{
		int result = 0;
		if (a > b && a <=21)
		{
			result = a;
		}else if (b > a && b <= 21)
		{
			result = b;
		}else if (b > 21 && a<= 21)
		{
			result = a;
		}
		else if (a > 21 && b <= 21)
		{
			result = b;
		}
		return result;
	}
	
	public static int uniqueSum(int a, int b, int c)
	{
		int result = 0;
		if (a != b && b!=c && a!=c)
		{
			result = a+b+c;
		}
		else if (a==b && b==c && a==c) 
		{
			result = 0;
		}
		else if (a == b && a!= c)
		{
			result = c;
		}
		else if (a == c && a!= b)
		{
			result = b;
		}
		else if (b==c && a!=b)
		{
			result = a;
		}
		return result;
	}
	
	public static boolean tooHot(int temp, boolean isSummer)
	{	
		int a = 60, b = 90;
		if (isSummer)
		{
			b = 100;
		}
		if (temp >= a && temp <= b)
		{
			return true;
		}else
		{
			return false;
		}
		
		
	}
	
	// from Person class
	public static void showPeopleList(ArrayList<Person> personList)
	{
		// looping through the Person through the personList
		for (Person i : personList)
		{
			System.out.println(i.toString());
		}
	}
	
	public static Person searchPerson(ArrayList<Person> personList, String name)
	{
		for (Person i : personList)
		{
			if (i.getName().equals(name))
			{
				return i;
			}
		}
		return null;
	}
	
	
	
	
	
}
