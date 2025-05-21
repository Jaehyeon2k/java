package com.section03;

import com.javamaster.mypackage.Cat;
public class Example03 {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		
		System.out.println(cat1.equals(cat2));
		System.out.println(cat1 == cat2);
		
		cat1 = cat2;
		
		System.out.println(cat1.equals(cat2));
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		
		System.out.println(cat1 == cat2);
	}

}
