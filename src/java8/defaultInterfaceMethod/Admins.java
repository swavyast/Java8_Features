package java8.defaultInterfaceMethod;

public class Admins extends User implements Admin {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Admins a=new Admins();
		a.login();
		a.logout();
		a.adminActivities();
		a.catalogueEntry();
		System.out.println();
		a.fname="Himanshu";
		a.mname=".";
		a.lname="Rai";
		a.street="E-7/22";
		a.vill=".";
		a.city="Sector-22";
		a.dist="Noida";
		a.state="Uttar Pradesh";
		a.country="India";
		a.pin=201301;
		a.phone=7275855535L;
		a.uname="swavyast";
		a.pass="Delph!c92";
		System.out.println(a.ad);
		String ad=(a.street+" "+a.vill+" "+a.city+" "+a.state+" "+a.country+" "+a.pin);
		System.out.println(ad);
		/*
		 * System.out.print(a.fname); System.out.print("\t"+a.mname);
		 * System.out.println("\t"+a.lname+"\n"); System.out.print(a.street);
		 * System.out.print("\t"+a.vill); System.out.print("\t"+a.city);
		 * System.out.print("\t"+a.dist); System.out.print("\t"+a.state);
		 * System.out.print("\t"+a.country); System.out.println("\t"+a.pin);
		 * System.out.println(a.phone); System.out.println(a.uname);
		 * System.out.println(a.pass);
		 */
	}

}
