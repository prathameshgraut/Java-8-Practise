package typeOf_FunctionalInterface;

import java.util.function.Consumer;

public class Consumer_FunctionalInterface {
	public static void main(String[] args) {
		Consumer<Integer> rs = mark-> {
			if(mark>35) {
				System.out.println("Pass..");
			}else {
				System.out.println("Fail..");
			}
			
		};
		rs.accept(50);
//		rs.result(45);
	}
}


//interface ResultService{
//	void result(int mark);
//}
