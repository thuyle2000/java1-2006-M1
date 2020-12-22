/*
    Quan ly danh sach cac mon hoc : them mon hoc, va in danh sach mon hoc
 */
package demo;

import java.util.Scanner;

public class ModuleCatalog {

    public static void main(String[] args) {
        String op = "";
        ModuleCatalog mc = new ModuleCatalog();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n MENU");
            System.out.println("1. Them mon hoc moi");
            System.out.println("2. Xem danh sach cac mon hoc");
            System.out.println("3. Xoa mon hoc theo ma so");
            System.out.println("4. Tim mon hoc theo ten");
            System.out.println("5. Thoat");
            System.out.println("  Chon chuc nang [1-5]: ");
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
                    System.out.println("Nhap ten mon hoc muon tim: ");
                    mc.display(sc.nextLine().trim());
                    break;
                    
                case "5":
                    return;
            }
        }
    }

    final int max = 10; //hang so qui dinh so phan tu toi da cua mang [ds]
    int count = 0;      //bien dem tong so phan tu hien co trong mang [ds]     
    Module[] ds = new Module[max];    // khai bao mang [ds] co [max] phan tu, moi pt la 1 mon hoc 

    //ham them 1 doi tuong mon hoc moi, vo mang ds[]
    void add() {
        //kiem tra bo nho cua mang ds[]
        if (count == max) {
            System.out.println("\n He thong khong con du bo nho ! Tu choi them moi !");
            return; // ket thuc ham
        }

        //tao 1 doi tuong mon hoc moi
        Module m = new Module();

        //nhap du lieu vo mon hoc
        m.input();

        //cat doi tuong mon hoc moi vo mang ds[]
        ds[count] = m;

        //cap nhat lai bien dem count
        count++;

        //thong bao thanh cong
        System.out.println("\n Da them mon hoc moi vo he thong !");
    }

    //ham xuat danh sach cac mon hoc 
    void display() {
        if (count == 0) {
            System.out.println(" HT chua co du lieu !");
            return;
        }

        System.out.println("Danh sach cac mon hoc");
        for (int i = 0; i < count; i++) {
            System.out.println(ds[i]);
        }
    }

    /*
        ham tim kiem 1 mon hoc theo ma so. 
        ham tra ve 1 so nguyen: 
            <0 : Ko tim thay
            >=0 : vi tri index cua mon hoc trong mang ds[]
     */
    int search(String ms) {

        if (count == 0) {
            System.out.println(" HT chua co du lieu !");
            return -1;
        }

        for (int i = 0; i < count; i++) {
            if (ds[i].id.equals(ms)) {
                return i;
            }
        }

        return -1;
    }

    //ham xoa 1 phan tu trong mang theo ma so
    void delete(String ms) {
        if (count == 0) {
            System.out.println(" HT chua co du lieu !");
            return;
        }

        //tim phan tu co ma so [ms] trong mang ds[]
        int index = search(ms);
        if (index == -1){
            System.out.println("Ko tim thay mon hoc muon xoa !");
            return;
        }
        
        //xoa phan tu tim thay ra khoi mang ds[]: day toan bo cac phan tu ben duoi vi tri index
        //len tren 1 dong
        for(int i=index; i<count-1; i++){
            ds[i] = ds[i+1];
        }
        
        //cap nhat lai count
        count--;
        System.out.println("Da xoa mon hoc co ma so " + ms + " thanh cong !");
    }
    
    //ham xuat ds cac mon hoc theo ten muon tim
    void display(String tenMH){
        if (count == 0) {
            System.out.println(" HT chua co du lieu !");
            return;
        }
        
        int countTenMH=0;
        tenMH = tenMH.toLowerCase();
        for(int i=0; i<count; i++){
            if(ds[i].name.toLowerCase().contains(tenMH)){
                System.out.println(ds[i]); // in doi tuong mon hoc o dong i
                countTenMH++;
            }
        } //ket thuc FOR
        
        if(countTenMH==0){
            System.out.println("KO TIM THAY !!! ");
        }
        
    }
    
}
