package mypack;

import java.util.Arrays;

public class Example133deleteduplicate extends Thread
{
	public static void main(String[] args)
	{
		//without removing space
		String info="I am in india";  
		info=info.toLowerCase();
        //Converting string to character array  
        char str[]=info.toCharArray();  
        //Calculating length of the character array  
        int len = str.length;     
        int index = 0;   
        // Traversing character array  
        for(int i=0; i<len; i++)   
        {   
            //Check whether str[i] is present before or not   
            int j;   
            for(j=0;j<i;j++)    
            {   
                if(str[i]==str[j] && str[i]!=' ')   
                {   
                    break;   
                }   
            }   
            // If the character is not present before, add it to resulting string   
            if(j==i)    
            {   
                str[index++]=str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str,index)));   
	}
}







