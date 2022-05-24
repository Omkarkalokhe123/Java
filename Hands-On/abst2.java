package corejava;

 class abst2 extends abst1 {
	 public int Add(int n1, int n2) { return n1+n2; 
	 } 
	 public int Sub(int n1, int n2) { 

	 	 return n1-n2; 
	 }
 
	 public static void main (String[] args) { 
       
	 
		 abst1 a=new abst2();  
		 System.out.println("Addition: " + a.Add(10, 50));
		 System.out.println("Substraction: " + a.Sub(10, 8));

	 }
 }