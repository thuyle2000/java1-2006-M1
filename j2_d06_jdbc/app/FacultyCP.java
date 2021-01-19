/*
Quản lý danh sách các giao vien trong bảng tbFaculty:
    - thêm
    - liệt kê
    - xóa 
    - sửa
 */
package app;

/**
 *
 * @author THUYLM
 */
import model.*;
import java.util.*;

public class FacultyCP {

    public static void main(String[] args) {
        FacultyCP tm = new FacultyCP();
        tm.menu();
    }

    private void menu() {
        String op = null;
        Faculty fa = null;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n === MENU ===");
            System.out.println("1. Liet ke danh sanh cac giang vien");
            System.out.println("2. Them giang vien moi");
            System.out.println("3. Xoa 1 giang vien theo ma so");
            System.out.println("===============================");
            
            System.out.println("4. Dieu chinh thong tin giang vien");
            System.out.println("5. Tim kiem giang vien theo ten");
            System.out.println("6. Tim kiem giang vien day tren 2 mon hoc");
            System.out.println("7. Thoat");
            System.out.println("   >> chon ma so chuc nang [1-7] : ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    System.out.println("\n >> Danh sach cac giang vien <<");
                    FacultyDAO.getList().forEach(System.out::println);
                    break;

                case "2":
                    fa = new Faculty();
                    fa.input();
                    FacultyDAO.insert(fa);

                    break;

                case "3":

                    System.out.println("\n >> Nhap ma so giang vien muon xoa : ");
                    FacultyDAO.delete(sc.nextLine().trim());
                    break;

                case "4":
                    System.out.println("\n >> Nhap thong tin giang vien muon dieu chinh : ");
                    fa = new Faculty();
                    fa.input();
                    FacultyDAO.update(fa.id, fa);
                    break;

                case "5":
                    break;
                    
                case "6":
                    break;
                    
                case "7":
                    return;

            }
        }

    }

}
