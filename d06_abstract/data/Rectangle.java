/*
    La lop con cua lop Shape, co them 2 thuoc tinh chieu dai va chieu rong
 */
package data;

import java.util.Scanner;

public class Rectangle extends Shape {

    public double w, h;

    @Override
    public double area() {
        return w * h;
    }

    @Override
    public double perimeter() {
        return (w + h) * 2;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        w = sc.nextFloat();
        System.out.println("Nhap chieu dai: ");
        h = sc.nextFloat();
    }

}
