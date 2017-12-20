package advanced;

public class Main {
	
	public static void main(String[] args)
	{	
		primeNumbers(3000000);
	}

	public static void primeNumbers(int num)
	{
		boolean isPrime = true;
		int counter = 0;
		if (num >= 2)
		{
			System.out.println("2");
			counter++;
		}
		for (int i = 3; i<=num; i+=2)
		{
			isPrime = true;
			long sqrt = (long) Math.sqrt(i);
			for (int j = 2; j<=sqrt; j++)
			{
//				if (i == j)
//				{
//					System.out.println(i);
//				}
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
				
				//System.out.println("i=" + i + "j=" + j);
			}
			if (isPrime) {
			System.out.println(i);
			counter++;
			}
		}
		System.out.println("Number of prime numbers = " + counter);
	}

	
}

