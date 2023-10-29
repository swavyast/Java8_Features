package java8.methodReference;

import java.util.Arrays;

import javax.swing.text.html.FormSubmitEvent;
@FunctionalInterface 
interface I1{
	void test(int a[]);
}

public class Test2 implements I1{
	int a[]= {10, 25, 256, 36, 94, 29, 36, 43};
	public void binSearch() {
		Arrays.sort(a);
		int x;
		x=Arrays.binarySearch(a, 0, a.length, 25);
		if(x>=0) {
			System.out.println("item is available in the array it's index in sorted array is : "+x);
		}else {
			System.err.println("item is not available in this array");
		}
	}

	/*
	 * I1 i1=(a)->{ System.out.println("test is going to implement here"); };
	 */
	I1 i2=Arrays::sort;
	public static void main(String[] args) {
		Test2 t2=new Test2();
		//t2.i1.test(t2.a);
		t2.i2.test(t2.a);
		//t2.binSearch();
		
	}

	@Override
	public void test(int[] a) {
		// TODO Auto-generated method stub
		
	}
}
