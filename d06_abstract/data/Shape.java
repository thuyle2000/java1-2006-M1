/*
Lop Truu tuong HinhHoc - BAO GOM
 - Thuoc tinh: hang PI
 - phuong thuc truu tuong: tinh_dt(), tinh_cv(), nhap()

 */
package data;

public abstract class Shape {
    public final double PI = 3.1416;
    
    //ham truu tuong
    public abstract double area();
    public abstract double perimeter();
    public abstract void input();
    
    //ham binh thuong, co noi dung
    @Override
    public String toString() {
        return String.format("DT = %.2f, CV = %.2f", area(), perimeter());
    }
    
} 
