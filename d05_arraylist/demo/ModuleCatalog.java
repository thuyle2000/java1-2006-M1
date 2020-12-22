/*
    Quan ly danh sach cac mon hoc trong ArrayList : 
    them mon hoc, in danh sach mon hoc, xoa 1 mon hoc bat ky theo ma so
 */
package demo;

import java.util.Scanner;
import java.util.ArrayList;
public class ModuleCatalog {

    public static void main(String[] args) {
        String op = "";
        ModuleCatalog mc = new ModuleCatalog();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n === MENU  [ArrayList] === ");
            System.out.println("1. Them mon hoc moi");
            System.out.println("2. Xem danh sach cac mon hoc");
            System.out.println("3. Xoa mon hoc theo ma so");
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
                    System.out.println(" Nhap ma so mon hoc muon xoa : ");
                    String ms = sc.nextLine().trim();
                    mc.delete(ms);
                    break;
                    
                case "4":
                    return;
            }
        }
    }


    //khai bao ArrayList [ds] chua cac doi tuong mon hoc {Module}
    ArrayList<Module> ds= new ArrayList<>();
    
    //ham them 1 doi tuong mon hoc moi, vo  ds[]
    void add() {

        //tao 1 doi tuong mon hoc moi
        Module m = new Module();

        //nhap du lieu vo mon hoc
        m.input();

        //cat doi tuong mon hoc moi vo [ds]
        ds.add(m);

        //thong bao thanh cong
        System.out.println("\n Da them mon hoc moi vo he thong !");
    }

    //ham xuat danh sach cac mon hoc 
    void display() {
        if (ds.size() == 0) {
            System.out.println(" HT chua co du lieu !");
            return;
        }

        System.out.println("Danh sach cac mon hoc");
        for (int i = 0; i < ds.size(); i++) {
            System.out.println(ds.get(i));
        }
    }

    /*
        ham tim kiem 1 mon hoc theo ma so. 
        ham tra ve 1 so nguyen: 
            <0 : Ko tim thay
            >=0 : vi tri index cua mon hoc trong mang ds[]
     */
    int search(String ms) {

        if (ds.isEmpty()) {
            System.out.println(" HT chua co du lieu !");
            return -1;
        }

        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).id.equals(ms)) {
                return i;
            }
        }

        return -1;
    }

    //ham xoa 1 phan tu trong mang theo ma so
    void delete(String ms) {
        if (ds.isEmpty()) {
            System.out.println(" HT chua co du lieu !");
            return;
        }

        //tim phan tu co ma so [ms] trong mang ds[]
        int index = search(ms);
        if (index == -1){
            System.out.println("Ko tim thay mon hoc muon xoa !");
            return;
        }
        
        ds.remove(index);
        
        System.out.println("Da xoa mon hoc co ma so " + ms + " thanh cong !");
    }
}
