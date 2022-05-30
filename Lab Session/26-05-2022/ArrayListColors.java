package corejava;
//Java Program For Array List Colors
	import java.util.*;  
	class ArrayListColors{  

		//Main Method
		public static void main(String args[]){  
			//Creating arraylist  
			ArrayList<String> list=new ArrayList<String>();
	
	// Add Elements to the array list
	list.add("Red");
	list.add("Green");  
	list.add("Yellow");  
	list.add("Orange");  
	
	//Traversing list through Iterator 
	Iterator itr=list.iterator();  
	while(itr.hasNext()){  
	
		//Output For Program
		System.out.println(itr.next());  
	}  
	}   

}

