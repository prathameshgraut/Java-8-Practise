package ParallelStreamGroupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test11 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("HR", "IT");
		List<String> list2 = Arrays.asList("Product", "IT", "Deploy");
		List<String> list3 = Arrays.asList("Cunslatant", "Sevice");

		List<Employee> ls = Arrays.asList(new Employee(1, "Prathamesh", "Pune", 25000, list1),
				new Employee(2, "Harshal", "Jalgaon", 32400, list2), new Employee(3, "Bhavesh", "Pune", 10000, list2),
				new Employee(4, "Om", "Pune", 45000, list3), new Employee(5, "Vaibhav", "Mumbai", 30000, list1));

		// 1.Print First Higesh Salary Employee
		List SortedList = ls.stream().sorted((a, b) -> -a.getSal() - b.getSal()).limit(2).toList();
		System.out.println(SortedList);

		// 2.Print Above 10000 Salary Employees Data
		List SalList = ls.stream().filter(i -> i.getSal() > 10000).toList();
		System.out.println(SalList);

		// 3.Print Pune City Employee
		List CityList = ls.stream().filter(i -> i.getCity() == "Pune").toList();
		System.out.println(CityList);

		// 4.Print Depth List
		List mapList = ls.stream().map(i -> i.getDepth()).toList();
		System.out.println(mapList);

		// 5.Print Single List To Merge All List
		List FlatMapList = ls.stream().flatMap(i -> i.getDepth().stream()).collect(Collectors.toList());
		System.out.println(FlatMapList);

		// 6.Print Single List To Merge All List But O/P Will Only Unique Value
		List UniqueFlatMapList = ls.stream().flatMap(i -> i.getDepth().stream()).distinct().collect(Collectors.toList());
		System.out.println(UniqueFlatMapList);
		
		//7.Print Depth Wise Record 		
		Map<String, List<String>>m= ls.stream().flatMap(i->i.getDepth().stream()).collect(Collectors.groupingBy(i->i));
		System.out.println(m);

	}
}
