package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import FunctionallInterface.FI.Employee;

public class Test4 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, 45800, "Pune");
		Employee e2 = new Employee(2, 25400, "Mumbai");
		Employee e3 = new Employee(3, 35600, "Jalgaon");
		Employee e4 = new Employee(4, 45050, "Mumbai");
		Employee e5 = new Employee(5, 78520, "Pune");
		Employee e6 = new Employee(6, 45120, "Pune");

		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e4, e5, e6);
		System.out.println(list.stream().filter(t -> t.getCity() == "Mumbai").toList());

		List<Integer> li = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
		System.out.println(li.stream().map(t->t>50?t*2:t).toList());
		
		List<String> l = Arrays.asList("abc","aabca","fdaca");
		System.out.println(l.stream().map(t->t.replace("a", "") ).toList());
	}
}

