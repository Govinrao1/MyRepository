package mypack;

public class Example131
{
	public void finalize()   
    {   
        System.out.println("Done");   
    } 
	public static void main(String[] args) throws Exception
	{
		//1. Create an object to class
	    Example131 obj=new Example131();   
	    //2. Use that object to call properties and methods
        System.out.println(obj.hashCode());
        //3. Make object as NULL and call garbage collector method
        obj=null;   
        System.gc();   
        System.out.println("end of garbage collection");   
    }     
}  


