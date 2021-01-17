/*
Quản lý danh sách các môn học trong bảng tbModule:
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

public class TestModule {

    public static void main(String[] args) {
        TestModule tm = new TestModule();
        tm.menu();
    }

    private void menu() {
        String op = null;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n === MENU ===");
            System.out.println("1. liet ke danh sanh cac mon hoc");
            System.out.println("2. Them mon hoc moi");
            System.out.println("3. Xoa 1 mon hoc theo ma so");
            System.out.println("4. Dieu chinh thong tin mon hoc");
            System.out.println("===============================");
            System.out.println("5. Tim kiem mon hoc don gia [tu x -> y] ");
            System.out.println("6. Tim kiem mon hoc theo ten");
            System.out.println("7. Thoat");
            System.out.println("   >> chon ma so chuc nang [1-7] : ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    System.out.println("\n >> Danh sach cac mon hoc <<");
                    ModuleDAO.getList().forEach(System.out::println);
                    break;

                case "2":
                    model.Module m = new model.Module();
                    m.input();
                    if (ModuleDAO.insert(m) > 0) {
                        System.out.println(" >> Them mon hoc moi thanh cong !");
                    } else {
                        System.out.println(" >> Them mon hoc moi that bai !");
                    }

                    break;

                case "3":

                    System.out.println("\n >> Nhap ma so mon hoc muon xoa : ");
                    if (ModuleDAO.delete(sc.nextLine().trim()) > 0) {
                        System.out.println(" >> Xoa mon hoc thanh cong !");
                    } else {
                        System.out.println(" >> Xoa mon hoc that bai !");
                    }
                    break;

                case "4":
                    System.out.println("\n >> Nhap thong tin mon hoc muon dieu chinh : ");
                    model.Module m2 = new model.Module();
                    m2.input();
                    if (ModuleDAO.update(m2) > 0) {
                        System.out.println(" >> Thay doi thong tin mon hoc thanh cong !");
                    } else {
                        System.out.println(" >> Thay doi thong tin mon hoc mon hoc moi that bai !");
                    }
                    break;
                    
                case "5": break;
                case "6": break;
                case "7":
                    return;

            }
        }

    }

}
