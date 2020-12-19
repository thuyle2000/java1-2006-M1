/*
Mo ta cau truc 1 mon hoc :
- field : id, name, so gio, hoc phi
- method: input() nhap thong tin mon hoc
- override method tosString(): tra ve 1 chuoi chua thong tin 1 mon hoc
 */
package demo;

import java.util.Scanner;

public class Module {
    public String id, name;
    public int hours, fee;

    public Module() {
        id="M01";
        name="Lap trinh C";
        hours = 40;
        fee = 150;
    }

    public Module(String id, String name, int hours, int fee) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.fee = fee;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        //nhap id
        System.out.println("Nhap thong tin mon hoc");
        System.out.println(" nhap id: ");
        id= sc.nextLine().trim();
        System.out.println(" nhap ten mon hoc: ");
        name= sc.nextLine().trim();        
        System.out.println(" nhap so gio hoc: ");
        hours= sc.nextInt();
        System.out.println(" nhap hoc phi: ");
        fee= sc.nextInt();               
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %d", id, name, hours, fee);            
    }

}
