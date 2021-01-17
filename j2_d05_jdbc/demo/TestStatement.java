
package demo;

import java.sql.*;
public class TestStatement {


    public static void main(String[] args) {
        Connection conn = null;

        try {

            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=db2006M1";
            String user = "sa";
            String pass = "123";
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {
                
                //tao 1 doi tuong statement chua linh select sql
                Statement st = conn.createStatement();
                
                //thuc hien linh select bang tbModule
                ResultSet rs = st.executeQuery("select * from tbModule");
                ResultSetMetaData meta = rs.getMetaData();
                
                System.out.println("Cau truc bang : ");
                int cols= meta.getColumnCount();
                
                for (int i = 1; i <= cols; i++) {
                    System.out.printf(" %s : %s(%d)\n",meta.getColumnName(i),meta.getColumnTypeName(i), meta.getColumnDisplaySize(i));
                }
                    
                    
                System.out.println("\n >> Danh sach cac mon hoc  <<");
                //doc tung dong trong [rs] bang ham next()
                while(rs.next()){
                    //doc du lieu cua tung cot trong 1 dong bang ham getxxx()
                    System.out.printf("%s, ", rs.getString(1)); // cot id
                    System.out.printf("%s, ", rs.getString(2)); // cot name
                    System.out.printf("%d, ", rs.getInt(3)); // cot hours
                    System.out.printf("%d, \n", rs.getInt(4)); // cot fee
                }
                
                rs.close();
                
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
