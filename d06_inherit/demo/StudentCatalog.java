/*
Quan ly danh sach sinh Aptech , bao gom chuc nang:
- them sinh vien
- in danh sach
- in ds sv theo gioi tinh (nam | nu)

 */
package demo;

public class StudentCatalog {
    private int max ;
    private int next;           // dem so sv dang luu tru trong he thong
    private StudentAptech[] ds; // mang chua ds sinh vien
    
    //ham dung
    public StudentCatalog() {
        max = 10;
        next = 0;
        ds = new StudentAptech[max];
    }
    
    //ham them sv
    public void add(){
        if(next==max){
            System.out.println("HT het bo nho luu tru !");
            return;
        }
        StudentAptech sv = new StudentAptech();
        sv.input();
        ds[next++] = sv;        
        System.out.println("Them sv moi thanh cong !");
    }
    
    
    //ham in ds sv
    public void display(){
        if(next==0){
            System.out.println("HT chua co data !");
            return;
        }
        
        System.out.println("\n === DS Sinh vien ===");
        for (int i = 0; i < next; i++) {
            ds[i].output();
        }
    }
    
    //ham in ds sv theo gioi tinh
    public void display(boolean gt){
        if(next==0){
            System.out.println("HT chua co data !");
            return;
        }
        
        int cntGT=0;
        System.out.printf("\n === DS Sinh vien %s \n", gt?"nam":"nu");
        for (int i = 0; i < next; i++) {
            if(ds[i].isGender()==gt){
                ds[i].output();
                cntGT++;
            }           
        }
        
        if(cntGT==0){
            System.out.println(" >> Ko tim thay !!! \n");
        }
    }
}
