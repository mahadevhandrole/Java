package org.vs;



public class Test {

	int x=10;
	public void m1()
	{
		
		int y=20;
		
		Interf i=()->
		{
			int x=30;
			System.out.println(x);
			System.out.println(this.x);//this refers the global variable
			System.out.println(y);
			
			//y=40;//CE: Local variable y defined in an enclosing scope must be final or effectively final 
			
		};
		
		i.m1();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.m1();

	}

}
