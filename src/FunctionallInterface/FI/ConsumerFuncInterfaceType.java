package FunctionallInterface.FI;

import java.util.function.Consumer;

import typeOf_FunctionalInterface.Student;

public class ConsumerFuncInterfaceType {
	public static void main(String[] args) {
		Consumer<Integer> c = a -> System.out.println("Addition :"+(a+a));
		c.accept(10);
		
		
		
		Employee e1 = new Employee(1, 500000);
		Consumer<Employee> s = emp -> System.out.println(emp.getSal()*0.3);
		s.accept(e1);
		

//		c.add(10, 20);
	}
}


//interface calculator{
//	void add(int a,int b);
//}

//class calculatorImpl implements calculator{
//
//	@Override
//	public void add(int a, int b) {
//		System.out.println("Addition :"+(a+b));
//		
//	}
//	
//}
