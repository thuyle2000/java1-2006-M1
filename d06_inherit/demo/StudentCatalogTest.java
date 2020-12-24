/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;


public class StudentCatalogTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "";
        StudentCatalog s = new StudentCatalog();
        
        while(true){
            System.out.println("\n +++ MENU +++");
            System.out.println(" 1. Them SV");
            System.out.println(" 2. In danh sach SV");
            System.out.println(" 3. In danh sach SV Nam");
            System.out.println(" 4. In danh sach SV Nu");
            System.out.println(" 5. Thoat");
            System.out.println(" Chon chuc nang tu [1-5]: ");
            
            op = sc.nextLine();
            
            switch(op){
                case "1": s.add(); break;
                case "2": s.display(); break;
                case "3": s.display(true); break;
                case "4": s.display(false); break;
                case "5": return;
            }
        }
        
    }
    
}
