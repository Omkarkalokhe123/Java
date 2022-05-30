package corejava;
// Java Program For Average Array
import java.util.Scanner;
	 
	 class AverageArrayUserInput {
		//Main Method
	    public static void main(String[] args) {
	 
	        // reading the array size.
	        Scanner s = new Scanner(System.in);
	 
	        System.out.println("Enter array size: ");
	        int size = s.nextInt();
	        // create an array
	        int[] array = new int[size];

	        
	        // reading values from user keyboard
	        System.out.println("Enter array values :  ");
	        for (int i = 0; i < size; i++) {
	            int value = s.nextInt();
	            array[i] = value;
	 
	        }
	 
	        // getting array length
	        int length = array.length;
	 
	        // default sum value.
	        int sum = 0;
	 
	        // sum of all values in array using for loop
	        for (int i = 0; i < array.length; i++) {
	            sum =sum 
	            		+ array[i];
	        }
	 
	        double average = sum / length;
	 
	        // Output of Program
	        System.out.println("Average of array : " + average);
	 
	    }
	 
	}

