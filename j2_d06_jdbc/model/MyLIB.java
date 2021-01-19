package model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLIB {

    public static Connection getConnect() {
        Connection cn = null;

        try {
          
            String url = "jdbc:sqlserver://127.0.0.1:1433;database=db2006M1";
            cn = DriverManager.getConnection(url, "sa", "123");

        } catch (SQLException ex) {
            Logger.getLogger(MyLIB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cn;

    }

    public static void main(String[] args) {
        Connection cn = getConnect();
        if (cn == null) {
            System.out.println("FAIL !");
        } else {
            System.out.println("SUCCEED !");
        }
    }
}
