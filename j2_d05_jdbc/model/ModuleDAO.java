/*
Đây là class giao tiếp với bảng tbModule trong DB db2006M1, bao gồm các method:
- getList(): trả về 1 ArrayList chứa danh sách các môn học.
- insert(Module b) : thêm môn học mới [b] vô bảng.

 */
package model;

/**
 *
 * @author THUYLM
 */
import java.sql.*;
import java.util.*;

public class ModuleDAO {

    public static ArrayList<Module> getList() {
        ArrayList<Module> ds = new ArrayList<>();
        String sql = "select * from tbModule;";

        //1. tao ket noi
        Connection cn = MyLIB.getConnect();

        try {
            //2. tao doi tuong statemnet chua linh select sql
            Statement st = cn.createStatement();

            //3. thi hanh linh select sql tren doi tuong [st]
            ResultSet rs = st.executeQuery(sql);

            //4. duyệt kết quả trong [rs], đọc từng dòng bằng method next(), 
            //   nếu phương thức này return false -> hết dữ liệu để đọc !
            while (rs.next()) {
                //ở mỗi dòng, đọc từng cột = getXXX(xxx), và tạo thành 1 đối tượng Module [b]
                Module b = new Module();
                b.id = rs.getString(1);
                b.name = rs.getString(2);
                b.hours = rs.getInt(3);
                b.fee = rs.getInt(4);

                //dua [b] vo ds
                ds.add(b);
            }
            //5. đóng resource
            rs.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        // trả về đối tượng [ds] chứa danh sách các môn học đọc từ bảng tbModule
        return ds;
    }

    public static int insert(Module b) {
        int r = -1;
        String sql = "insert tbModule values(?, ?, ?, ?);";

        //1. tao ket noi
        Connection cn = MyLIB.getConnect();

        try {
            //2. tao doi statement chua linh insert
            PreparedStatement pst = cn.prepareStatement(sql);

            //3. gán giá trị cho cá  tham số ? trong lệnh insert = dữ liệu tương ứng của đối tượng Module [b] 
            pst.setString(1, b.id);
            pst.setString(2, b.name);
            pst.setInt(3, b.hours);
            pst.setInt(4, b.fee);

            //4. thi hanh linh insert, trả về số nguyên r (số dòng được thêm mới) 
            r = pst.executeUpdate();

            //5. dong resource
            pst.close();
            cn.close();

        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }

        return r;
    }

    public static int delete(String id) {
        int r = -1;
        String sql = "delete from tbModule where id = ?";

        //1. tao ket noi'
        Connection cn = MyLIB.getConnect();

        try {
            //2. tao doi tuong prepare statement chua linh delete
            PreparedStatement pst = cn.prepareStatement(sql);

            //3. gan ma so mon hoc muon xoa [id] cho tham so ? 
            pst.setString(1, id);

            //4. thi hanh linh delete
            r = pst.executeUpdate();

            //5. dong resource
            pst.close();
            cn.close();

        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }

        return r;
    }

    public static int update(Module b) {
        int r = -1;
        
        String sql = "update tbModule set name=?, hours=?, fee=? where id=?";

        //1. tao ket noi'
        Connection cn = MyLIB.getConnect();

        try {
            //2. tao doi statement chua linh update
            PreparedStatement pst = cn.prepareStatement(sql);

            //3. gan gia tri cho cac tham so ? bang du lieu cua doi tuong b tuong ung
            pst.setString(1, b.name);
            pst.setInt(2, b.hours);
            pst.setInt(3, b.fee);
            pst.setString(4, b.id);

            //4. thi hanh linh update
            r = pst.executeUpdate();

            //5. dong resource
            pst.close();
            cn.close();

        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }

        return r;
    }

}
