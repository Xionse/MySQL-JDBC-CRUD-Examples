String createTableSQL = "CREATE TABLE employees"
        + "(id INT PRIMARY KEY, "
        + "name VARCHAR(255), "
        + "email VARCHAR(255))";

Statement statement = connection.createStatement();
statement.execute(createTableSQL);


// Prepare statement 
String createTableSQL = "CREATE TABLE employees"
        + "(id INT PRIMARY KEY, "
        + "name VARCHAR(255), "
        + "email VARCHAR(255))";
PreparedStatement preparedStatement = connection.prepareStatement(createTableSQL);
preparedStatement.executeUpdate();
