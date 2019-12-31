package com.nisum.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AImpl {

	public static void main(String[] args) {
		/*
		 * A a = new AImpl(); 
		 * A a2= new A() {
		  
		 * @Override 
		 * public void someValue(int i) { System.out.println("value "+i); // }
		 * // // @Override // public void some(int j) { //
		 * System.out.println("value "+j); // // } // }; // a2.someValue(3); //
		 * a2.some(6);
		 */
		/*
		 * A a = (i) -> {System.out.println("value "+i); System.out.println("value "+i);
		 * }; a.someValue(2);
		 */
//		
//		A a1 = (j) -> System.out.println("value "+j);
//		a1.some(3);
		/*
		 * Predicate<Integer> a = (i) -> { if(i==10) { return true; } return false; };
		 */

//		Predicate<Integer> a = (i) -> {
//			if(i.getSal()<100) {
//				return true;
//			}
//			return false;
//		};

		/*
		 * List<Integer> list = new ArrayList<Integer>(); list.add(10); list.add(20);
		 * list.add(30); list.stream().filter(a).map(i-> i*10).forEach(i->
		 * System.out.println(i));
		 * System.out.println(""));
		 */

		B b1 = new B();
		b1.setEmpId(1);
		b1.setName("lakshmi");
		b1.setSal(2200);

		B b2 = new B();
		b2.setEmpId(1);
		b2.setName("lakshmig");
		b2.setSal(50);

		List<B> emps = new ArrayList<B>();
		emps.add(b1);
		emps.add(b2);

		List<B> emp2 = emps.stream().filter(emp -> {
			if (emp.getSal() < 100) {
				return true;
			}
			return false;
		}).collect(Collectors.toList());

		System.out.println(emp2.size());

//				collect(Collectors.toList());

//		for(Integer i : list1) {
//			System.out.println(i);
//		}

	}

	/*
	 * List<Integer> list = new ArrayList<Integer>(); list.add(10); list.add(20);
	 * list.add(30); List<Integer> list1 = list.stream().filter(i-> {if(i==10) {
	 * return true; } return false;
	 * 
	 * 
	 * }).collect(Collectors.toList());
	 * 
	 * for(Integer i : list1) { System.out.println(i); }
	 * 
	 * }
	 */

	// a.test(2);

	/*
	 * BoolInterface b = (i) -> { if(i==0) { return true; } return false; };
	 * a.test(2);
	 * 
	 * }
	 */

}
