package java8.lambda;

@FunctionalInterface
interface FunctionalInterface_I1 {
	void m1();

	default void m2() {
		System.out.println("First default method inside functional interface");
	}

	default void m3() {
		
		System.out.println("Second default method inside functional interface");
	}

	static void m4() {
		System.out.println("First static method inside functional interface");
	}

	static void m5() {
		System.out.println("Second static method inside functional interface");
	}
}

public class Test1 {
	FunctionalInterface_I1 i4 = new FunctionalInterface_I1(){
		int a = 20;

		// i2.m2();
		@Override
		public void m1() {
			System.out.println(a);
			System.out.println("Functional interface implementation using anonymous inner class concept");
			/*
			 * i2.m2(); i2.m3(); FunctionalInterface_I1.m4(); FunctionalInterface_I1.m5();
			 */
		}

		public void m2() {
			System.out.println(a);
			System.out.println("M2 implementation inside anonymous inner class");
		}
		  public void m4() {
			  System.out.println(a);
		  System.out.println("M4 implementation inside anonymous inner class"); }
		  
		  
		  public void x() { 
			  System.out.println(a);
			  System.out.println("Additional method implementation is not possible here, this metho can't be called "); 
			  }
		 
	};

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.i4.m1();
		t.i4.m2();
		t.i4.m3();
		System.out.println("Class of instance i4 "+t.i4.getClass());
		//System.out.println(t.i4.a);
		System.out.println("Main method");
		FunctionalInterface_I1 i1 = () -> {
			System.out.println("Abstract method m1 from FunctionalInterface_I1");
			// m2();
			// m3();
			// m4();
			// m5();
			// i1.m2(); ->i1 is not initialize yet.
		};
		FunctionalInterface_I1 i2 = () -> {
			int a = 10;
			// i1.m1();
			i1.m2();
			i1.m3();
			FunctionalInterface_I1.m4();
			FunctionalInterface_I1.m5();
			System.out.println("Class of instance i1 "+i1.getClass());
			/*
			 * public int x() {
			 * System.out.println("Multiple method implementation not possible here"); Only
			 * local variables can be declared inside lambda expression. return 10; }
			 */
			System.out.println("Value of the local variable a is : " + a);
		};
		i2.m1();
		System.out.println("Class of instance i2 "+i2.getClass());
		// System.out.println(a);
		// System.out.println(i2.a);
		// System.out.println(i1.a);

		FunctionalInterface_I1 i3 = new FunctionalInterface_I1(){
			int a = 20;

			// i2.m2();
			@Override
			public void m1() {
				System.out.println(a);
				System.out.println("Functional interface implementation using anonymous inner class concept");
				/*
				 * i2.m2(); i2.m3(); FunctionalInterface_I1.m4(); FunctionalInterface_I1.m5();
				 */
			}

			public void m2() {
				System.out.println(a);
				System.out.println("M2 implementation inside anonymous inner class");
			}

			
			/*
			 * public void m4() {
			 * System.out.println("M4 implementation inside anonymous inner class"); }
			 * 
			 * 
			 * public void x() { System.out
			 * .println("Additional method implementation is not possible here, this method can't be called "
			 * ); }
			 * 
			 * public static void m4() {
			 * System.out.println("M4 implementation inside anonymous inner class"); } The
			 * method m4 cannot be declared static; static methods can only be declared in a
			 * static or top level type
			 */
		};
		i3.m1();
		// i3.x();
		i3.m2();
		i3.m3();
		// i3.m4(); //This static method of interface FunctionalInterface_I1 can only be
		// accessed as FunctionalInterface_I1.m4
		FunctionalInterface_I1.m4();
		FunctionalInterface_I1.m5();
		System.out.println("Class of instance i3 "+i3.getClass());
		//System.out.println(i3.a);
		// i1.x();
		// i2.x();
	}

}
