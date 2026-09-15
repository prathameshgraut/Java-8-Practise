package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

//Filter Data To print double element

public class Test5 {
	public static void main(String[] args) {
		List<Integer> l =Arrays.asList(10,20,45,78,98,45);
		
		//Data Filter 
		System.out.println(l.stream().filter(i->i>30).toList());
		
	    //Data Filter 
		System.out.println(l.stream().filter(m->m>10).toList());
		
		//Print String Replace character
		List<String> s=Arrays.asList("abc","sada","jdfa");
		System.out.println(s.stream().map(s1->s1.replace("a", "")).toList());
		
		//Print Double Number Number But Greater Than 20
		List<Integer> l1 = Arrays.asList(10,45,5,6,40,22);
		System.out.println(l1.stream().map(n->n>20?n*2:n).toList());
		
		
		
		//Sorted Stream [Comparator and Comparable]
		List<Integer> ll = Arrays.asList(14,45,84,97,123,10);
		System.out.println("Print Soted List :"+ll.stream().sorted().toList());
		
		
//		Comparator<Integer> cm = new myComprator();
//		Comparator<Integer> cm = (a,b)->b.compareTo(a);
//		List<Integer>  fl=ll.stream().sorted(cm).toList();
//		List<Integer>  fll=ll.stream().sorted((a,b)->b.compareTo(a)).toList();
		System.out.println("Used Comparator :"+ll.stream().sorted((a,b)->b.compareTo(a)).toList());
	}
}



//this are functional interface then no need to implementation directly used lambda expression
//class myComprator implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		return o2.compareTo(o1);
//	}
//	
//}
