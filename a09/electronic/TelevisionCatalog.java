/*
Create class TelevisionCatalog in package Electronics for managing a collection of
Televisions:
- Fields:
[max, count] int, tvList – array of Television.
- Default constructor to initialise the all the fields.
- Methods:
- Public void add() - add a new television into array
- Public void searchByBrand() - search televisions belong a brand name accepted by
user.
- Public void displayAll() - display all televisions.
- Public void displayHighValue() – display televisions with the price above 500.
 */
package electronic;

import java.util.*;

public class TelevisionCatalog {

    private final int max = 10;
    private int next = 0;
    private Television[] tvList = new Television[max];

    //them 1 tv moi
    public void add() {
        if (next == max) {
            System.out.println(" HT het bo nho luu tru. Tu choi thao tac !");
            return;
        }
        Television tv = new Television();

        tv.accept();
        tvList[next++] = tv;

        System.out.println("  >> Them  moi thanh cong !");
    }

    //in toan bo danh sach du lieu
    public void displayAll() {
        if (next == 0) {
            System.out.println("  HT chua co du lieu");
            return;
        }

        System.out.println("\n  Danh sach Tivi");
        for (int i = 0; i < next; i++) {
            System.out.println(tvList[i]);
        }
    }

    public void searchByBrand(String bSearch) {
        if (next == 0) {
            System.out.println("  HT chua co du lieu");
            return;
        }

        int cntBrand = 0;
        System.out.println("\n  Danh sach Tivi theo brand " + bSearch);
        for (int i = 0; i < next; i++) {
            if(tvList[i].brand.equalsIgnoreCase(bSearch)){
                System.out.println(tvList[i]);
                cntBrand++;
            }
        } // ket thuc for
        
        if(cntBrand ==0 ){
            System.out.println(" KHONG TIM THAY !!!");
        }
    }
    
    public void displayHighValue(){
        if (next == 0) {
            System.out.println("  HT chua co du lieu");
            return;
        }
        
        int cntValue = 0;
        System.out.println("\n  Danh sach Tivi co don gia >= 500 ");
        for (int i = 0; i < next; i++) {
            if(tvList[i].price>=500){
                tvList[i].printInfo();
                cntValue++;
            }
        } // ket thuc for
        
        if(cntValue ==0 ){
            System.out.println(" KHONG TIM THAY !!!");
        }
    }
}
