package mypack;

import java.util.Arrays;
import java.util.List;

public class Example103
{
	public static void main(String[] args)
	{
		List<String> names=Arrays.asList("abdul","kalam","steave","sisters");
		long l=names.stream().count();
        System.out.println(l);
	}
}
