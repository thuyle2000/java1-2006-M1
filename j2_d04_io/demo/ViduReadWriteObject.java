package demo;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViduReadWriteObject {

    public static void main(String[] args) {
        ViduReadWriteObject vd = new ViduReadWriteObject();

        String fname = "F:/sinhvien.data";
        Student sv1 = new Student();

//        vd.writeBinary(fname, sv1);
        Student sv2 = new Student("S2", "Vuong Trieu", false, LocalDate.now(), 50.897f);
        
        System.out.println("\n Truoc khi doc file: ");
        System.out.println("SV2 " + sv2);

        vd.readBinary(fname, sv2);

        System.out.println(" Sau khi doc file: ");
        System.out.println("SV2 " + sv2);

    }

    void writeBinary(String fname, Student sv1) {
        try {
            //luu sinh vien sv1 vo tap tin [F:/sinhvien.data]
            //1. open file output stream ket voi tap tin [F:/sinhvien.data]
            FileOutputStream fos = new FileOutputStream(fname);

            //2. open Object output stream ket voi file out stream cua buoc 1 [fos]
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //3. ghi doi tuong [sv1] vo tap tin [F:/sinhvien.data]
            oos.writeObject(sv1);

            //4. dong file          
            oos.close();
            fos.close();

            System.out.println("Da save file thanh cong !");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViduReadWriteObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViduReadWriteObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void readBinary(String fname , Student sv1) {
        Student sv=null;
        
        try {
            //luu sinh vien sv1 vo tap tin [F:/sinhvien.data]
            //1. open file input stream ket voi tap tin [F:/sinhvien.data]
            FileInputStream fos = new FileInputStream(fname);

            //2. open Object input stream ket voi file input stream cua buoc 1 [fos]
            ObjectInputStream oos = new ObjectInputStream(fos);

            //3. doc tap tin [F:/sinhvien.data], luu du lieu vo bien sv1
            sv = (Student) oos.readObject();
            sv1.id = sv.id;
            sv1.name = sv.name;

            //4. dong file          
            oos.close();
            fos.close();


        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViduReadWriteObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ViduReadWriteObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
