package activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {
public static void main(String[] args) {
	//create an Arraylist
	List<String> myList= new ArrayList<>();
	// Add 5 names to list
	myList.add("Apple");
	myList.add("Mango");
	myList.add("Pineapple");
	myList.add(1,"Papaya");
	myList.add(3,"Melon");
	// print all elements using a loop
	for (String name:myList) {
		System.out.println(name);
	}
	
	//print 3rd element
	System.out.println("The 3rd element is:"+ myList.get(2));
	//search for specific name
	System.out.println("Is Rehana on the List?:"+ myList.contains("Rehana"));
	// print size of list
	System.out.println("No of elements in the list to before remove "+ myList.size());
	myList.remove(1);
	myList.remove("Melon");
		System.out.println("No of elements in the list to After remove "+  myList.size());
	
	
}
}
