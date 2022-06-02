package corejava;
// Java Program to demonstrate on FileInputStream 
import java.io.FileInputStream;  //import required File

public class FileInputStrmExample {

	// Main Method
		public static void main(String args[]){    
			try {    // Try block
				FileInputStream fin=new FileInputStream("E:\\myFile.txt");    //Creating FileReader object 

			 // Creating Variable
				int O=0;    
			  while((O=fin.read())!=-1){    //Call Read Method By Using While Loop 
			 System.out.print((char)O);    
			  }    
			  fin.close();    
			 }
			//Catch Block
			catch(Exception e){   
				 System.out.println(e);  // Printing output
			 }        
			}   
}


