package mypack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Example102
{
	public static void main(String[] args)
	{
		List<String> names=Arrays.asList("abdul","abdul","steave","sisters","steave");
		//Get distinct strings in list via stream concept
		List<String> result=names.stream().distinct().collect(Collectors.toList());
        System.out.println(result);
        //Get distinct strings in list via via logic
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        for(String name:names)
        {
        	if(hm.containsKey(name)) 
			{
				hm.put(name,hm.get(name)+1); //if name exits as key, increase value by 1.
			}
			else
			{
				hm.put(name,1); //if name does not exist as key, enter as a new entry.
			}
        }
        System.out.println(hm.keySet());  
        System.out.println(hm);  
	}
}





