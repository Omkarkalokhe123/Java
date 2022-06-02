package corejava;
//Java Program to demonstrate on FileOutputStream
import java.io.FileOutputStream;

public class FileOutputStrmExample {
	//Main Method
	public static void main(String args[]){    
		 //Try Block
           try{  
		      FileOutputStream fout=new FileOutputStream("E:\\myFile.txt");   //Creating FileReader object 
  
		  fout.write(90);    
		   fout.close();      
		   System.out.println("success...");   }
		  //Catch Block
		  catch(Exception e){
			  System.out.println(e);}     //Printing output
		  }   
}


