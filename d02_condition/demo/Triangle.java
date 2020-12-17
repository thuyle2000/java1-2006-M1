/*
Mo ta 1 hinh tam giac, bao gom 
- ba canh a, b, c
- ham tinh dien tich, chu vi, ham nhap va xuat.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author THUYLM
 */
public class Triangle {

    public int a, b, c;

    // ham dung (Constructor)
    public Triangle() {
        a = b = c = 3;
    }

    //ham tinh dien tich
    public double area() {
        double dt = 0;
        double p = (a + b + c) / 2.0;

        dt = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return dt;
    }

    //ham tinh chu vi
    public double periperal() {
        return a + b + c;
    }

    //ham xuat gia tri tam giac
    public void output() {
        System.out.println("\n Tam Giac");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println(" Chu vi: " + periperal());
        System.out.printf(" Dien tich: %.2f \n", area());

        if (a == b && a == c) {
            System.out.println("\n == Day la Tam Giac Deu ==\n");
        } else if (a == b || a == c || b == c) {
            if (isSquare()) {
                System.out.println("\n == Day la Tam Giac Vuong Can ==\n");
            } else {
                System.out.println("\n == Day la Tam Giac Can ==\n");
            }
        } else {
            if (isSquare()) {
                System.out.println("\n == Day la Tam Giac vuong ==\n");
            } else {
                System.out.println("\n == Day la Tam Giac Thuong ==\n");
            }
        }
    }

    public boolean isSquare() {
        return ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b));
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap 3 canh cua tam giac");

            do {
                System.out.println(" Nhap canh a [>0] : ");
                a = sc.nextInt();
            } while (a <= 0);

            do {
                System.out.println(" Nhap canh b [>0] : ");
                b = sc.nextInt();
            } while (b <= 0);

            do {
                System.out.println(" Nhap canh c [>0] : ");
                c = sc.nextInt();
            } while (c <= 0);

            //kiem tra 3 canh a,b,c co tao thanh 1 tam giac ko ?
            if (a + b < c || a + c < b || b + c < a) {
                System.out.println(" 3 canh a, b, c ko the hop thanh tam giac. Vui long nhap lai !!! ");
            } else {
                break;
            }

        } while (true);

    }
}
