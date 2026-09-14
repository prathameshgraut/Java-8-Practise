package FunctionallInterface.FI;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import typeOf_FunctionalInterface.Student;

public class FunctionInterface {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Ram", 60);
		
		Consumer<Student> s= std->System.out.println(std);
		s.accept(s1);
		
		Predicate<Student> p = std-> std.getMark()>=35;
		System.out.println(p.test(s1)); 
		
		Supplier<Student> sp =()-> s1;
		System.out.println(sp.get());
		
		Function<Student, Student> f = std -> std;
		System.out.println(f.apply(s1));
		
		
		BiPredicate<Integer, Integer> bp = (a,b)-> a>b;
		System.out.println(bp.test(10, 20));
		
		
		BiConsumer<Integer, String> bc = (p1,s2)->System.out.println(p1+s2);
		bc.accept(11, "Prathamesh");
		
		BiFunction<Integer, Integer, Integer> bf = (i1,i2)->i1+i2;
		System.out.println(bf.apply(10, 10));
	}
}
