package basicexercises;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1();
		ex2("Hi");
		System.out.println(ex3(0, 3, false));
		ex4();
		ex5();
		ex6();
		System.out.println();
		ex7();

	}
	
	public static void ex1()
	{
		System.out.println("Hello World");
	}
	
	public static void ex2(String s)
	{
		System.out.println(s);
	}
	
	public static int ex3(int a, int b, boolean c)
	{
		if (a == 0 && b != 0)
		{
			return b;
		}else if (a != 0 && b ==0)
		{
			return a;
		}
		
		if (c == true)
		{
			return a+b;
		}else
		{
			return a*b;
		}
	}
	
	// iteration
	public static void ex4()
	{
		for(int i = 0; i<10; i++) 
		{
			System.out.println(ex3(i, 4, false));
		}
	}
	
	//arrays
	public static void ex5()
	{
		int arrayofInt[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(ex3(arrayofInt[2], arrayofInt[4], true));		
	}
	
	// looping all the values of array in ex5
	public static void ex6()
	{
		int arrayofInt[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		for (int i =0; i <10; i++)
		{
			System.out.println(arrayofInt[i]);
		}
	}
	
	// iteration/arrays 2
	public static void ex7()
	{
		int arrayofInt[] = new int[10];
		for (int i =0; i <10; i++)
		{
			arrayofInt[i] = i;
			System.out.println(arrayofInt[i]);
		}
		System.out.println();
		for (int j = 0; j <10; j++)
		{
			arrayofInt[j] = arrayofInt[j]*10;
			System.out.println(arrayofInt[j]);
		}
		
	}
}






