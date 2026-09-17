package ParallelStreamGroupBy;

import java.util.List;

public class Employee{
	private int id;
	private String name;
	private String city;
	private int sal;
	private List<String> Depth;
	
	public Employee(int id, String name, String city, int sal ,List<String>Depth) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.sal = sal;
		this.Depth=Depth;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public List<String> getDepth() {
		return Depth;
	}

	public void setDepth(List<String> depth) {
		Depth = depth;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", sal=" + sal + ", Depth=" + Depth + "]\n";
	}
}
