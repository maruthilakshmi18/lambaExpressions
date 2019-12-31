package com.learn.stream;

public class Impli {

	public static void main(String[] args) {

		//annonamus inner class-has no name and directly can implement the mehtod of interface
		Base b=new Base()
				{
			@Override
			public void something(int i)
			{
				System.out.println(" "+i);
			}			
		
			/*@Override
			public void operate(int j)
			{
				System.out.println(""+j);
			}
				};
								
				b.operate(700);*/
				};
				b.something(10000);
	}
	
	}