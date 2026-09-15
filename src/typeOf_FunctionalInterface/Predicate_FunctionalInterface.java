package typeOf_FunctionalInterface;

import java.util.function.Predicate;

public class Predicate_FunctionalInterface {
	public static void main(String[] args) {
		Student ss1 = new Student(1, "Prathamesh",78);
		// Supplier Functional Interface.

		Predicate<Student> s1 = ss-> {
			if(ss.getId()!=0)
				return true;
			return false;
		};
		System.out.println(s1.test(ss1));

	}

}