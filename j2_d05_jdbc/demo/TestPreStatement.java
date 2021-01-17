package demo;

import java.sql.*;
import java.util.Scanner;

public class TestPreStatement {

    public static void main(String[] args) {
        Connection conn = null;

        try {

            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=db2006M1";
            String user = "sa";
            String pass = "123";
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {

                System.out.println("  >> Nhap thong tin mon hoc: ");
                Scanner sc = new Scanner(System.in);

                System.out.println("Nhap id: ");
                String id = sc.nextLine().trim();

                System.out.println("Nhap name: ");
                String name = sc.nextLine().trim();

                System.out.println("Nhap hour: ");
                int hours = Integer.parseInt(sc.nextLine().trim());

                System.out.println("Nhap fee: ");
                int fee = Integer.parseInt(sc.nextLine().trim());

                /*
                //tao 1 doi tuong statement chua linh insert sql
                Statement st = conn.createStatement();

                //thuc hien linh insert  vo bang tbModule
                String sql = "insert tbModule values ('"+id+"', '"+name+"',"+hours+","+fee+")";
                int rows = st.executeUpdate(sql);
                 */
                
                //tao 1 doi tuong prepare statement chua linh insert sql
                String sql = "insert tbModule values (?,?,?,?)";
                PreparedStatement st = conn.prepareStatement(sql);
                //set du lieu cho cac tham so ?
                st.setString(1, id);
                st.setString(2, name);
                st.setInt(3, hours);
                st.setInt(4, fee);

                //thuc hien linh insert  vo bang tbModule                
                int rows = st.executeUpdate();

                System.out.println(">> Them mon hoc moi thanh cong !!! ");

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
