package mypack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example101
{
	public static void main(String[] args)
	{
		List<String> names=Arrays.asList("abdul","kalam","steave","sisters");
		List<String> result=names.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
	}
}
