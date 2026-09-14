package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10,50,60,70,80,90,5,100);
		
//		Stream<Integer> st = l.stream();
		
//		Predicate<Integer> p = t -> t%2==0;
		
//		Stream<Integer> fs=st.filter(p);
//		List fl=fs.toList();
//		System.out.println(fl);
		List fl=l.stream().filter(t -> t%2==0).toList();
		System.out.println(fl);
	}
}

//class myPredicate implements Predicate<Integer>{
//
//	@Override
//	public boolean test(Integer t) {
//		if(t%2==0)
//			return true;
//		return false;
//	}
//	
//}