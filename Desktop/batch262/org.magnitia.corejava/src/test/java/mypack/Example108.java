package mypack;

import java.util.Arrays;
import java.util.List;

public class Example108
{
	//Constructor methods
	public Example108() //without arguments
	{
		System.out.println("object has created");
	}

	public Example108(int x) //with arguments
	{
		System.out.println(x);
	}
	//Operational methods
	public void method1(int x) //non-static method
	{
		System.out.println(x);
	}
	
	public static void method2(int x) //static method
	{
		System.out.println(x);
	}
	//Runner method
	public static void main(String[] args) 
	{
		//call non-static method using "." operator
		Example108 obj1=new Example108();
		obj1.method1(105);
		//call non-static method using "::" operator
		List<Integer> l1=Arrays.asList(2,5,7,9);
		l1.forEach(obj1::method1);
		
		//call static method using "." operator
		Example108.method2(105);
		//call static method using "::" operator
		l1.forEach(Example108::method2);
		
		//call constructor method 
		Example108 obj2=new Example108(1902);
		//call constructor method using :: operator
		l1.forEach(Example108::new);	
	}
}




