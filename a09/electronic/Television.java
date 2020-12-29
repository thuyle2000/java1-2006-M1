/*
Create class Television derives from Product and implements ITax, in package Electronics.
- Fields: pprice, QoH (quantity on hand) and brand.
- Constructors to initialise the all fields.
- Override methods:
protected void accept() : allow user to input additional details of a television

invoke method accept() of super class.

public String toString() : return a string presenting all the details of a product as
follows: id, name, price, QoH, cost, amount (=cost*QoH, cost: price after TAX)
 */
package electronic;

import goods.*;
import java.util.Scanner;

public class Television extends Product implements ITax {

    public String brand;
    public int price, qoh;

    public Television() {
    }

    @Override
    protected void accept() {
        super.accept();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(" Nhap brand: ");
            brand = sc.nextLine().trim();
            if (brand.length() > 1) {
                break;
            }
        }

        while (true) {
            try {
                System.out.println(" Nhap price (>0) : ");
                price = Integer.parseInt(sc.nextLine().trim());
                if (price > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println(" Nhap qoh (>0) : ");
                qoh = Integer.parseInt(sc.nextLine().trim());
                if (qoh > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }
    }

    @Override
    public void printInfo() {
        System.out.println(" >> Thong tin san pham :");
        System.out.println(" id: " + id);
        System.out.println(" ten: " + name);
        System.out.println(" don gia: " + price);
        System.out.println(" so luong ton kho: " + qoh);
    }

    @Override
    public float getCost() {
        return price * (1 +VAT_TAX_PERCENT);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %d, %.2f, %.2f", id, name, price, qoh, getCost(), getCost()*qoh );
    }
    
}
