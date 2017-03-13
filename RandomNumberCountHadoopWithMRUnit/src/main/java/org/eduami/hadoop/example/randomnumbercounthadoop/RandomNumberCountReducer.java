package org.eduami.hadoop.example.randomnumbercounthadoop;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 * Random number count reducer
 * @author padma.chopparapu@gmail.com or www.eduami.org
 *
 */
public class RandomNumberCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	@Override
	public void reduce(Text key, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {

		int count = 0;
		for (IntWritable value : values) {
			count++;
		}

		context.write(key, new IntWritable(count));
	}
}
