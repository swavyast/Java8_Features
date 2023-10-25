package java8.defaultInterfaceMethod;

interface Users{
	default void login() {
		System.out.println("Login method inside Users Interface");
	}
	default void logout() {
		System.out.println("LogOut method inside Users Interface");
	}
}
interface Vendors extends Users{
	default void catalogueEntry() {
		System.out.println("Calling login method inside Vendor interface from Users interface without any reference(directCall)");
		login();
		System.out.println("Catalogue can be maintained by respective vendors only");
	}
}
interface Admin extends Users, Vendors{
default void adminActivities() {
	System.out.println("These activities require admin priviledges");
	System.out.println("Calling login method inside Admin interface from Users interface without any reference(directCall)");
	login();
}
}

public class Test {
	public static void main(String[] args) {
		Vendors v=null;
		v.catalogueEntry();
		v.login();
		v.logout();
	}

}
