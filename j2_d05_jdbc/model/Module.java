package model;

import java.util.Scanner;
import java.util.regex.*;

public class Module {

    public String id, name;
    public int hours, fee;

    public Module() {
    }

    public Module(String id, String name, int hours, int fee) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d , %d", id, name, hours, fee);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n *** Nhap thong tin mon hoc *** ");

        while (true) {
            System.out.println(">> nhap id: ");
            id = sc.nextLine().trim();

            if (Pattern.matches("[a-zA-Z0-9]{2,5}", id)) {
                break;
            }
            System.out.println("Error: id phai chua ky tu chu, do dai tu 2 -> 5 !");
        }

        while (true) {
            System.out.println(">> nhap name: ");
            name = sc.nextLine().trim();

            if (name.length() > 3 && name.length() <= 30) {
                break;
            }
            System.out.println("Error: name, co do dai tu 3 -> 30 ky tu !");
        }

        while (true) {
            System.out.println(">> nhap hours ( > 0 ): ");
            try {
                hours = Integer.parseInt(sc.nextLine().trim());

                if (hours>=8 && hours<=60) {
                    break;
                }
                throw new NumberFormatException("Error: hour tu [8 - 60] !");
                
            } catch (Exception e) {
                System.out.println("Loi : " + e.getMessage());
            }
        }
        
         while (true) {
            System.out.println(">> nhap fee ( > 0 ): ");
            try {
                fee = Integer.parseInt(sc.nextLine().trim());

                if (fee>=0 && fee<=600) {
                    break;
                }
                throw new NumberFormatException("Error: fee tu [0 - 600] !");
                
            } catch (Exception e) {
                System.out.println("Loi : " + e.getMessage());
            }
        }       
        
    }

}
