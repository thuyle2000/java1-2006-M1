/*
    Quan ly danh sach san pham trong hashmap
 */
package demoMap;

import data.Product;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductMap {

    HashMap<String, Product> ds = new HashMap<>();
    String fname = "F:/sanpham.txt";

    public ProductMap() {
        readText();
    }
    

    public void add() {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        //nhap id
        while (true) {
            System.out.println("Nhap id: ");
            p.id = sc.nextLine().trim();

            if (ds.containsKey(p.id)) {
                System.out.println("  >> Ma so da ton tai. Vui long nhap lai !");
                continue;
            }
            break;
        }

        //nhap ten sp
        System.out.println("Nhap name: ");
        p.name = sc.nextLine().trim();

        //nhap don gia
        while (true) {
            try {
                System.out.println("Nhap price: ");
                p.price = Integer.parseInt(sc.nextLine().trim());
                if (p.price < 0) {
                    throw new NumberFormatException("Don gia phai >=0 !!!");
                }
                break;

            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }

        //dua san pham moi vo ds
        ds.put(p.id, p);
        System.out.println("Da them san pham moi vo HT. \n");
    }
      
    //ham in danh sach san pham
    public void display(){
        if(ds.isEmpty()){
            System.out.println(" >> HT chua co du lieu");
            return;
        }
        
        System.out.println("\n *** Danh sach san pham *** ");
        ds.values().forEach(System.out::println);

    }
    
    //ham ghi ds vo tap tin van ban
    public void saveText(){
        try {
            
            PrintStream ps = new PrintStream(fname);
            ds.values().forEach(ps::println);
            ps.close();
            
            //xem noi dung tap tin trong notepad
            Runtime r = Runtime.getRuntime();
            r.exec("notepad   " + fname);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductMap.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //ham doc tap tin van, phan tich du lieu, luu vo ds
    public void readText(){
        try {
            String[] items = null;
            String line = null;
            BufferedReader br = new BufferedReader(new FileReader(fname));
            while(br.ready()){
                line = br.readLine().trim();
                System.out.println(line);
                items = line.split(","); // cat chuoi tai cac vi tri [,] => mang
                if(items.length==3){
                    Product p = new Product();
                    p.id = items[0].trim();
                    p.name = items[1].trim();
                    p.price = Integer.parseInt(items[2].trim());
                    
                    //dua vo danh sach
                    ds.put(p.id, p);
                }
            }
            
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductMap.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
