/*
Quan ly danh sach san pham trong List
 */
package demoList;

import java.util.*;
import data.*;
import java.util.stream.Collectors;

public class ProductList {

    List<Product> ds = new ArrayList<>();

    public void add() {

        Product p = new Product();
        
        //nhap du lieu cho san pham p
        input(p);
        
        //dua vo danh sach
        ds.add(p);
        
        //tb thanh cong
        System.out.println("Da them san pham moi vo HT !");

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
    
    public void display(){
        if(ds.isEmpty()){
            System.out.println(" >> HT chua co du lieu");
            return;
        }
        
        System.out.println("\n  *** Danh sach san pham ***");
        ds.forEach(System.out::println);
    }
    
    
    //tim san pham theo ten
    public void display(String nameSearch){
        if(ds.isEmpty()){
            System.out.println(" >> HT chua co du lieu");
            return;
        }
        
        int cntName = 0;
        System.out.println("\n  *** Danh sach san pham ***");
        for (int i = 0; i < ds.size(); i++) {
            if(ds.get(i).name.contains(nameSearch)){
                System.out.println(ds.get(i));
                cntName++;
            }
        }
    
        if(cntName==0){
            System.out.printf(" KO tim thay san pham co ten %s !", nameSearch);
        }
        
        
        /***  ***/
        List x = ds.stream().filter(item->item.name.contains(nameSearch)).collect(Collectors.toList());
        if (x.isEmpty()){
            System.out.println("\n  >>> NOT FOUND <<<");
        }
        else{
            System.out.println("\n >>> PRODUCT LIST <<<");
            x.forEach(System.out::println);
        }
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
