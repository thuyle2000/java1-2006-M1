/*
Demo method overload: nhieu phuong thuc co cung ten, nhung khac ds doi so trong 1 class 
 */
package demo;

public class DemoMethodOverload {

    public static void main(String[] args) {
        DemoMethodOverload p = new DemoMethodOverload();
        
        //test case 1
        p.add("Mai An", "Vuong");
        
        //test case 2
        p.add(12.7f, 14.5896f, 18.769879f);
        
        //test case 3
        p.add(10, 85);       
    }
    
    //ham cong 2 so nguyen
    void add(int x, int y){
        System.out.printf("%d + %d = %d \n", x, y, x+y);
    }
    
    
    //ham noi 2 chuoi ky tu
    void add(String s1 , String s2){
        System.out.printf("%s %s \n", s1, s2);
    }
    
    //ham cong 3 so thuc
    void add(float f1, float f2, float f3){
        System.out.printf("%.2f + %.2f + %.2f = %.2f \n", f1,f2,f3, f1+f2+f3);
    }
    
}

