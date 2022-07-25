package com.bridzelab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressBookJDBC {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program on JDBC ...");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/address_book_service", "root", "Sravani@6086");
            System.out.println("Connection Done...");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM address_book WHERE state='Andhra' ");
            while (resultSet.next()) {
                System.out.println("Andhra state matches with contacts is : " + resultSet.getInt(1));
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
