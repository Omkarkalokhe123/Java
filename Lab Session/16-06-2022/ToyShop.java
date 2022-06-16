package corejava;
// Import Packages
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;

	// Creating a Class
	class ToyShop {
		//Creating multidimentional String Array
	    String[][] toys = new String [5][5]; 
	 
	    //Creating a Constructor
	    ToyShop() 
	    {
	    toys [0][0]="1";
	    toys[0][1]="RC Motor Car"; 

	    toys [1][0]="2";
	    toys [1][1] ="Remote Robot ";

	    toys [2][0]="3";
	    toys [2][1]="Teddy Bear";

	    toys [3][0]="4";
	    toys [3][1]="Pikachu Soft Toy";

	    toys [4][0]="5";
	    toys[4][1]="Doraemon Soft Toy";

	    }
         //Static Get toy method
	    public static String getToy(int price)
	    {
	        String ToyName;
	        // Prize for each toy using switch case
	        switch(price)
	        {
	            case 650: 
	                ToyName = "RC Motor Car";
	                return ToyName;
	            
	            case 550:
	                ToyName = "Remote Robot";
	                return ToyName;
	                
	            case 300:
	                ToyName = "Teddy Bear";
	                return ToyName;
	                
	            case 350:
	                ToyName = "Pikachu Soft Toy";
	                return ToyName;
	                
	            case 250:
	                ToyName = "Doraemon Soft Toy";
	                return ToyName;
	                
	            default:
	                ToyName = "No Toys Available in this Range";
	                return ToyName;
	        }
	    }

	    public static void main(String[] args) {
	    	// Ceating object of  Scanner class  
	    	Scanner sc = new Scanner (System.in); 
	        int price = sc.nextInt ();

	        System.out.println(getToy(price));

	        sc.close();
	    }
	}

