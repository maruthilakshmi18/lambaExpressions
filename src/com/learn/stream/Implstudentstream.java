package com.learn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Implstudentstream {

	public static void main(String args[]) {
		Student st3 = new Student();
		st3.setName("Laks");
		st3.setId(02);
		st3.setFee(10000);

		Student st1 = new Student();
		st1.setName("Sunee");
		st1.setId(04);
		st1.setFee(20000);

		Student st2 = new Student();
		st2.setName("Vasavi");
		st2.setId(05);
		st2.setFee(15000);

		ArrayList<Student>st=new ArrayList<Student>();
		st.add(st1);
		st.add(st2);
		st.add(st3);
		
		st.stream().filter(sts -> {
		if(sts.getFee()>10000)
		{
			return true;
		}
		return false;
	}).forEach(sts->
	{
		System.out.println(sts);	
	});
		
//		System.out.println(stt.size());
		
		
				
		
}
	
}
