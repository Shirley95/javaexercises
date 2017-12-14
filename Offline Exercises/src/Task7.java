
public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Task 7");
		System.out.println();
		
		System.out.println(fibonacciRecursion(8));

	}
	
	public static int fibonacciRecursion(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		if (n == 1)
		{
			return 1;
		}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}

}
