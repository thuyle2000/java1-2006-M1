/*
demo phuong phap truyen gia tri (pass by value)cho phuong thuc
 */
package demo;

public class DemoMethodByVal {

    public static void main(String[] args) {
        DemoMethodByVal p = new DemoMethodByVal();
        int a=20, b=15;        
        
        System.out.println("Trong ham main(), truoc khi goi add(): ");
        System.out.printf("a = %d, b=%d \n\n", a,b);
        
        System.out.printf("Ket qua phep cong (a+b) = %d \n", p.add(a,b));
        
        System.out.println("Trong ham main(), sau khi goi add(): ");
        System.out.printf("a = %d, b=%d \n", a,b);
    }
    
    //ham cong 2 so nguyen, co 2 tham so hinh thuc a, b
    int add(int a, int b){
        int r = a+b;
        a*=2; b=b+a;
        
        System.out.println("Trong ham add(): ");
        System.out.printf("a=%d, b=%d \n\n", a,b);
        
        return r;
    }
    
    //ham tinh giai thua 1 so nguyen
    long factorial(int n){
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
