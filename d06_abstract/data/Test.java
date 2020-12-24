
package data;

public class Test {

    public static void main(String[] args) {
        //binh thuong
        
        System.out.println("Hinh chu nhat: ");
        Rectangle r = new Rectangle();
        r.input();
        
        System.out.println("\nHinh tron");
        Circle c = new Circle();
        c.input();
        
        
        System.out.println("\nHinh tam giac");
        TriangleSon t = new TriangleSon();
        t.input();
        
        //xuat dien tich va chu vi cua cac hinh tren
        System.out.println(">>Hinh chu nhat : " + r);
        System.out.println(">>Hinh tron : " + c);
        System.out.println(">>Hinh tam giac : " + t);
        
    }
    
}
