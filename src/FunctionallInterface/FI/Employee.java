package FunctionallInterface.FI;

public class Employee {
	int id;
	int sal;
	String city;
	
	public Employee(int id,int sal,String city) {
		this.id=id;
		this.sal=sal;
		this.city=city;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + ", city=" + city + "]";
	}
	
	
	
	
}
