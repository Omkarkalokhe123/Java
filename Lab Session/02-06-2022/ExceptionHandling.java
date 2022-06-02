package corejava;
// Java Program to Create a file using Exception Handling

import java.io.FileInputStream; //import required File

public class ExceptionHandling {
     // Main Method
	public static void main(String args[]){    
		//Try Block
		try {    
			FileInputStream fin=new FileInputStream("E:\\myFile.txt");   //Creating FileReader object 
		 // Creating Variable
			int O=0;    
		  while((O=fin.read())!=-1){   //Call Read Method By Using While Loop 
		 System.out.print((char)O);    
		  }    
		  fin.close();    
		 } //Catch Block
		catch(Exception e){    
			 System.out.println(e);  // Printing output
		 }        
		}   
}


