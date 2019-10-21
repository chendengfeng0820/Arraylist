package test;

import java.awt.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		int num[] = new int[]{1, 3, 2, 5, 4};
		Collection list = new ArrayList();
		for (int i = 0; i < num.length; i++) {
			((ArrayList) list).add(i, num[i]);
		}
		System.out.println(list);

		Comparator<Integer> c = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		Collections.sort((java.util.List<Comparable>) list);
		System.out.println(list);
	}
}




