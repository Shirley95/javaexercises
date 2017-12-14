
public class ReverseFactorial {
	boolean done = false;
	
	int input;
	int result;
	int divide = 2;
	
	public void cal(int input) {
	
	while(done == false)
	{
		input = input/divide;
		divide++;
		
		if (input == 1)
		{
			System.out.println(result);
			done = true;
			break;
		}
		if (input%divide != 0)
		{
			System.out.println("NONE");
			done = true;
			break;
		}
		result = input;
		
	}
}
}
