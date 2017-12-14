
public class Task6Method {
	public String stringClean(String a)
	{
		// creating an object from StringBuilder class
		StringBuilder newString = new StringBuilder();
		for (int i = 0 ; i < a.length(); i++) 
		{
			char c = a.charAt(i);
			/* c is a character and endsWith is a string method therefore concatenate with an empty string
			 allows 'string c' to use the endsWith method
			 */
			if (!newString.toString().endsWith(c+"")) //converting object to string in order to endsWith m
			{
				newString.append(c);
			}
		}
		return newString.toString(); // newString is an object, need to convert to string
	}
}
