package com.learn.stream;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Implstream {

	public static void main(String args[]) {

		/*
		 * Base b=(i)->{System.out.println("result" +i); System.out.println("result is"
		 * +i); }; b.something(20000);
		 */

		//predicate --return boolean and use test()
		Predicate<Integer> b = (i) -> {
			System.out.println("result" + i);
			System.out.println("value is" + i);

			if (i > 50000) {
				return true;
			}
			return false;

		};

		
		//consumer--for void, and use accept()
		Consumer<Integer> s = (i) -> {
			System.out.println("output" + i);

			if (i < 5) {
				i += 100;
				System.out.println("print " + i);
			}
			// return true;

		};
		System.out.println(b.test(20000));
		s.accept(3);

	}
}
