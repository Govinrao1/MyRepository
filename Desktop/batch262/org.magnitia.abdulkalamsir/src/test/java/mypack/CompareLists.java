package mypack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareLists
{
	public static void main(String[] args)
	{
		List<String> list1 = Arrays.asList("milan", "dingo", "hafil","meat");
		
		List<String> list2 = Arrays.asList("hafil", "milan", "dingo", "meat");
		// intersection as set
		Set<String> intersect = new HashSet<String>(list1);
		intersect.retainAll(list2);
		if(intersect.size()==list1.size() && list1.size()==list2.size())
	    {
	    	System.out.println("same lists");
	    }
	    else
	    {
	    	System.out.println("different lists");
	    }
	}
}
