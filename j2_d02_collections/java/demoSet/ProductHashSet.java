/*
Quan ly danh sach san pham trong HashSet
 */
package demoSet;

import java.util.*;
import java.util.stream.*;
import data.*;

public class ProductHashSet {

    HashSet<Product> ds = new HashSet<>();

    public void add() {

        Product p = new Product();

        //nhap du lieu cho san pham p
        input(p);

        //dua vo danh sach
        if (ds.add(p)) {
            //tb thanh cong
            System.out.println("Da them san pham moi vo HT !");
        }
        else{
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
    
    
    //xoa san pham theo ma so
    public void remove(String masoSP){
        if(ds.isEmpty()){
            System.out.println(" >> HT chua co du lieu");
            return;
        }
        
        Product p = ds.stream().filter(item->item.id.equals(masoSP)).findFirst().orElse(null);
        
        if(p==null){
            System.out.println(" >> KO tim thay san pham muon xoa !!!");
        }
        else{
            ds.remove(p);
            System.out.println(" >> Da xoa san pham thanh cong !!!");
        }
    }

}
