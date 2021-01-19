package model;

import java.util.Scanner;
import java.util.regex.*;

public class Faculty {

    public String id, name, email, phone;

    public Faculty() {
    }

    public Faculty(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s , %s", id, name, email, phone);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n *** Nhap thong tin giang vien *** ");

        while (true) {
            System.out.println(">> nhap id: ");
            id = sc.nextLine().trim();

            if (Pattern.matches("FA\\d{2}", id)) {
                break;
            }
            System.out.println("Error: id phai co dinh dang FAxx. ");
        }

        while (true) {
            System.out.println(">> nhap name: ");
            name = sc.nextLine().trim();

            if (name.length() > 3 && name.length() <= 30) {
                break;
            }
            System.out.println("Error: name, co do dai tu 3 -> 30 ky tu !");
        }
        System.out.println(">> nhap email: ");
        email = sc.nextLine().trim();
        System.out.println(">> nhap phone: ");
        phone = sc.nextLine().trim();

    }

}
