package corejava;

 class simpleInherit {
public void print() {
	System.out.println("OMKAR");
}
}
class SimpleOne extends simpleInherit {
public void show() {
	System.out.println("KALOKHE");
}
}
class RunMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SimpleOne s= new SimpleOne();
s.print();
s.show();
s.print();
s.show();
	}

}
