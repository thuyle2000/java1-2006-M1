/*
demo phuong phap truyen dia chi tham chieu (pass by ref)
 */
package demo;

public class DemoMethodByRef {

    public static void main(String[] args) {
        Product p1 = new Product("p1", "dua hau Mai An Trieu", 200);    
        System.out.println("San pham p1: " + p1);
        
        DemoMethodByRef demo = new DemoMethodByRef();
        demo.changeInfo(p1);
        
        System.out.println("Sau khi goi ham changeInfo(): ");
        System.out.println("San pham p1: " + p1);
    }
    
    void changeInfo(Product p){
        //doi ten va don gia cua san pham
        p.name = p.name + " (new year)";
        p.price += 50; 
    }  
}




class Product{
    public String id, name;
    public int price;

    public Product() {
    }

    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("id=%s, name=%s, price=%d", id,name, price);
    }

}