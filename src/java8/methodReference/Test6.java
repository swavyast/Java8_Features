package java8.methodReference;

import java.util.Arrays;
import java.util.List;

public class Test6 {
//private static IntStream i;

public static void main(String[] args) {
	List<Integer> l1=Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	int a[]=new int[l1.size()];
	System.out.println(l1);
	a=l1.stream().mapToInt(i->i).toArray();
	for (int i : a) {
		System.out.println(i);
	}
}

}
