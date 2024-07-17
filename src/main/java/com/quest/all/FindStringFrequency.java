package com.quest.all;

import java.util.HashMap;
import java.util.function.Consumer;

public class FindStringFrequency {
	public static void main(String[] args) {

		Consumer<String> findFrequency = e -> {
			var map = new HashMap<Character, Integer>();
			for (int i = 0; i < e.length() - 1; i++) {
				var key = e.charAt(i);

				if (map.containsKey(key)) {
					map.put(key, map.get(key).intValue() + 1);
				} else {
					map.put(key, 1);
				}

			}
			System.out.println(map);
		};

		findFrequency.accept("aa bb ii oo pp ");

//		Optimized function with 2 pointers technique
		Consumer<String> printFrequency = e -> {
			var j = e.length() - 1;
			var i = 0;
			var map = new HashMap<Character, Integer>();

			while (i < j) {
				var left = e.charAt(i);

				if (map.containsKey(left)) {
					map.put(left, map.get(left).intValue() + 1);
				} else {
					map.put(left, 1);
				}

				var right = e.charAt(j);
				if (map.containsKey(right)) {
					map.put(right, map.get(right).intValue() + 1);
				} else {
					map.put(right, 1);
				}
				i++;
				j--;

			}
			System.out.println(map);
		};

		printFrequency.accept("aa bb ii oo pp ");
	}

}
