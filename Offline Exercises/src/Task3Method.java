import java.util.ArrayList;
import java.util.Collections;

public class Task3Method {
	ArrayList<Integer> nums = new ArrayList<Integer>();
	public boolean evenlySpaced(int a, int b, int c)
	{
		nums.add(a);
		nums.add(b);
		nums.add(c);
		
		Collections.sort(nums);
		if (nums.get(1) - nums.get(0) == nums.get(2) - nums.get(1))
		{
			return true;
		}
		else
		{
			return false;
		}
		// return nums.get(1) - nums.get(0) == nums.get(2) - nums.get(1) - one line
		
	}
}
