package typeOf_FunctionalInterface;

import java.util.function.Predicate;

public class Voting {
	public static void main(String[] args) {
		//Predicate Functional Interface use for return boolean have test method
		
		Predicate<Integer> e = age-> {
			return age>=18;
		};
		System.out.println(e.test(25));
	}
}