package ParallelStreamGroupBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group By Means Group Of Row Same Value In Specific Column using By Aggregative Function Like min,Max,avg,Count etc.. 

public class PSGroupBy {
	public static void main(String[] args) {
//		Employee e1 = ;
//		Employee e2 = ;
//		Employee e3 = new Employee;
//		Employee e4 = ;
//		Employee e5 = ;

//		Directly pass new object inside asList(//here); 
//		List<Employee> l1 = Arrays.asList(e1,e2,e3,e4,e5);

		List<String> list1 = Arrays.asList("HR", "IT");
		List<String> list2 = Arrays.asList("Product", "IT", "Deploy");
		List<String> list3 = Arrays.asList("Cunslatant", "Sevice");

		List<Employee> ls = Arrays.asList(new Employee(1, "Prathamesh", "Pune", 25000, list1),
				new Employee(2, "Harshal", "Jalgaon", 32400, list2), new Employee(3, "Bhavesh", "Pune", 10000, list2),
				new Employee(4, "Om", "Pune", 45000, list3), new Employee(5, "Vaibhav", "Mumbai", 30000, list1));

		// print Employee list
		System.out.println(ls);

		List fs = ls.stream().map(e -> e.getDepth()).toList();
		System.out.println(fs);

		List fss = ls.stream().flatMap(e -> e.getDepth().stream()).toList();
		System.out.println(fss);

		// group by use group of row have same value in specific column by using
		// Aggregative function

		Map<String, List<Employee>> em = ls.stream().collect(Collectors.groupingBy(e -> e.getCity()));
		System.out.println(em);

		Map<Object, List<Employee>> em1 = ls.stream().collect(Collectors.groupingBy(e -> e.getDepth()));
		System.out.println("\n" + em1);

		Map<Integer, List<Employee>> ms = ls.stream().collect(Collectors.groupingBy(e -> e.getId()));
		System.out.println("GroupBy Id :" + ms);

		Double Sal = ls.stream().collect(Collectors.averagingInt(e -> e.getSal()));
		System.out.println("Average Salary :" + Sal);

		Map<Integer, List<Employee>> fSal = ls.stream().collect(Collectors.groupingBy(e -> e.getSal()));
		System.out.println(fSal);

		// ------------------------------------- Map & FlatMap
		System.out.println("----------------------- Map & FlatMap -----------------------------------");

		List mfcity1 = ls.stream().map(e -> e.getCity()).toList();
		System.out.println("Print All City :" + mfcity1);

		List mfcity2 = ls.stream().map(e -> e.getCity()).distinct().toList();
		System.out.println("Print Unique City :" + mfcity2);

		List fsss = ls.stream().filter(i -> i.getSal() > 30000).toList();
		System.out.println("Above 30000 Salary Employee :" + fsss);

		// Map :- Return Boolean Value Then Print OutPut true,false
		List fm = ls.stream().map(i -> i.getSal() > 30000).toList();
		System.out.println("Above 30000 Salary :" + fm);
		List fml = ls.stream().map(i -> i.getSal()).toList();
		System.out.println("List Of Salary :" + fml);

		List mfl = ls.stream().map(e -> e.getDepth()).toList();
		System.out.println("\nMultiple List:" + mfl);

		List flatList = ls.stream().flatMap(i -> i.getDepth().stream()).toList();
		System.out.println("Merge List :" + flatList);
		
		
		//------------------------------- GroupBy With FlatMap ---------------------------------------		
		Map<String, List<String>>k= ls.stream().flatMap(i->i.getDepth().stream()).collect(Collectors.groupingBy(ii->ii));
		System.out.println("Merge Of departMent With groupBy Data :"+k);
//		Map<String,List< Employee>> groupByCity= l1.stream().collect(Collectors.groupingBy(e->e.getCity()));
//		System.out.println("\nUsing Group By City :"+groupByCity);
	}
}
