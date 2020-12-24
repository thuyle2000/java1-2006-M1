/*
Quan ly danh sach cac doi tuong hinh hoc, bao gom chuc nang:
- them hinh chu nhat
- them hinh tron
- them hinh tam giac
- in danh sach cac hinh
 */
package app;

import data.*;
import java.util.*;

public class ShapeCatalog {

    private final int max = 10;
    private int next = 0;
    private Shape[] ds = new Shape[max];

    public static void main(String[] args) {
        ShapeCatalog p = new ShapeCatalog();
        p.menu();
    }

    //them 1 hinh chu nhat vo ds[]
    void addRec() {
        if (next == max) {
            System.out.println("HT het bo nho luu tru du lieu !!!");
            return;
        }

        ds[next] = new Rectangle();
        ds[next].input();
        next++;
    }

    //them 1 hinh tron vo ds[]
    void addCircle() {
        if (next == max) {
            System.out.println("HT het bo nho luu tru du lieu !!!");
            return;
        }

        ds[next] = new Circle();
        ds[next].input();
        next++;
    }
    
    //them 1 hinh tam giac vo ds[]
    void addTriangle() {
        if (next == max) {
            System.out.println("HT het bo nho luu tru du lieu !!!");
            return;
        }        
        ds[next] = new TriangleSon();
        ds[next].input();
        next++;
    }
    
    //in danh sach cac doi tuong hinh hoc
    void display(){
        if(next==0){
            System.out.println("HT chua co data !");
            return;
        }
        
        System.out.println("\n === DS cac doi tuong Hinh Hoc ===");
        for (int i = 0; i < next; i++) {
            System.out.println(ds[i]);
        }
    }
    
    void menu(){
        Scanner sc = new Scanner(System.in);
        String op = "";
        
        while(true){
            System.out.println("\n +++ MENU +++");
            System.out.println(" 1. Them Hinh Tron");
            System.out.println(" 2. Them Hinh Chu Nhat");
            System.out.println(" 3. Them Hinh Tam Giac");
            System.out.println(" 4. In danh sach cac doi tuong hinh hoc");
            System.out.println(" 5. Thoat");
            System.out.println(" Chon chuc nang tu [1-5]: ");
            
            op = sc.nextLine();
            
            switch(op){
                case "1": addCircle(); break;
                case "2": addRec(); break;
                case "3": addTriangle(); break;
                case "4": display(); break;
                case "5": return;
            }
        }
    }
}
