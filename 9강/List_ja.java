package choi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import java.util.Iterator;

public class List_ja {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("lee");
		list.add("park");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-----------------------");

		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("-----------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		ArrayList<String> num = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			num.add(Integer.toString((int) (Math.random() * 50)));
			Collections.sort(num);

		}
		System.out.println(num);
		num.remove(num.size() / 2);
		num.remove(num.size() / 2);
		System.out.println(num);
	}
}