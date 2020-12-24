/*
        La lop con cua Triangle, lap trinh cho phuong thuc tinh dien tich
 */
package data;

public class TriangleSon extends Triangle{

    @Override
    public double area() {
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));       
    }
    
}
