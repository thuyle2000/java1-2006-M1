/*
kiem tra class Employee
 */
package demo;


public class TestEmployee {


    public static void main(String[] args) {
        //in ten cong ty cua cac nhan vien
        Employee.companyName = "Cty TNHH Duc Thinh";
        System.out.println("Ten Cong ty: " + Employee.companyName);
        
        // Test case 1:
        Employee e1 = new Employee();
        
        // Test case 1b:
        Employee e1b = new Employee("E03", "Trieu", "Giam Doc", 1200);
        
        //Test case 2:
        Employee e2 = new Employee();
        e2.input();
        

        
        //xuat thong tin
        System.out.println("\n Nhan vien 1: ");
        e1.output();
        
        System.out.println("\n Nhan vien 2: ");
        e1b.output();
        
        System.out.println("\n Nhan vien 3: ");
        e2.output();

    }
    
}
