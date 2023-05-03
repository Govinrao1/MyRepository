package mypack;

public class Inheritance 
{
	public static void main(String args[])
	 {
		Bike obj1=new Bike();//own-casting(static binding)
		obj1.run();  //run() method in Bike class
		
	    Splendor obj2=new Splendor();//own-casting(static binding)
	    obj2.run();  //run() method of Splendor class
	    
	    //up-casting(dynamic binding) 
	    Bike obj3=new Splendor(); 
	    obj3.run(); //run() method of Splendor class
	    
	    //down-casting(dynamic binding) 
	    Bike obj4=new Splendor(); //up-casting(dynamic binding)
	    Splendor obj5=(Splendor) obj4; //down-casting(dynamic binding) 
	    obj5.run(); //run() method of Splendor class
	 }
}
