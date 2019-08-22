import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile
{
	
	public static void main(String[] args)
	{
		Scanner Sobj = new Scanner(System.in);
		
		System.out.println("Enter File Name");
		String fileName = Sobj.nextLine();
		
		try
		{  
	     	FileInputStream fin = new FileInputStream(fileName);  
	    	int i=0; 
	    	
	    	while((i = fin.read())!=-1)
	    	{  
	    		System.out.print((char)i);  
	    	}  
	    	
	    	fin.close();  
		}
		catch (FileNotFoundException e) 
		{	
			System.out.println("File not found.");
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}   
	}  
	
	

}
