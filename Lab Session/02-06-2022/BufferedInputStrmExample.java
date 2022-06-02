package corejava;
//Java Program to demonstrate on BufferedInputStream
import java.io.BufferedReader; //import required file
import java.io.FileReader;

public class BufferedInputStrmExample {
	public static void main(String[] args)throws Exception {
	    //Creating FileReader object
		FileReader file =new FileReader("E:\\myFile.txt");
		
		//To read from the created file
		BufferedReader br=new BufferedReader(file);
		
		//Call Read Method By Using While Loop
		int i;
		while((i=br.read())!=-1){
			 System.out.print((char)i);
		}
	    //Call close Method

		br.close();
		file.close();
	}

}



