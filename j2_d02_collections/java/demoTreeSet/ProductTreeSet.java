package demoTreeSet;

import java.util.*;
import data.*;

public class ProductTreeSet {

    // TreeSet<Product> ds = new TreeSet<>();
    // TreeSet<Product> ds = new TreeSet<>((Product o1, Product o2) -> o1.name.compareTo(o2.name));
    TreeSet<Product> ds = new TreeSet<>((Product o1, Product o2) -> o1.price-o2.price);

    public void add() {

        Product p = new Product();

        //nhap du lieu cho san pham p
        input(p);

        //dua vo danh sach
        if (ds.add(p)) {
            //tb thanh cong
            System.out.println("Da them san pham moi vo HT !");
        } else {
            //tb that bai
            System.out.println("ID da ton tai. Tu choi them san pham moi vo HT !");
        }
    }

    private void input(Product p) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap Id: ");
        p.id = sc.nextLine().trim();

        System.out.println("Nhap Name: ");
        p.name = sc.nextLine().trim();

        while (true) {
            try {
                System.out.println("Nhap Price: ");
                p.price = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }

    }

    public void display() {
        if (ds.isEmpty()) {
            System.out.println(" >> HT chua co du lieu");
            return;
        }

        System.out.println("\n  *** Danh sach san pham ***");
        ds.forEach(System.out::println);
    }

}
