 package FunctionallInterface;

public class Demo{
	
	
	/*functional interface 
	 * only have only one abstract method
	 * use @funcationalInteraface annotation
	*/
	
	public static void main(String[] args) {
		
		
		/*lambda expression or function 
		 * -> this are lambda symbol
		 * lambda expression are handled only functional interface method 
		 * lambda expression are not yet any return type , not name and access modifier 
		 * 
		 * */
		age a = age -> {
			if(age>25) 
				System.out.println("Younger boy");
			else 
				System.out.println("Not Young");
		};
			a.Age(18);
		
	}

	
	
}


interface age {
	void Age(int age);
}
