package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test3 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(450,400,45,36,10,15,70,25,22);   //O/p : 450,400,70,45,36 
		System.out.println(l.stream().filter(t->t>=36).toList());
	}
	
}