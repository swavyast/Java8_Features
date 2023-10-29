package java8.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {
public static void main(String[] args) {
	List li=new ArrayList();
	li.add(10);
	li.add(20);
	li.add(60);
	li.add(30);
	li.add(50);
	li.add(40);
	li.add(32);
	li.add(25);
	
	Integer b[]=new Integer[li.size()];
	b=(Integer[]) li.toArray(b);
	for(Integer number:b) {
		System.out.println(number);
	}
	
	//Type-1 : Using Arrays API
	//li.stream().forEach(System.out::println);
	//int a[]=Arrays.copyOf((int[]) li.iterator().next(), li.size());
	//Type-2 : Using stream API
	//int a[]=li.stream().mapToInt(n->Integer.parseInt(n.toString())).toArray();
	//Type-3 : Using List API and For Loop
	int a[]=new int[li.size()];
	for (int i=0; i<li.size();i++) {
		a[i]=(int) li.get(i);
	}
	for(int x:a) {
		System.out.println(x);
	}

}
}
