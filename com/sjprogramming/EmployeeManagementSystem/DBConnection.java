package com.sjprogramming.EmployeeManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;
    public static Connection createDBConnection(){
         try{
             //Load driver
             Class.forName("com.mysql.cj.jdbc.Driver");
             //get connection
             String url="jdbc:mysql://localhost:3306/employeedb?useSSL=false";
             String username="root";
             String password="Manu@121881";
             con = DriverManager.getConnection(url,username,password);
         }catch(Exception ex){
             ex.printStackTrace();
         }
        return con;
    }
}
