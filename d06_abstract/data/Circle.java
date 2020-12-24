/*
    La con cua lop Shape, co them thuoc tinh ban kinh R
 */
package data;

import java.util.Scanner;

public class Circle extends Shape{
    public double r;

    @Override
    public double area() {
        return PI * r * r;
    }

    @Override
    public double perimeter() {
       return 2 * PI * r;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        r = sc.nextFloat();
    }
    
}
