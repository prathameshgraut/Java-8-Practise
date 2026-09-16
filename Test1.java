package ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {
		List<String> sl1=Arrays.asList("Java","React.js","Mysql");
		List<String> sl2=Arrays.asList("Python","Mearn","MongoDB");
		List<String> sl3=Arrays.asList("Java FullStack","Angular","PotsgreSQL");
		List<String> sl4=Arrays.asList("C++","Angular","Mysql");
		List<String> sl5=Arrays.asList("C#","React.js","OracleDB");
		
		Student s1 = new Student(1, "Prathamesh Raut", sl1, "Pune");
		Student s2= new Student(2, "Devendra Patil", sl2, "Jalgaon");
		Student s3= new Student(3, "harshal Shimpi", sl3, "Jalgaon");
		Student s4= new Student(4, "Vaibhav Raut", sl4, "Mumbai");
		Student s5= new Student(5, "Sharvil Shinde", sl5, "Jamner");
		
		//Stored Student Record In List 
		List<Student> ls = Arrays.asList(s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5,s1,s2,s3,s4,s5);
		
		//Return Record Using Stream API
		//Stream API Are Represent And Also Return Sequential Object 
		System.out.println("Print Name Using toList :"+ls.stream().map(e->e.getName()).toList());  //Using toList
		System.out.println("Print City Using Collector.toSet  :"+ls.stream().map(s->s.getCity()).collect(Collectors.toSet()));
		System.out.println("Print City Using Collector.toList :"+ls.stream().map(s->s.getCity()).collect(Collectors.toList()));
		
		long ssT=System.currentTimeMillis();
		List<List<String>> fl= ls.stream().map(s->s.getCourse()).toList();
		System.out.println(fl);
		long seT=System.currentTimeMillis();
		System.out.println("Total Time To Perform Stream  :"+(seT-ssT));
	    
		//Parallel Stream API
		long sT=System.currentTimeMillis();
		List<List<String>> courseList= ls.parallelStream().map(s->s.getCourse()).toList();
		System.out.println(courseList);
		long eT=System.currentTimeMillis();
		System.out.println("Total Time To perform Parallel :"+(eT-sT));
	}
	

}


class Student{
	private int id;
	private String name;
	private List<String> course;
	private String city;
	
	public Student(int id,String name,List<String> course,String city) {
		this.id=id;
		this.name=name;
		this.course=course;
		this.city=city;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public List<String> getCourse(){
		return course;
	}
	public void setCourse(List<String> course) {
		this.course=course;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", city=" + city + "]";
	}
}