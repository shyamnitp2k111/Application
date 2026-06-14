package com.springbootapplication.application.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class SampleJDBC implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        createUserTable();
        boolean operation = insertUserDetail();
        System.out.println("operation is "+ operation);
    }

    private Connection getConnectionManager() throws ClassNotFoundException {
        try {
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection("jdbc:h2:mem:testdb", "SA", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createUserTable() {
        try {
            Connection connection = getConnectionManager();
            Statement statementQuery = connection.createStatement();
            String sql = "CREATE TABLE users (user_id INT AUTO_INCREMENT PRIMARY KEY, user_name VARCHAR(100),age INT )";
            statementQuery.executeUpdate(sql);
        }
        catch (SQLException e) { /** handle exception **/ } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally { /** close statementQuery and db connection explicitly **/ }
    }

    private boolean insertUserDetail() throws ClassNotFoundException {
        Connection connection = getConnectionManager();
        String sqlQuery = "INSERT INTO users (user_name, age) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, "shyam");
            preparedStatement.setInt(2, 32);
            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
