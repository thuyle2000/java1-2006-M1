/*
Demo File 
 */
package demo;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ViduFile {


    public static void main(String[] args) {
        //liet ke ten danh sach cac tap tin trong thu muc
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ten thu muc : ");
        String folderName = sc.nextLine().trim();
        
        File folder = new File(folderName);        
        if(!folder.exists()){
            System.out.printf("Thu muc [%s] khong ton tai !!! \n", folderName);
            return;
        }
        
        if(folder.isFile()){
            System.out.printf(">> [%s] la ten tap tin \n", folderName);
            Runtime r = Runtime.getRuntime();
            try {
                r.exec("notepad " + folderName);
            } catch (IOException ex) {
                Logger.getLogger(ViduFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            System.out.printf(">> [%s] la ten thu muc \n", folderName);
            
            String[] names = folder.list();
            for (String tenTapTin : names) {
                System.out.println("  " + tenTapTin);
            }          
        }
        
        
    }
    
}
