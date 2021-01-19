package demo;

import java.sql.*;
import java.util.Scanner;

public class TestCallStatement {

    public static void main(String[] args) {
        Connection conn = null;

        try {

            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=db2006M1";
            String user = "sa";
            String pass = "123";
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {

                Scanner sc = new Scanner(System.in);
                System.out.println("  >> Nhap ma so Giao vien: ");
                String maGV = sc.nextLine().trim();

                //tao 1 doi tuong callable statement chua linh goi store 
                String sql = "{call up_FaModule(?,?)}";
                CallableStatement st = conn.prepareCall(sql);

                //set du lieu cho cac tham so ?
                st.setString(1, maGV);
                st.registerOutParameter(2, java.sql.Types.INTEGER);

                //thuc hien store va luu ket qua vo Resultset rs              
                ResultSet rs = st.executeQuery();
                
                System.out.println(">> Danh sach cac mon hoc <<");
                while (rs.next()) {
                    System.out.printf(" %-6s, %s \n", rs.getString(3), rs.getString(4));
                }
                
                int count = st.getInt(2);
                System.out.printf(">> So mon hoc giao vien [%s] phu trach : %d \n ", maGV, count);
             
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
