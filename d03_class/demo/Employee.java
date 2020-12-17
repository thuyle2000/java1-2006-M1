
package demo;

import java.util.Scanner;

/**
* Mo ta cau truc 1 nhan vien. bao gom:
* thuoc tinh:  ma so, ten, chuc vu, luong cb, ten cty 
* phuong thuc: nhap(), xuat()
*/
public class Employee {
    
    /* thuoc tinh */
    // 1. instance fields
    public String id, name, position;
    public int salary;
    
    // 2. static field
    public static String companyName = "Cty HOANG DUY";

    /* ham khoi tao */
    // 1. ham khoi tao ko tham so  
    public Employee() {
        id="E00";
        name="Khuyet Danh";
        position="Bao ve";
        salary=100;
    }
    
    //2. ham khoi tao co tham so
    public Employee(String nid, String name, String position, int salary) {
        id = nid;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
          
    /* phuong thuc */
    // 1. ham nhap thong tin nhan vien
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap id: ");
        id = sc.nextLine().trim();
        System.out.println("Nhap ten: ");
        name = sc.nextLine().trim();
        System.out.println("Nhap chuc vu: ");
        position = sc.nextLine().trim();
        
        while(true){
            System.out.println("Nhap luong CB: ");
            salary = sc.nextInt();
            if(salary>=100 && salary<=10000){
                break;
            }
        }
    }
    
    //2. ham xuat thong tin nhan vien
    public void output(){
        System.out.println(" Thong tin nhan vien ");
        System.out.println(" id: "+ id);
        System.out.println(" ten: " + name);
        System.out.println(" chuc vu: " + position);
        System.out.println(" luong cb: " + salary);
    }
    
    
}
