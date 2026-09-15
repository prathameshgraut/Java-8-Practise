package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test7 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Prathamesh Raut", 15000, "Pune");
		Employee e2 = new Employee(2,"Harshal Shimpi", 24000, "Jalgon");
		Employee e3 = new Employee(3,"Shyam Patil", 30004, "Mumbai");
		Employee e4 = new Employee(4,"Deva .......", 2540, "Goa");
		Employee e5 = new Employee(5,"Sai Ram ....", 5000, "Pune");
		Employee e6 = new Employee(6,"Parth  Bhai", 45005, "Pune");	
		 
		
		
		Set<Employee> s = new TreeSet<Employee>((x,y)->x.getSal()-y.getSal());
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		s.add(e6);
		
		List<Employee> l = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		System.out.println(s.stream().sorted((a,b)->a.getSal()-b.getSal()).toList());
		
		System.out.println( s.stream().distinct().toList());
		
		System.out.println(s.stream().sorted((a,b)->-a.getSal()-b.getSal()).limit(3).toList());
		
		System.out.println(s.stream().findAny().get());
		
	}
}

class Employee {
	private int id;
	private String name;
	private int sal;
	private String city;

	public Employee(int id, String name, int sal, String city) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override // toString
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", city=" + city + "]";
	}
}