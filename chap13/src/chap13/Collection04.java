package chap13;

import java.util.*;

public class Collection04 {

	public static void main(String[] args) {
		HashSet<String> str = new HashSet<>();
		
		str.add("Z");
		str.add("C");
		str.add("B");
		str.add("A");
		System.out.println(str);
		System.out.print("HashSet 요소 : ");
		for (String st : str) {
			System.out.print(st + " ");
		}
		String[] array = new String[str.size()];
		str.toArray(array);
		
		System.out.println();
		System.out.print("Array 요소 : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for (String st : array) {
			System.out.print(st + " ");
		}

	}

}
