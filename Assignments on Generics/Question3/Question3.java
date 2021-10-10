//Program to exchange the positions of two different elements in an array
package co.skr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question3 {

	public static <T> void exchange(List<T> li, int pos1, int pos2) {
		Collections.swap(li, pos1, pos2);
		System.out.println("List After Exchange: "+li);
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(20);
		list.add(29);
		list.add(30);
		list.add(10);
		
		System.out.println("List Before Exchange: "+list);
		
		int pos1 = 1, pos2 = list.size() - 1;
		exchange(list, pos1, pos2);
	}

}
