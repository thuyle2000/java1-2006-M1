/*
demo ve phuong thuc co danh sach doi so khong xac dinh
*/
package demo;

public class DemoMethodVarArg {

    public static void main(String[] args) {
        DemoMethodVarArg demo = new DemoMethodVarArg();
        
        //test case 1
        demo.sum(10,6,18,8,9);
        
        //test case 2:
        demo.sum(30,7);
    }
    
    void sum(int...number){
        int kq = 0;
        
        System.out.print("\nNumbers: ");
        for (int item : number) {
            System.out.printf("%d ", item);
            kq += item;
        }
        
        System.out.println("\nSum = " + kq);
    }
}
