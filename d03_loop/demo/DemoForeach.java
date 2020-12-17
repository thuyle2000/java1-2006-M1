/*
Demo vong lap for va for-each
 */
package demo;


public class DemoForeach {

    //khai bao mang chua ten cac sinh vien
    String[] dsTenSV = {"Ngoc Yen", "Vuong","Trieu","Hoang Duy","Trong Nghia","The Hien"};
    public static void main(String[] args) {
        
        //khai bao bien doi tuong o, kieu DemoForeach
        DemoForeach o = new DemoForeach();
        o.demoFor();
        o.demoForeach();
    }
    
    //ham in ds ten sv bang vong lap FOR
    void demoFor(){
        System.out.println("\n Danh sach ten SINH VIEN");
        for(int i=0; i<dsTenSV.length ; i++){
            System.out.printf(" %2d. %s \n", i+1, dsTenSV[i]);
        }
        System.out.println("");
    }
    
    //ham in ds ten sv bang vong lap Foreach
    void demoForeach(){
        System.out.println("\n Danh sach SInh Vien (for-each)");
        for (String sv : dsTenSV) {
            System.out.println("\t" + sv);
        }
    }
}
