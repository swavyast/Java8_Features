package java8.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

interface FunctionFunctionalInterface extends Function<List<Integer>, Object[]>{

}
public class FunctionFunctional implements FunctionFunctionalInterface {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(12);
		l.add(8);
		l.add(32);
		l.add(26);
		l.add(99);
		l.add(78);
		l.add(68);
		l.add(29);
		l.add(33);
		l.add(39);
		l.add(93);
		l.add(23);
		
		//Type-1 : Using List API
		System.out.println("List to Array Using List API ");
		int x[]=l.stream().mapToInt(i->i).toArray();
		for(int y:x) {
			System.out.println(y);
		}
		System.out.println("\n************_***************_************\n");
		
		//Type-2 : Using Function Functional Interface	
		System.out.println("List to Array Using Function Functional Interface");
		
		//int a[]=new int[l.size()];
		FunctionFunctionalInterface f=(m)->l.toArray();
		
		//Object[] o=f.apply(l);
		for (Object i : f.apply(l)) {
			System.out.println(String.valueOf(i));
		}

		System.out.println("\n************_***************_************\n");
		
		//Type-3
		/*
		 * int n[] = n=l.stream().mapToInt(i->i).toArray(); for(int q:n) {
		 * System.out.println(q); }
		 */
		int d[]=new int[l.size()];
		System.out.println("List to Array Using ListIterator Class");
		for(int xx=0; xx<l.size();xx++) {
				d[xx]=l.listIterator(xx).next().intValue();
		}
		for(int yy:d) {
			System.out.println(yy);
		}
	}

	@Override
	public Object[] apply(List<Integer> t) {
		// TODO Auto-generated method stub
		return null;
	}		
}
