package java8.methodReference;

import java.util.Arrays;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		int a[]=new int[l1.size()];
		System.out.println(l1);
		Integer x[]=l1.stream().toArray(Integer[]::new);
		System.out.println();
		for (Integer integer : x) {
			System.out.print(integer+"  ");
		}
	}

}
