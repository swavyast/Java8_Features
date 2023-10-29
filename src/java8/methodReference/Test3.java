package java8.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	int a[]= {10, 25, 256, 36, 94, 29, 36, 43};
	List<Integer> li=new ArrayList<Integer>(10);
	int b[]=Arrays.copyOf(a, 5);

	public static void main(String[] args) {
		Test3 t3=new Test3();
		for(int n:t3.b) {
			System.out.println(n);
		}
		
		t3.li.add(10);
		t3.li.add(5);
		t3.li.add(29);
		t3.li.add(11);
		t3.li.add(100);
		t3.li.add(60);
		t3.li.add(36);
		//Printing List Items
		t3.li.forEach(System.out::println);
		t3.b=t3.li.stream().mapToInt(Integer::intValue).toArray();
		System.out.println("Printing list to array");
		for(int n:t3.b) {
			System.out.println(n);
		}

		List l2=Arrays.asList(t3.a);
		l2.stream().forEach(System.out::println);
		int c[]=Arrays.copyOf((int[]) l2.iterator().next(), 8);
		System.out.println("Arrays.copyOf int[] l2.iterator().next() way");
		for(int x:c) {
			System.out.println(x);
		}
	}
}