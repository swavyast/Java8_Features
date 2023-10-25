package java8.defaultInterfaceMethod;

public class Vendor extends User implements Vendors {
	

	public static void main(String[] args) {
		Vendor v=new Vendor();
		v.login();
		v.logout();
		v.catalogueEntry();
		System.out.println();
		v.fname="Himanshu";
		v.mname=".";
		v.lname="Rai";
		v.street="E-7/22";
		v.vill=".";
		v.city="Sector-22";
		v.dist="Noida";
		v.state="Uttar Pradesh";
		v.country="India";
		v.pin=201301;
		v.phone=7275855535L;
		v.uname="swavyast";
		v.pass="Delph!c92";
		
		System.out.print(v.fname);
		System.out.print("\t"+v.mname);
		System.out.println("\t"+v.lname+"\n");
		System.out.print(v.street);
		System.out.print("\t"+v.vill);
		System.out.print("\t"+v.city);
		System.out.print("\t"+v.dist);
		System.out.print("\t"+v.state);
		System.out.print("\t"+v.country);
		System.out.println("\t"+v.pin);
		System.out.println(v.phone);
		System.out.println(v.uname);
		System.out.println(v.pass);
	}

}
