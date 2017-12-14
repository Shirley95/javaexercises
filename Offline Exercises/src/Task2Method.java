
public class Task2Method {
	
	public String findBetween(String input)
	{
		if (input.contains("bread"))
		{
			int firstBread = input.indexOf("bread");
			int lastBread = input.lastIndexOf("bread");
			if (firstBread == lastBread)
			{
				return "";
			}
			else
			{
				return (input.substring(firstBread+5, lastBread));
			}
			
			
		}
		return "";
	}
}
