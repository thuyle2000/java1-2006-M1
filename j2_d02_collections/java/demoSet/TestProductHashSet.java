/*
Menu de quan ly san pham trong hashset
 */
package demoSet;

import java.util.*;
public class TestProductHashSet {


    public static void main(String[] args) {
        TestProductHashSet o = new TestProductHashSet();
        o.menu();
    }
    
    private void menu() {
        String op = "";
        ProductHashSet mc = new ProductHashSet();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n === MENU  [HashSet] === ");
            System.out.println("1. Them san pham");
            System.out.println("2. Xem danh sach san pham");
            System.out.println("3. Tim san pham theo ten");
            System.out.println("4. Thoat");
            System.out.println("  Chon chuc nang [1-4]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    mc.add();
                    break;
                case "2":
                    mc.display();
                    break;
                case "3":
                    System.out.println(" Nhap ten san pham muon tim : ");
                    //mc.display(sc.nextLine().trim());
                    break;

                case "4":
                    return;
            }
        }
    }
    
}
