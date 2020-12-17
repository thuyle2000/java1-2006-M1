/*
Mo ta 1 cau truc du lieu Sinh Vien.
 - thuoc tinh : ma so, ten, gioi tinh, diem kq
 - phuong thuc: nhap(), xuat()
*/
package demo;

import java.util.Scanner;

public class Student {
    //mo ta thuoc tinh
    public String id, name;
    public boolean gender=true;
    public int mark=100;
    public static String centerName = "FPT Aptech";
    public static int count;

    public Student() {
        count++;
    }
    
    
    //ham nhap thong tin sinh vien
    public void input(){
        //khoi tao doi tuong chua cac ham nhap du lieu
        Scanner sc = new Scanner(System.in);
        
        //nhap ma so va luu vo bien id
        System.out.println("nhap id: ");
        id = sc.nextLine();
        
        //nhap ten va luu vo bien name
        System.out.println("nhap ten: ");
        name = sc.nextLine();
        
        //nhap gioi tinh
        System.out.println("nhap gioi tinh (true|false): ");
        gender = sc.nextBoolean();
        
        //nhap diem kq thi
        System.out.println("nhap diem KQ: ");
        mark = sc.nextInt();
    }
    
    //ham xuat thong tin sinh vien len man hinh
    public void output(){
        System.out.println(" Thong tin Sinh vien");
        System.out.println(" ===================");
        System.out.printf("id: %s \n", id);
        System.out.printf("ten: %s \n", name);
        System.out.printf("gioi tinh: %s \n", gender);
        System.out.printf("diem ket qua: %d \n", mark);
        System.out.println("");
        System.out.println("Tong so SV: " + count);
    }
}
