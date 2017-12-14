

public class Task1method {
	
	public String duplicateCharacters(String input)
	{
		String tmp = "";
		for (String a : input.split(""))
		{
			tmp += a;
			tmp += a;
			
		//	System.out.print(a);
		}
		return tmp;
	}
}
