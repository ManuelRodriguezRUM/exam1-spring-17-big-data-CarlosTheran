package edu.uprm.cse.bigdata.p1exam1;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
/**
 * Created by carlos on 03-31-17.
 */
public class WordCountByIDReducer extends Reducer<Text, Text, Text, Text> {

    @Override
    protected void reduce(Text key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException {

        String result = "[ ";

        for (Text value : values){
            result = result + value;
            result = result + " , ";
        }

        result = result + " ]";

        context.write(key, new Text(result ));

    }

}
