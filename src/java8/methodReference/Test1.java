package java8.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@FunctionalInterface
interface ArraySorting{
	public void test(int arr[]);
}
public class Test1 {
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
		
		ArraySorting ass=null;
		//forEach to print listElements
		l.forEach(i->System.out.println(i));
		
//type-1 of converting a list into an Array
		int mno[] = new int[l.size()];
		for (int i=0; i<l.size();i++) {
			mno[i]=(int) l.get(i);
		}
		System.out.println("****************");
		for (int i : mno) {
			System.out.println(i);
		}
		//Arrays.asList(mno).forEach(i->System.out.println(i));
		//int array[]=new int[l.size()];
//Type-2 of converting a list into an Array	
		
		//converting list into Integer array
		Integer a[]=l.toArray(new Integer[l.size()]);
		//converting Integer Array into int array
		int[] ar = Arrays.stream(a).mapToInt(i->i).toArray();
		//int[] ar = Arrays.stream(a).mapToInt(Integer::intValue).toArray();
		//List l1=Arrays.asList(a);
//Type-3 of converting a list into an Array	
		//	This method works for RawType Lists only, doesn't work on generic type Lists.
		  //l.stream().forEach(System.out::println); 
		/*
		 * try { int zx[]=Arrays.stream((int[])l.stream().forEach(Consumer::accept)); }
		 * catch (Exception e) { e.printStackTrace(); }
		 */
		 
		ArraySorting as=Arrays::sort;
		as.test(ar);
		System.out.println("****Sorted Array****");
		for(int x:ar) {
			System.out.println(x);
		}
		//converting list of type int into int array directly
		//int x[]=l.stream().mapToInt(i->i).toArray();
		int y[]=l.stream().mapToInt(Integer::intValue).toArray();

		for(int z:y) {
			//System.out.println(z);
		}
	}

}
