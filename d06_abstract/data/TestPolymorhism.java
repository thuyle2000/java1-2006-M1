package data;

public class TestPolymorhism {

    public static void main(String[] args) {
        Shape[] ds = new Shape[3];
        
        //phan tu thu 1, kieu tham chieu la hinh tron
        ds[0] = new Circle();

        //phan tu thu 2, kieu tham chieu la chu nhat
        ds[1] = new Rectangle();  
        
        //phan tu thu 3, kieu tham chieu la tam gia
        ds[2] = new TriangleSon();   
        
        System.out.println(">> Nhap du lieu cho 3 hinh: ");
        for (Shape item : ds) {
            item.input();
        }
        
        System.out.println(">> Danh sach cac hinh ");
        for (Shape item : ds) {
            System.out.println(item);
        }
      
        
    }

}
