package com.quest.all;

import java.util.HashMap;
import java.util.function.Consumer;

/**
 * Find index of elements that sums up to Target.
 */
public class TwoSumTarget {
	public static void main(String[] args) {
		var target = 15;
		int [] arr = { 4, 9, 6, 2, 1 };
		Consumer<int[]> findFrequency = e -> {
			var map = new HashMap<Integer, Integer>();// taking hash map to store indexes 
			for (var i = 0; i < e.length; i++) {
				var currentDiff = target - e[i];// finding current difference between target and current value 
				if (map.containsKey(currentDiff)) {// checking, if map has the difference or not 
					var j = map.get(currentDiff);// this will be target index
					System.out.println("First index : " + i + "  " + map.get(currentDiff));
					System.out.println(arr[i] + " " + arr[j]);
					break;
				}
				map.put(e[i], i);//putting index and values in map 
			}
		};

		findFrequency.accept(arr);

	}

}
