import java.util.ArrayList;
import java.util.Arrays;


public class CalculatingMethod {
	

	public ArrayList<String> calculate(int... a) {
		ArrayList<String> resultList = new ArrayList<String>();
		Arrays.sort(a);

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = a.length - 1; k > j; k--)
					if (a[i] * a[j] == a[k]) {
						resultList.addAll(callPrint(a[i], a[j], a[k]));
					}
			}
		}
		return resultList;
		
	}
	
	public ArrayList<String> callPrint(int a, int b, int c)
	{	
		ArrayList<String> returnArray = new ArrayList<String>();
		returnArray.add(a + " * " + b + " = " + c);
		returnArray.add(c + " / " + a + " = " + b);
		returnArray.add(c + " / " + b + " = " + a);
		
		return returnArray;
		
	}
}
