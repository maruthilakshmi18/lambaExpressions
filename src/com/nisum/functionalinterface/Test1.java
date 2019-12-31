package com.nisum.functionalinterface;

import java.util.function.Predicate;

public class Test1 {
	
	public boolean testMe(Predicate<Integer> val,Integer i) {
		return val.test(i);
		
	}
	
	public boolean test1(BoolInterface val,Integer i) {
		return val.test(i);
		
	}
	
	public static void main(String[] args) {
		Test1 test = new Test1();
//		Predicate<Integer> a = (i)-> {
//			if(i<1000) {
//				return true;
//			}
//			return false;	
//		};
//		
//		BoolInterface b = (i)-> {
//			if(i<1000) {
//				return true;
//			}
//			return false;	
//		};
		
		test.testMe((i)-> {
			if(i<1000) {
				return true;
			}
			return false;	
		},200);
		
		test.test1((i)-> {
			if(i<1000) {
				return true;
			}
			return false;	
		}, 200);
	}
		
		
		
	

}
