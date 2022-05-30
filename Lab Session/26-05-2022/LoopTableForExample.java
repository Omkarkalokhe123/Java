package corejava;
//Java Program For Multipication Table
import java.util.Scanner;
 class LoopTableForExample {

// Main Method
		public static void main(String[] args) {
		
			// Create scanner class object
			Scanner sc= new Scanner(System.in);
			// Input From User
			System.out.println("Enter a Number:");
			int num= sc.nextInt();
			
			// Creating Variable
			int i,k;
			for (i=1;i<=10;i++){
				k = num* i;
			sc.close();
		
			// Printing the Output
			System.out.println(k);
			}
		}
		
	}

