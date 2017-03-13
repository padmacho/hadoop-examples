# RandomNumberCount - Hadoop   
Simple Map reduce program that is written in Java that counts the number of occurrence of numbers 0 to 100 in a given file

# Build
		mvn clean package
# Run in standalone JVM
* The program take dataset-small.txt and writes out put to folder ./target/output

		mvn exec:java -Dexec.args="dataset-small.txt ./target/output" -Dexec.mainClass="org.eduami.hadoop.example.randomnumbercounthadoop.RandomNumberCountDriver"

# Output
* out put of the program can be viewed buy running bellow command
		
		cat ./target/output/part-r-00000		

# Run on local (Stand alone) JVM

		hadoop jar ./target/randomnumbercounthadoopwithjobdriver-0.0.1-SNAPSHOT.jar org.eduami.hadoop.example.randomnumbercounthadoop.RandomNumberCountDriver -conf ./src/main/resources/conf/hadoop-local.xml dataset-small.txt ./target/output 
		
# Running on pseudodistributed cluster
* Set hadoop user as vagrant

	export HADOOP_USER_NAME=vagrant
* Copy dataset-small.txt to hdfs

	hadoop fs -conf ./src/main/resources/conf/hadoop-localhost.xml -copyFromLocal dataset-small.txt /user/vagrant/dataset-small.txt
	
* Run the map reduce job

	hadoop jar ./target/randomnumbercounthadoopwithjobdriver-0.0.1-SNAPSHOT.jar org.eduami.hadoop.example.randomnumbercounthadoop.RandomNumberCountDriver -conf ./src/main/resources/conf/hadoop-localhost.xml dataset-small.txt ./target/output

* view output
	
	hadoop fs -conf ./src/main/resources/conf/hadoop-localhost.xml -cat /user/vagrant/target/output/part-r-00000  
	
# Running on cluster cluster
* Set hadoop user as vagrant

	export HADOOP_USER_NAME=vagrant
* Copy dataset-small.txt to hdfs

	hadoop fs -conf ./src/main/resources/conf/hadoop-cluster.xml -copyFromLocal dataset-small.txt /user/vagrant/dataset-small.txt
	
* Run the map reduce job

	hadoop jar ./target/randomnumbercounthadoopwithjobdriver-0.0.1-SNAPSHOT.jar org.eduami.hadoop.example.randomnumbercounthadoop.RandomNumberCountDriver -conf ./src/main/resources/conf/hadoop-cluster.xml dataset-small.txt ./target/output

* view output
	
	hadoop fs -conf ./src/main/resources/conf/hadoop-cluster.xml -cat /user/vagrant/target/output/part-r-00000  