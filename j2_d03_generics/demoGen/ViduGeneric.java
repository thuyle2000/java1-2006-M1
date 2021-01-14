package demoGen;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ViduGeneric {

    public static void main(String[] args) {
        List<String> ds1 = Arrays.asList("Vuong Trieu", "Thanh Sang", "Xuan Phat", "Trong Nghia", "The Hien");
        List<String> ds2 = new ArrayList<>(ds1);
        ds2.add("Hoang Duy");
        ds2.add("Truong Thinh");
        ds2.add("Thanh Sang");
        ds2.add("PHUOC SANG");
        ds2.add("VU Thinh");

        System.out.println(" Danh sach sinh vien cu: ");
        ds1.forEach(System.out::println);

        System.out.println("\n Danh sach sinh vien moi: ");
        ds2.forEach(System.out::println);

        //xoa sinh vien theo ten duoc nhap
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua sinh vien muon xoa: ");
        String tenSV = sc.nextLine().trim();
        
        ViduGeneric vd = new ViduGeneric();
        vd.remove3(ds2, tenSV);

    }

    void remove1(List<String> ds2, String tenSV) {
        //co ban (man non) - chi xoa duoc 1 dong

        for (String item : ds2) {
            if (item.equalsIgnoreCase(tenSV)) {
                ds2.remove(item);
                System.out.printf(">> da xoa sinh vien [%s] \n", item);
                break;
            }
        }
        System.out.println("\n Danh sach sinh vien sau khi xoa: ");
        ds2.forEach(System.out::println);
    }

    void remove2(List<String> ds2, String tenSV) {
        //co ban (man non) - xoa duoc nhieu dong

        for (int i = ds2.size() - 1; i >= 0; i--) {
            if (ds2.get(i).equalsIgnoreCase(tenSV)) {
                System.out.printf(">> da xoa sinh vien [%s] \n", ds2.get(i));
                ds2.remove(i);
            }
        }
        System.out.println("\n Danh sach sinh vien sau khi xoa: ");
        ds2.forEach(System.out::println);
    }

    void remove3(List<String> ds2, String tenSV) {
        //hien dai (thoi thanh xuan) - xoa duoc nhieu dong

        Pattern p = Pattern.compile(tenSV, Pattern.CASE_INSENSITIVE);
        
        //tim ds sv co ten muon xoa
        List<String> dsRemove= ds2.stream().filter(item->p.matcher(item).find()).collect(Collectors.toList());
        
        //xoa cac sv co ten trong dsRemove
        ds2.removeAll(dsRemove);
        
        System.out.println("\n Danh sach sinh vien sau khi xoa: ");
        ds2.forEach(System.out::println);
    }

}
