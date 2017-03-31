package edu.uprm.cse.bigdata.p1exam1;
import com.sun.jndi.url.dns.dnsURLContext;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;
import twitter4j.*;

import java.io.IOException;
//import java.util.Scanner;
/**
 * Created by carlos on 03-31-17.
 */
public class WordCountByIDMapper extends Mapper<LongWritable, Text, Text, Text>{

    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String rawTweet = value.toString();
//h
        try {
            Status status = TwitterObjectFactory.createStatus(rawTweet);
            String tweet = status.getText().toUpperCase();

            if (tweet.contains("MAGA")){

                Long ID = status.getId();
                context.write(new Text("MAGA"), new Text(Long.toString(ID)));
            }

            if (tweet.contains("DICTATOR")){

                Long ID = status.getId();
                context.write(new Text("DICTATOR"), new Text(Long.toString(ID)));
            }

            if (tweet.contains("IMPEACH")){

                Long ID = status.getId();
                context.write(new Text("IMPEACH"), new Text(Long.toString(ID)));
            }

            if (tweet.contains("DRAIN")){

                Long ID = status.getId();
                context.write(new Text("DRAIN"), new Text(Long.toString(ID)));
            }

            if (tweet.contains("SWAMP")){

                Long ID = status.getId();
                context.write(new Text("SWAMP"), new Text(Long.toString(ID)));
            }

            if (tweet.contains("CHANGE")){

                Long ID = status.getId();
                context.write(new Text("CHANGE"), new Text(Long.toString(ID)));
            }

        }
        catch(TwitterException e){

        }

    }




}
