package java8.default_Interfaces;

import java.util.function.Consumer;

import java8.Repo.Person;
import java8.Repo.Repo;


public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consume1=(s)->{System.out.println(s.toUpperCase());};
		Consumer<String> consume2=(s)->{System.out.println(s.toLowerCase());};
		
		consume1.accept("java9");
		consume1.andThen(consume2).accept("jai shri ram");
		
		Person p=Repo.getPersondetails();
		System.out.println(p);
	}

}
