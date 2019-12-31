package com.learn.stream;

import java.util.ArrayList;
import java.util.Iterator;

public class Implstudent {

	public static void main(String args[]) {
		Student st = new Student();
		st.setName("Laks");
		st.setId(02);
		st.setFee(10000);

		Student st1 = new Student();
		st1.setName("Sunee");
		st1.setId(04);
		st1.setFee(20000);

		Student st2 = new Student();
		st2.setName("Vasavi");
		st2.setId(05);
		st2.setFee(15000);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st);
		list.add(st1);
		list.add(st2);
		// System.out.println(list.size());
		
		ArrayList<Integer>al2=new ArrayList<Integer>();

		for (Student sts : list) {
			// System.out.println("names are:"+sts.getName()+" id are:"+sts.getId()+" fees
			// are:"+sts.getFee());

			if (sts.getFee() > 10000)

			{
				//System.out.println(sts.getFee());
				al2.add(sts.getFee());
				
				
			}
			

		}
		
		System.out.println(al2);
		al2.remove(1);
		System.out.println(al2);
		
		
		/*System.out.println(list.size());
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
//			System.out.println(iterator.next().getFee());
			Student next = iterator.next();
			
			if(next.getFee()<=10000) {
				iterator.remove();
			}
		}System.out.println(list.size());
*/
	}
}
	
