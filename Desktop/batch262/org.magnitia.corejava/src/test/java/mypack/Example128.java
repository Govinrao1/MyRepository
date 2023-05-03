package mypack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;

public class Example128
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> x=new HashMap<Integer,String>();			
		x.put(10,"abc");  //insert a pair(Key,value)
		x.put(null,"pqr"); //accepted(Key is NULL)
		x.put(11, null); //accepted(Value is NULL)
		x.put(11, null); //duplicate pairs accepted(Overwriting)
		
		Hashtable<Integer,String> y=new Hashtable<Integer,String>();
		y.put(10,"abc"); //insert a pair(Key,value)
		y.put(null,"pqr"); //rejected(Key is NULL)
		y.put(11, null); //rejected(Value is NULL)
		y.put(11, "pqr");
		y.put(11, "pqr"); //duplicate pairs accepted(Overwriting)

		TreeMap<Integer,String> z=new TreeMap<Integer,String>();
		z.put(10,"abc"); //insert a pair(Key,value)
		z.put(10,"abc"); //duplicate values are accepted(Overwriting)
		z.put(null,"pqr"); //rejected(Key is NULL)
		z.put(11, null); //accepted(Value is NULL)
		
		//"HashSet" is competitor to "ArrayList"
		HashSet<String> w=new HashSet<String>();
		w.add(null); //accepted
		w.add(null); //rejected(One NULL only)
		w.add("Kalam");
		w.add("Kalam");//rejected, cannot allow duplicates
	}
}
