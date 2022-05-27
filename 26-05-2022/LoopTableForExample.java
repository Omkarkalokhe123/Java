package corejava;
import java.util.Scanner;
public class LoopTableForExample {
	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Create scanner class object
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a Number:");
			int num= sc.nextInt();
			int i,k;

			for (i=1;i<=10;i++){
				k = num* i;
				sc.close();
				System.out.println(k);
			}
		}
		
	}

