package org.eduami.hadoop.dataset.randomnumbergenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

/**
 * GeneratesRandom numbers
 *
 */
/** Generate random integers in the range 0..99. and writes to text file */
public class Generator {
	public static void main(String[] args) throws IOException {

		Writer wr = new FileWriter("dataset.txt");
		// note a single Random object is reused here
		Random randomGenerator = new Random();
		for (int idx = 1; idx <= Integer.MAX_VALUE; ++idx) {
			int randomInt = randomGenerator.nextInt(100);
			System.out.println(randomInt);
			wr.write(Integer.toString(randomInt));
			wr.write("\n");
		}
		wr.close();
	}
}
