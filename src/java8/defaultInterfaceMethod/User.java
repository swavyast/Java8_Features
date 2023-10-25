package java8.defaultInterfaceMethod;

public class User extends Person implements Users {
	String uname;
	String pass;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "User [uname=" + uname + ", pass=" + pass + "]";
	}
	public static void main(String[] args) {
		User u=new User();
		u.login();
		u.logout();
		System.out.println();
		u.fname="Himanshu";
		u.mname=".";
		u.lname="Rai";
		u.street="E-7/22";
		u.vill=".";
		u.city="Sector-22";
		u.dist="Noida";
		u.state="Uttar Pradesh";
		u.country="India";
		u.pin=201301;
		u.phone=7275855535L;
		u.uname="swavyast";
		u.pass="Delph!c92";
		
		System.out.print(u.fname);
		System.out.print("\t"+u.mname);
		System.out.println("\t"+u.lname+"\n");
		System.out.print(u.street);
		System.out.print("\t"+u.vill);
		System.out.print("\t"+u.city);
		System.out.print("\t"+u.dist);
		System.out.print("\t"+u.state);
		System.out.print("\t"+u.country);
		System.out.println("\t"+u.pin);
		System.out.println(u.phone);
		System.out.println(u.uname);
		System.out.println(u.pass);
	}
}
