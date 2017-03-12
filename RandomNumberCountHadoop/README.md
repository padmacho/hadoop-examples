# RandomNumberCount - Hadoop   
Simple Map reduce program that is written in Java that counts the number of occurrence of numbers 0 to 100 in a given file

# Build
		mvn clean package
# Run in standalone JVM
* The program take dataset-small.txt and writes out put to folder ./target/output

		mvn exec:java -Dexec.args="dataset-small.txt ./target/output" -Dexec.mainClass="org.eduami.hadoop.example.randomnumbercounthadoop.RandomNumberCount"
# Output
* out put of the program can be viewed buy running bellow command
		
		cat ./target/output/part-r-00000		
