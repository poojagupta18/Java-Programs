import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



class FileOpen
{  
	public static void main(String args[])
	{  
		Scanner Sobj = new Scanner(System.in);
		
		System.out.println("Enter File Name");
		String fileName = Sobj.nextLine();
		
		
		try 
		{
			FileInputStream fin = new FileInputStream(fileName);
			
			System.out.println("File opened successfully.");
			
			fin.close();
		} 
		catch (FileNotFoundException e) 
		{	
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}  
	} 
}