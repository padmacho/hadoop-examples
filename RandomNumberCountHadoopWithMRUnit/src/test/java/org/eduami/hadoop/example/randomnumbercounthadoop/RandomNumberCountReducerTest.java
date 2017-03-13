package org.eduami.hadoop.example.randomnumbercounthadoop;

import java.io.IOException;
import java.util.Arrays;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.ReduceDriver;
import org.junit.Test;

/**
 *  Reducer test
 * @author padma.chopparapu@gmail.com or www.eduami.org
 *
 */
public class RandomNumberCountReducerTest {

	/**
	 * Provide input to reducer as <8,[1,1]> and expect output as <8,2>
	 * @throws IOException
	 */
	@Test
	public void testReduceTextIterableOfIntWritableContext() throws IOException {
		new ReduceDriver<Text, IntWritable, Text, IntWritable>().withReducer(new RandomNumberCountReducer())
				.withInput(new Text("8"), Arrays.asList(new IntWritable(1), new IntWritable(1)))
				.withOutput(new Text("8"), new IntWritable(2)).runTest();
	}

}
