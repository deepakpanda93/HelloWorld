import org.apache.spark.sql.SparkSession

object HelloWorld {
   def main(args: Array[String]): Unit ={
     println("Hello World")
     val list = List(1,2,3,4,5)
     println(list)
     val spark = SparkSession.builder().master("local[*]").getOrCreate()
     spark.sparkContext.setLogLevel("WARN")
     val rdd = spark.sparkContext.parallelize(list)
     rdd.collect().foreach(println)
   }

}
