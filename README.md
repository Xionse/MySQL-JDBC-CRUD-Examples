# MySQL JDBC CRUD Examples

## Getting Started
This project provides examples of how to perform CRUD (Create, Read, Update, and Delete) operations on a MySQL database using JDBC in Java. The following operations are demonstrated:
- Creating a database
- Dropping a database
- Creating a table
- Dropping a table
- Inserting records into a table
- Selecting records from a table

## Prerequisites
- MySQL server installed and running
- Java Development Kit (JDK) version 8 or later
- MySQL Server version 8.0 or later
- MySQL Connector/J, the official JDBC driver for MySQL
- An IDE of your choice (e.g. Eclipse, IntelliJ IDEA)

## Usage
1. Clone the repository git clone `https://github.com/xionse/MySQL-JDBC-CRUD-Examples.git`
2. Import the project into your preferred Java IDE
3. Add the MySQL Connector/J library to the project's classpath
4. Update the JDBC connection settings in the source code to match your MySQL server's settings (username, password, and url)
5. Run the programe

## Note
- Be careful when running the DropDatabase.java and DropTable.java examples as they will delete the specified database and table permanently.
- Be sure to close the statement and connection after using it in the finally block in each program.
- If the specified database or table does not exist, the program will throw an exception, you should consider handling it.

## Built With
- Java version 8
- MySQL version 8.0
- MySQL Connector/J version 8.0

## Author
[xionse](https://github.com/Xionse) 
## Acknowledgments
??
## Conclusion
This project will provide a solid foundation for anyone looking to work with MySQL databases using JDBC in Java. The examples provided cover the basic CRUD operations, and can be easily modified to suit your specific needs


