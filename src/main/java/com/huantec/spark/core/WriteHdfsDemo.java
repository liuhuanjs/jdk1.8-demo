package com.huantec.spark.core;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * @author liuhuan 2018-09-06
 */
public class WriteHdfsDemo {
    public static void main(String[] args) {
//        JavaSparkContext jsc = new JavaSparkContext("local[1]", "demo");
        JavaSparkContext jsc = new JavaSparkContext("local[1]", "spark");
        System.out.println("hello spark");
        JavaRDD<String> stringJavaRDD = jsc.textFile("");

        stringJavaRDD.saveAsTextFile("");
        jsc.stop();
    }
}
