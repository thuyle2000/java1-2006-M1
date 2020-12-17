/*
    Test cases cho class Student 
 */
package demo;

public class TestStudent {

    public static void main(String[] args) {
        //Test case 1:
        Student sv1 = new Student();
        sv1.id = "S01";
        sv1.name = "Hoang Duy";
        sv1.gender = true;
        sv1.mark = 100;        
        sv1.output();  // xuat thong tin sinh vien sv1 len man hinh
        
        //Test case 2:
        Student sv2 = new Student();
        sv2.input();
        sv2.output();
    }
}
