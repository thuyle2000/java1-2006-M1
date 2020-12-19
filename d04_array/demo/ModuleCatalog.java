/*
    Quan ly danh sach cac mon hoc : them mon hoc, va in danh sach mon hoc
 */
package demo;

import java.util.Scanner;

public class ModuleCatalog {

    public static void main(String[] args) {
        String op ="";
        ModuleCatalog mc = new ModuleCatalog();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("\n MENU");
            System.out.println("1. Them mon hoc moi");
            System.out.println("2. Xem danh sach cac mon hoc");
            System.out.println("3. Thoat");
            System.out.println("  Chon chuc nang [1-3]: ");
            op =sc.nextLine().trim();
            
            switch(op){
                case "1": mc.add(); break;
                case "2": mc.display(); break;
                case "3": return;
            }            
        }
    }
    
    final int max = 10; //hang so qui dinh so phan tu toi da cua mang [ds]
    int count = 0;      //bien dem tong so phan tu hien co trong mang [ds]     
    Module[] ds = new Module[max];    // khai bao mang [ds] co [max] phan tu, moi pt la 1 mon hoc 
    
    
    //ham them 1 doi tuong mon hoc moi, vo mang ds[]
    void add(){
        //kiem tra bo nho cua mang ds[]
        if(count==max){
            System.out.println("\n He thong khong con du bo nho ! Tu choi them moi !");
            return; // ket thuc ham
        }
        
        //tao 1 doi tuong mon hoc moi
        Module m = new Module();
        
        //nhap du lieu vo mon hoc
        m.input();
        
        //cat doi tuong mon hoc moi vo mang ds[]
        ds[count]= m;
        
        //cap nhat lai bien dem count
        count++;
        
        //thong bao thanh cong
        System.out.println("\n Da them mon hoc moi vo he thong !");       
    }
    
    
    //ham xuat danh sach cac mon hoc 
    void display(){
        if(count ==0) {
            System.out.println(" HT chua co du lieu !");
            return;
        }
        
        System.out.println("Danh sach cac mon hoc");
        for (int i = 0; i < count; i++) {
            System.out.println(ds[i]);
        }
    }
}
