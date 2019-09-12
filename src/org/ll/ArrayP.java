package org.ll;

import java.util.ArrayList;

public class ArrayP {
	public static void main(String[] args) {
		ArrayList emp=new ArrayList();
		emp.add("srr");
		emp.add(123);
		emp.add("lov");
		emp.add("manasaaaa");
		System.out.println(emp);
		emp.set(0, "syy");
		System.out.println("After replace");
		System.out.println(emp);
		System.out.println("Size of the array:-" +emp.size());
	}

}
