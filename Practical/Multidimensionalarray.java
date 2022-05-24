package corejava;

public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declaring aand intializing multidimensional array
		int a[][]={{2,5,9},{5,8,6},{1,3,4}};
		
		//printing array
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+"  ");
				System.out.println(  );
			}
}
}