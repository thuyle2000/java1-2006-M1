/*
Đây là class giao tiếp với bảng tbFaculty trong DB db2006M1, bao gồm các method:
    - getList(): trả về 1 ArrayList chứa danh sách các gian vien.
    - insert(Faculty b) : thêm giang vien mới [b] vô bảng.
    - delete(String id) : xoa giang vien theo ma so 
    - update(String id, Faculty b) : thay doi thong tin giao vien co ma so id

Cac phuong thuc CRUD tren duoc thuc hien thong qua ResultSet

 */
package model;

/**
 *
 * @author THUYLM
 */
import java.sql.*;
import java.util.*;

public class FacultyDAO {

    public static Connection cn = MyLIB.getConnect();
    public static ResultSet rs;
    

    public static ArrayList<Faculty> getList() {
        ArrayList<Faculty> ds = new ArrayList<>();
        String sql = "select * from tbFaculty;";
        try {

            //1. Neu ResultSet [rs] = null: khoi tao de chua ket qua cua lenh [select * from tbFaculty]
            if (rs == null) {
                //1.1. tao doi tuong statemnet chua linh select sql
                Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

                //1.2. thi hanh linh select sql tren doi tuong [st]
                rs = st.executeQuery(sql);
            }

            //2. chuyen cursor trong [rs] ve truoc dong dau tien
            rs.beforeFirst();

            //3. duyệt kết quả trong [rs], đọc từng dòng bằng method next(), 
            //   nếu phương thức này return false -> hết dữ liệu để đọc !
            while (rs.next()) {

                //4. neu dong hien tai dang bi danh dau xoa, ve dau vong lap 
                //   de di chuyen den dong ke tiep 
                if (rs.rowDeleted()) {
                    continue;
                }

                //4. ở mỗi dòng, đọc từng cột = getXXX(xxx), và tạo thành 1 đối tượng Faculty [b]
                Faculty b = new Faculty();
                b.id = rs.getString(1);
                b.name = rs.getString(2);
                b.email = rs.getString(3);
                b.phone = rs.getString(4);

                //5. dua [b] vo ds
                ds.add(b);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        // trả về đối tượng [ds] chứa danh sách các môn học đọc từ bảng tbModule
        return ds;
    }

    
    
    public static void insert(Faculty b) {

        try {
            //1. di chuyen cursor den dong trong 
            rs.moveToInsertRow();

            //2. gán giá trị cho các cot = dữ liệu tương ứng của đối tượng Faculty [b]
            rs.updateString(1, b.id);
            rs.updateString(2, b.name);
            rs.updateString(3, b.email);
            rs.updateString(4, b.phone);

            //3. thi hanh linh insert - cap nhat dong moi ve database 
            rs.insertRow();
            
            System.out.println("\n Da them giang vien moi vo DB.");

        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }

    }

    
    public static void delete(String id) {

        try {
            //1. chuyen cursor trong [rs] ve truoc dong dau tien
            rs.beforeFirst();
            
            //2. di chuyen den dong muon xoa
            while (rs.next()) {
                if (rs.getString(1).equals(id) && !rs.rowDeleted()) {
                    rs.deleteRow();
                    System.out.println("\n Da xoa thanh cong");
                    return;
                }
            }
            System.out.println("\n Khong tim thay giao vien muon xoa");

        } catch (SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }

    }

    public static void update(String id, Faculty b) {

    }

}
