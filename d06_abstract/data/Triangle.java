/*
    Lop con cua Shape, co them 3 thuoc tinh a,b,c
 */
package data;

import java.util.Scanner;

public abstract class Triangle extends Shape{
    public float a,b,c;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        a = sc.nextFloat();
        System.out.println("Nhap canh b: ");
        b = sc.nextFloat();
        System.out.println("Nhap canh c: ");
        c = sc.nextFloat();        
    }

    @Override
    public double perimeter() {
       return a+b+c;
    }
    
}
