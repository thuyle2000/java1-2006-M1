/*
dinh nghia lop Sinh Vien. Bao gom cac :
- thuoc tinh : id, name, email
- phuong thuc : input(), output()
 */
package demo;

import java.util.Scanner;

public class Student {

    public String id;
    protected String name, email;
    private boolean gender;

    public boolean isGender() {
        return gender;
    }

    //ham dung ko tham so
    public Student() {
        id = "S01";
        name = "no name";
        email = "noname@gmail.com";
        gender = true;
    }

    //ham dung co tham so
    public Student(String id, String name, String email, boolean gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //ham nhap du lieu
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap id: ");
        id = sc.nextLine().trim();
        System.out.println(" Nhap name: ");
        name = sc.nextLine().trim();
        System.out.println(" Nhap email: ");
        email = sc.nextLine().trim();
        System.out.println(" Nhap gender [nam/nu]: ");
        gender = sc.nextLine().trim().equalsIgnoreCase("nam");
    }

    //ham xuat du lieu
    public void output() {
        System.out.println("id: " + id);
        System.out.println("ten: " + name);
        System.out.println("email: " + email);
        System.out.println("gender: " + (gender?"nam":"nu") );
    }
}
