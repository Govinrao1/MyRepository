package mypack;

import java.util.Arrays;
import java.util.List;

public class Example105
{
	public static void main(String[] args)
	{
        List<Integer> numbers=Arrays.asList(2,3,4,5);
		numbers.stream().map(x->x*x).forEach(y->System.out.println(y));
	}
}
