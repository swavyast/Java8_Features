package java8.default_Interfaces;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java8.Repo.Person;
import java8.Repo.Repo;

public class BiConsumerExample {
	public static void main(String[] args) {
		//Consumer<String> consume1=(s)->{System.out.println(s.toUpperCase());};
		BiConsumer<Integer, Integer> bc=(a, b)->System.out.println("Addition : "+(a+b));
		bc.accept(10, 20);
		
		List<java8.Repo.Person> pList1=Arrays.asList(
				new Person("Rajenra Prasad Rai", "Kanungo", null, null, null, new Person(), new Person(), Arrays.asList("Art", "Literature", "Reading")),
				new Person("Ramdulari Devi", "Sharda Ki Maa", null, null, null, new Person(), new Person(), Arrays.asList("Art")),
				new Person("Rambyas Rai", null, null, null, null, new Person(), new Person(), Arrays.asList("Running", "Reading", "Writing")),
				new Person("Lilawati Devi", null, null, null, null, new Person(), new Person(), Arrays.asList("Art", "Literature", "Reading", "Novel")),
				new Person("Dinesh Kumar Rai", "Guddu", 9455695863L, "Master of Arts", new Date(), new Person(), new Person(), Arrays.asList("Art", "Literature")),
				new Person("Ramesh Chand Rai", "Badka", 9451007551L, "Master of Fine Arts", new Date(), new Person(), new Person(), Arrays.asList("Art", "Literature", "Reading", "Writing", "Novels", "Painting", "Sketch")),
				new Person("Nilam Rai", "Buchi", 6398756985L, "Intermediate", new Date(), new Person(), new Person(), Arrays.asList("Art", "Literature", "Reading", "Writing")),
				new Person("Himanshu Rai", "Dumpy", 7275855535L, "Batchelor of Technology", new Date(), new Person(), new Person(), Arrays.asList("Art", "Literature", "Reading", "Writing", "Novels", "Biking", "Hiking"))
				);
		List<java8.Repo.Person> pList2=Repo.getAllFamilyMembers();
		
		BiConsumer<List<java8.Repo.Person>, List<java8.Repo.Person>> bc2=(l1, l2)->{
			if(l1.size()==l2.size()) System.out.println("True");
			else System.out.println("False");
		};
		bc2.accept(pList1, pList2);
	}

}
