
public class Task4Method {
	public String nTwice(String a, int n)
	{
		String firstBit = a.substring(0, n);
		String lastBit = a.substring(a.length()-n);
		return firstBit + lastBit;
	}
}
