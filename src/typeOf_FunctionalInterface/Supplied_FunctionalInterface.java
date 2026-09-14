package typeOf_FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Supplied_FunctionalInterface {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Prathamesh",78);
		
//		StudentService ss = new studentserviceimple();
//		System.out.println(ss.std(s1));
		
		Function<Student,String> ss =s ->  s.getName();
		System.out.println(ss.apply(s1));
		
		Supplier<Student> sss=()->{
			return s1;
		};
		System.out.println(sss.get());
	}
}


interface StudentService {
	Student std(Student s);
}

class studentserviceimple implements StudentService{

	@Override
	public Student std(Student s) {
		return s;
	}
	
}