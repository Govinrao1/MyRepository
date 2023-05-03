package mypack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example111withregexp
{
	public static void main(String[] args)
	{
		//Take a sentence
		String x="AA!45aaa";
		//7 characters to 10 characters, but in it at least 1 digit, 1 uppercase letter, 1 lowercase letter and one special character.
	    Pattern r=Pattern.compile("^(?=(.*[a-z]){1,})(?=(.*[A-Z]){1,})(?=(.*[0-9]){1,})(?=(.*[!@#$%\\^&*()\\-__+\\.]){1,}).{7,10}$"); 
	    Matcher m=r.matcher(x);
	    while(m.find()) 
	    {
	    	System.out.println(m.group()); 
	    }
	    //use https://rubular.com/ for manual verification
	    // ^(?!(.*__))(?!(.*_$))(?!(^_.*))(?=(.*_){1,})[a-zA-Z0-9_]{7,10}$
	    // ^([a-zA-Z0-9_\-\.]+)[@]([a-zA-Z0-9_\-\.]+)[\.]([a-zA-Z]{2,5})$ 
	}
}





