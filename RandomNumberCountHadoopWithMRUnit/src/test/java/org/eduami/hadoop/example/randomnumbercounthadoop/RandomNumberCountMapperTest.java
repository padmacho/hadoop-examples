package org.eduami.hadoop.example.randomnumbercounthadoop;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.MapDriver;
import org.junit.Test;

/**
 * Mapper test
 * 
 * @author padma.chopparapu@gmail.com or www.eduami.org
 *
 */
public class RandomNumberCountMapperTest {

	/**
	 * Provide input as <0,8> where 0 is line number. Expect out put as <8,1>
	 * 
	 * @throws IOException
	 */
	@Test
	public void testMapLongWritableTextContext() throws IOException {
		Text value = new Text("8");
		// Notice that the input key could be set to any value because our
		// mapper ignores it.
		new MapDriver<LongWritable, Text, Text, IntWritable>().withMapper(new RandomNumberCountMapper())
				.withInput(new LongWritable(0), value).withOutput(new Text("8"), new IntWritable(1)).runTest();
	}

}
