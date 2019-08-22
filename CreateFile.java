import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args)
	{
		  
			Scanner Sobj = new Scanner(System.in);
			
			System.out.println("Enter File Name");
			String fileName = Sobj.nextLine();
			
			File file = new File(fileName);
			
			boolean fvar = false;
			
			try 
			{
				fvar = file.createNewFile();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			if(fvar == true)
			{
				System.out.println("File Created Successfully.");
			}
			else
			{
				System.out.println("File Creation failed.");
			}
			

	}
	

}
