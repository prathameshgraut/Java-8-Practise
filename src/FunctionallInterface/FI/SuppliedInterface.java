package FunctionallInterface.FI;

import java.util.function.Supplier;

import typeOf_FunctionalInterface.Student;

public class SuppliedInterface {
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Jay",45);
//		studentService ss = s -> s;
//		System.out.println(ss.std(s1));
		
		Supplier<Student> s11 = ()-> s1;
		System.out.println(s11.get());
	}
}



//interface studentService{
//	Student std(Student s);
//}

//class studentServiceimpl implements studentService{
//
//	@Override
//	public Student std(Student s) {
//		return s;
//	}
//	
//}