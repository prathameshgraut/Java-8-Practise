package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
	public static void main(String[] args) {

		// Print Ascending Format
		List<Integer> l = Arrays.asList(10, 45, 78, 63, 30, 24, 45, 24, 65);
		System.out.println("Using Stream Method :" + l.stream().sorted().toList());

//		Comparator<Integer> cm = new mycomparator();
//		Comparator<Integer> cm = (o1,o2)->-o1.compareTo(o2);
//		List<Integer> fl = l.stream().sorted(cm).toList();
//		List<Integer> fl = l.stream().sorted((o1,o2)->-o1.compareTo(o2)).toList();
		System.out.println("Final List Using Lambda :" + l.stream().sorted((o1, o2) -> -o1.compareTo(o2)).toList());

		// Only Print Matching Record
		System.out.println(l.stream().allMatch(t -> t == 10));

		System.out.println(l.stream().anyMatch(y -> y == 66));

		// Print Unique Element
		System.out.println("Print Unique Element :" + l.stream().distinct().toList());

		// Sorted Ascending order
		System.out.println("Print Only Two Record :" + l.stream().sorted().limit(2).toList());
		// sorted Descending Order
		System.out.println("Print Only Three Higesht Record :" + l.stream().sorted((a, b) -> -a.compareTo(b)).limit(3).toList());

		// Sorted Descending Format Using simple
//		Comparator<Integer> cmp = new mcomp();
//		Stream<Integer> fs = l.stream().sorted(cmp);
//		System.out.println(fs.toList());
//		List<Integer> fl = fs.limit(3).toList();
//		System.out.println("Final Result :" + fl);
		
		System.out.println( l.stream().sorted((M,N)->-M.compareTo(N)).limit(3).toList());
		
		System.out.println(l);
		Set<Integer> fs= l.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toSet());
		System.out.println("Using Collector Into Set :"+fs);
	}
}

//class mcomp implements Comparator<Integer> {
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		return -o1.compareTo(o2);
//	}
//
//}

//no need because this are functional interface used for lambda expression
//class mycomparator implements Comparator<Integer> {
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//
//		return -o1.compareTo(o2);
//	}
//
//}