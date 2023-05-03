package mypack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example100
{
	public static void main(String[] args)
	{
		List<String> names=Arrays.asList("abdul","kalam","Steave","sisters");
		List<String> result=names.stream().filter(x->x.toLowerCase().contains("st"))
				                                              .collect(Collectors.toList());
        System.out.println(result);
	}
}
