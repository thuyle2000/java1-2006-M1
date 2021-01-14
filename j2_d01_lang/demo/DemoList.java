package demo;

import java.util.*;

public class DemoList {

    List<Product> ds2 = Arrays.asList(
        new Product("P01", "Coca cola", 10),
        new Product("P02", "Pepsi cola", 9),
        new Product("P03", "7up", 7),
        new Product("P04", "Lavie", 12),
        new Product("P05", "Beer 333", 13)
    );
    
    ArrayList<Product> ds = new ArrayList<>(ds2);

    public static void main(String[] args) {
        DemoList d = new DemoList();
        d.add();
        d.display();
        
        
    }
    
    void add(){
        Product p1 = new Product("P07", "Orangina", 11);
        long cnt = ds.stream().filter(p->p.id.equals(p1.id)).count();
        if (cnt==0){
            ds.add(p1);
            System.out.println("Da them sp moi thanh cong !");
        }
        else{
            System.out.println("LOI: ma so da ton tai !");
        }           
    }
    
    
    void display(){
        System.out.println("\n ds san pham");
        ds.forEach(System.out::println);
    }
}

class Product {

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
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }

}
