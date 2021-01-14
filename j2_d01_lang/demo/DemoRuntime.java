/*
Runtime 
 */
package demo;

import java.io.IOException;

public class DemoRuntime {

    public static void main(String[] args) {
        //tao 1 doi tuong Runtime
        Runtime r = Runtime.getRuntime();
        
        try {
            //open 1 chung trinh notepad
            //r.exec("notepad");
            
            //open excel
            String name = "C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE";
            r.exec(name);
            
        } catch (IOException ex) {
            System.out.println("Loi: " + ex.getMessage());
        }
        
    }
    
}
