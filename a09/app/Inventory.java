/*
Create main class Inventory in package Application that allows user to manage the
televisons accepted into system through the menu system as follows:
1. Add a new television
2. Search televisions by brand
3. Display all televisions
4. Display high-valued televisions
 */
package app;

import electronic.*;
import java.util.*;

public class Inventory {

    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.menu();
    }
    
    private void menu(){
        Scanner sc = new Scanner(System.in);
        String op ="";
        TelevisionCatalog tc = new TelevisionCatalog();
        
        while(true){
            System.out.println("\n  +++++ MENU +++++");
            System.out.println("1. Them TV");
            System.out.println("2. Tim theo brand");
            System.out.println("3. In danh sach TV");
            System.out.println("4. In danh sach TV co don gia > 500 ");
            System.out.println("5. Thoat");
            System.out.println("  Chon ma so chuc nang [1-5]: ");
            op = sc.nextLine().trim();
            
            switch(op){
                case "1": tc.add(); break;
                case "2": 
                    System.out.println(" >> nhap ten thuong hieu : ");
                    tc.searchByBrand(sc.nextLine().trim());
                    break;
                case "3": tc.displayAll();break;
                case "4": tc.displayHighValue(); break;
                case "5": return;
            }
        }
    }
}
