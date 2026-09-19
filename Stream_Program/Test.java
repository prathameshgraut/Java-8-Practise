package Stream_Program;

import java.util.Arrays;
import java.util.List;

import ParallelStreamGroupBy.Employee;

public class Test {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("HR", "IT");
		List<String> list2 = Arrays.asList("Product", "IT", "Deploy");
		List<String> list3 = Arrays.asList("Cunslatant", "Sevice");

		List<Employee> ls = Arrays.asList(
				new Employee(1, "Prathamesh", "Pune", 25000, list1),
				new Employee(2, "Harshal", "Jalgaon", 32400, list2), 
				new Employee(3, "Bhavesh", "Pune", 10000, list2),
				new Employee(4, "Om", "Pune", 45000, list3), 
				new Employee(5, "Vaibhav", "Mumbai", 30000, list1)
				);
		
		
		//1.Only Print Name 
		List nameList=ls.stream().map(i->i.getName()).toList();
		System.out.println("Only Employee Name :"+nameList);
		
		//2.Print Higest Salary Employee
		List higestSalaryEmp= ls.stream().sorted((a,b)->-a.getSal()-b.getSal()).limit(1).toList();
		System.out.println("Higest Salary Employee :"+higestSalaryEmp);
		
		//3.Print All Employee in Descending Format Base on City 
		List cityDesc= ls.stream().sorted((a,b)->a.getCity().compareTo(b.getCity())).toList();
		System.out.println("Print record Descending Order Base On City :"+cityDesc);
		
		//4.Show All City
		List AllCity = ls.stream().map(i->i.getCity()).toList();
		System.out.println("All City ="+AllCity);
		
		//5.Show Unique city 
		List uniqueCity= ls.stream().map(i->i.getCity()).distinct().toList();
		System.out.println("Unique City ="+uniqueCity);
		
		//6.Show Only Pune Employee
		List puneEmp = ls.stream().filter(i->i.getCity()=="Pune").toList();
		System.out.println("Pune Employee ="+puneEmp);
		
		//7.Show Only Above Salary 20000 Emp Record
		List Above20000Emp= ls.stream().filter(i->i.getSal()>20000).toList();
		System.out.println("Above 20000 Salary Employee ="+Above20000Emp);
		
		//8.Show Only First Employee
		List firstEmp=ls.stream().filter(i->i.getId()==1).toList();
		System.out.println("HR Depth Employee ="+firstEmp);
	}
}
