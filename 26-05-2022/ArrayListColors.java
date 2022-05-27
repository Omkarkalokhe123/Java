package corejava;

	

	import java.util.*;  
	class ArrayListColors{  
	public static void main(String args[]){  
	ArrayList<String> list=new ArrayList<String>();
	list.add("Red");
	list.add("Green");  
	list.add("Yellow");  
	list.add("Orange");  
	
	Iterator itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}   

}

