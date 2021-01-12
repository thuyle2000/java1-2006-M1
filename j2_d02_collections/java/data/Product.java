/*
Mo ta 1 san pham
 */
package data;


public class Product implements Comparable<Product>{
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
        return String.format("%s, %s, %d", id, name, price);
        //return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }
    
    /*override ham hashcode() va equals() de kiem tra trung ma so */
    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        Product x = (Product) obj;
        return this.id.equals(x.id); 
    }

    //chuan thu tu sap xep cua 2 san pham bat ky la dua tren thuoc tinh id
    @Override
    public int compareTo(Product o) {
        return this.id.compareTo(o.id);
    }
    
}
