package org.eduami.hadoop.dataset.randomnumbercount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Counts number of random numbers in file
 * Reads dataset file
 *
 */
public class RandomNumberCount {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("/home/mario/git/hadoop-examples/DataSet/randomnumbers/dataset.txt"));
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		while (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			if (countMap.containsKey(number)) {
				int value = countMap.get(number);
				countMap.put(number, ++value); // increment occurrence
			} else {
				countMap.put(number, 1);// Initialize
			}
		}
		System.out.println("Result: " + countMap);
		scanner.close();
	}
}
