
public class Task3 {
	public static void main(String[] args)
	{
		Task3Method method = new Task3Method();
		
		System.out.println("Task 3");
		
		System.out.println();
		System.out.println(method.evenlySpaced(2, 4, 6));
		System.out.println(method.evenlySpaced(4, 6, 2));
		System.out.println(method.evenlySpaced(4, 6, 3));
	}
}
