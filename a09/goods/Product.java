/*
Creates an abstract class named Product in package Goods.
- Protected Fields id, name
- Public constructor to initialise the above fields.
- Method:
- Protected void accept() : allow user input data into data fields.
- Public abstract void printInfo() : abtract method used to print details of an product.
 */
package goods;

import java.util.Scanner;

public abstract class Product {

    protected String id, name;

    public Product() {
    }

    protected void accept() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(" Nhap id: ");
            id = sc.nextLine().trim();
            if (id.length() > 1) {
                break;
            }
        }

        while (true) {
            System.out.println("Nhap name: ");
            name = sc.nextLine().trim();
            if (name.length() > 2) {
                break;
            }
        }
    }
    
    public abstract  void printInfo();
}
