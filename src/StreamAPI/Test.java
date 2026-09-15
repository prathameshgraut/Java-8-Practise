package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(100,200,40,10,78,50,80,500,40);
//		l.add("a");
//		l.add("b");
//		l.add("c");
		
//		for(String s:l) {
//			System.out.println(s);
//		}
		
		
//		Stream<Integer> st = l.stream();
		
//		Predicate<Integer> p =  t-> t>50;
		
//				List fl=st.filter(t-> t>50).toList();   //Method Chaining
				
				//List fl=fs.toList();
		//Stream -> filter -> toList  And get Filter List 
		List fl=l.stream().filter(t -> t>50).toList();
				System.out.println(fl);
	}
}

//class ObjPredicate implements Predicate<Integer>{
//
//	
//	public boolean test(Integer t) {
//		return t>80;
//	}
//	
//}
