package java8.defaultInterfaceMethod;
interface I1{
	/*
	 * static default void m22() { }
	 *Illegal combination of modifiers, only abstract, default or static is permitted.
	 *that means:- static+abstract or static+default or abstract+default or abstract+default+static is not allowed.
	 */
	public void x();
	default void m1() {
		System.out.println("Default method M1 in I1 interface");
		System.out.println("Now accessing static method M2 inside default method M1, below is the result");
		m2(); //static method can be accessed inside default method.
		System.out.println("M1 method ends here");
	}
	static void m2() {
		System.out.println("Static method M2 in I1 interface");
		//m1(); :- default method can not be accessed inside static method.
	}
	public static void main(String[] args) {
		System.out.println("Main method inside I1 interface");
		//I1.m2();
		m2();
	}
}
interface I2{
	default void m1() {
		System.out.println("Default method M1 in I2 interface");
	}
	static void m2() {
		System.out.println("Static method M2 in I2 interface");
		//m1(); :- default method can not be accessed inside static method.
	}
}
interface I3 extends I1, I2{
	@Override
	default void m1() {
		// TODO Auto-generated method stub
		I2.super.m1();
	}
	
}
class C1 implements I1{

	public static void m2() {
		System.out.println("Overhidden static method M2 in C1 class");
	}
	@Override
	public void x() {
	System.out.println("Inherited method x's implementation in C1 class");
		
	}
	public static void main(String[] args) {
		//I1.m1();
		//I1.x();
		I1 i1=new C1();
	//	i1.m1();
	//	I1.m2();
		i1.x();
		//C1 c1=new C1();
		//c1.m1();
		//c1.m2();
		C1.m2();
	}	
}
class C2 implements I2{
	
}
class C3 implements I1, I2{
	
	@Override
	public void x() {
		System.out.println("Inherited method x's implementation in C3 class");
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		I2.super.m1();
	}	
}
class C4 implements I3{
	@Override
	public void x() {
		System.out.println("Inherited method x's implementation in C4 class");
		
	}	
}
public class Test1 {
public static void main(String[] args) {
	C4 c4=new C4();
	c4.x();
	c4.m1();
	I1.m2();
	I2.m2();
}
}
