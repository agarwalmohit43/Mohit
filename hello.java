import java.lang.*;
import java.util.*;

class hello{

	public static void main(String[] args)
	{
		System.out.println("Hello world!");
		
		long millis=System.currentTimeMillis();
		System.out.println(millis);   
		Date date=new Date(millis);  
		System.out.println(date);  
	}
}
