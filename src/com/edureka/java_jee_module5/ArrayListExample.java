package com.edureka.java_jee_module5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	
	public List<Integer> processList(List<Integer> inputList){
		return new ArrayList<Integer>();
	}

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();

		
		myList.add("Pradeep");
		myList.add("Pradeep");
		myList.add("Ajay");
		myList.add("Ajay");
		myList.add("Ajay");
		myList.add("John");
		myList.add(6, "Naveen");
		myList.add(6, "NewValue");
		myList.add("Kevin");
		
	
		
		String str = myList.get(8);

		ArrayList<String> newList = new ArrayList<String>();

		newList.addAll(myList);
		
		
		
	
/*
		System.out.println("newList >> " + newList);
		System.out.println(myList.remove("Ajay"));
		System.out.println("myList > " + myList);

		 for (int i = 0; i < myList.size(); i++) {
			  System.out.println("Element at index " + i + " " + myList.get(i));
		 }
		

		 for (String strData : myList) {
		 System.out.println("Element >> " + strData);
		 }*/

		/** Iterator<String> it = myList.iterator();
		 while (it.hasNext()) {
			 String element = it.next();
			// System.out.println("Iteraing via iterator >> " + element);
		 }

		ListIterator<String> listIterator = myList.listIterator();
		// System.out.println(listIterator.hasPrevious());

		while (listIterator.hasNext()) {
			listIterator.next();
		}
		while (listIterator.hasPrevious()) {
			String element = listIterator.previous();
			// System.out.println("Iteraing via List iterator >> " + element);
		}
**/
		// Enumeration<String> et = Collections.enumeration(myList);
	
		//
		// while (et.hasMoreElements()) {
		// String nextElement = et.nextElement();
		// System.out.println(nextElement);
		// }
	//	java.util.Collections.sort(myList, (o1, o2) -> o2.getAge() - o1.getAge());
		
		//java.util.Collections.sort(myList, (o1,o2)-> o1.getGrade().compareTo(o1.getGrade()));

		
		//Collections.sort(myList);
		//
		//java.util.Collections.sort(myList);
		System.out.println("Sorted list >> "+myList);
	}
}
