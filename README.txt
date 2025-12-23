# Java Assignment – Q1 to Q10

## Project Structure

JAVA_ASSIGNMENT
│
└── src
├── Q1_DecimalToBinary.java
├── Q2_CsvSum.java
├── Q3_DbRead.java
├── Q4_HttpCall.java
├── Q5_HashMapSearch.java
├── Q6_HttpServerWithDb.java
├── Q7_CommandLineInput.java
├── Q8_SqlQuery.txt
├── Q9_LoginPage.html
├── Q10_CsvDuplicateCount.java
├── input.csv
└── data.csv

## CSV Files

- `input.csv` → for Q2 (numbers to sum)  
- `data.csv` → for Q10 (to count duplicate col3 values)

---

## How to Run

**1. Open terminal in `src` folder**  

```bash
cd G:\JAVA_ASSIGNMENT\src

Compile & Run Java files one by one:

Q1 – Decimal to Binary
javac Q1_DecimalToBinary.java
java Q1_DecimalToBinary

Q2 – CSV Sum
javac Q2_CsvSum.java
java Q2_CsvSum


Check output.csv in same folder.

Q3 – Read from MySQL DB
javac -cp ".;G:\JAVA_ASSIGNMENT\lib\mysql-connector-java-8.1.0.jar" Q3_DbRead.java
java -cp ".;G:\JAVA_ASSIGNMENT\lib\mysql-connector-java-8.1.0.jar" Q3_DbRead


Ensure MySQL is running & database/table exists.

Q4 – HTTP URL Call
javac Q4_HttpCall.java
java Q4_HttpCall

Q5 – HashMap Store & Search
javac Q5_HashMapSearch.java
java Q5_HashMapSearch

Q6 – HTTP Server with DB
javac -cp ".;G:\JAVA_ASSIGNMENT\lib\mysql-connector-java-8.1.0.jar" Q6_HttpServerWithDb.java
java -cp ".;G:\JAVA_ASSIGNMENT\lib\mysql-connector-java-8.1.0.jar" Q6_HttpServerWithDb


Open browser: http://localhost:8080/emp

Q7 – Command Line Input
javac Q7_CommandLineInput.java
java Q7_CommandLineInput hello world 123

Q8 – SQL Query

Open Q8_SqlQuery.txt in MySQL Workbench / CLI and run

Q9 – Login Page

Open Q9_LoginPage.html in browser → test username/password

Q10 – CSV Duplicate Count
javac Q10_CsvDuplicateCount.java
java Q10_CsvDuplicateCount

Dependencies

Java JDK 8+

MySQL (for Q3, Q6)

MySQL Connector/J .jar included in classpath

Notes

CSV files kept in same folder as Java files → simplifies relative paths

Output files generated in same folder

Terminal execution recommended for correct file path handling

Programs verified to compile and run successfully


---
