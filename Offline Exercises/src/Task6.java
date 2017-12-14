
public class Task6 {
	public static void main(String[] args)
	{
		System.out.println("Task 6");
		System.out.println();
		
		Task6Method methodCalling = new Task6Method();
		System.out.println(methodCalling.stringClean("yyzzza"));
		System.out.println(methodCalling.stringClean("abbbcdd"));
		System.out.println(methodCalling.stringClean("Hello"));
	}
}
