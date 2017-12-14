
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Task 8" + "\n");
		System.out.println(bunnyEars(50));
		
	}
	
	public static int bunnyEars(int a)
	{
		if (a == 0)
		{
			return 0;
		}
		if (a == 1)
		{
			return 2;
		}
		return bunnyEars(a-1) + bunnyEars(1);
	}

}
