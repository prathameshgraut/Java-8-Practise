package FunctionallInterface.FI;

import java.util.function.Predicate;
import java.util.function.Supplier;

import typeOf_FunctionalInterface.Student;

public class PredicateInterface {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Prathamesh",30);
		
		Predicate<Student> p = m-> m.getMark()>35;
		System.out.println(p.test(s1));
	}
}
