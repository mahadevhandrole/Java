package org.vs;

public class Test2 {

	int x=100;
	
	public void m1()
	{
		int y=300;
		Interf i=new Interf()
				{
                     int x=200;
					@Override
					public void m1() {
						// TODO Auto-generated method stub
						System.out.println(this.x);//this refers the instance/local variable
						
						System.out.println(y);
						
					}
			
				};
				i.m1();
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 t2=new Test2();
		t2.m1();

	}

}
