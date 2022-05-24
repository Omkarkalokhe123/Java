package corejava;
import java.util.Scanner;
public class inputArtOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create scanner class object
        Scanner sc= new Scanner(System.in);

        // Input two numbers from user
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        

        // Perform arithmetic operations.
        int add,sub,mul,div,mod;
        add=num1+num2;
        sub=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        mod=num1%num2;
        

        // Print result to console.
        System.out.println("addtion is: "+add);
        System.out.println("subtraction is: "+sub);
        System.out.println("multiplication is: "+mul);
        System.out.println("division is: "+div);
        System.out.println("Modulo is: "+mod);
	}

}
