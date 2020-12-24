/*
    StudentAptech la lop con cua Student.
    co them thuoc tinh: diem project
 */
package demo;

import java.util.Scanner;

public class StudentAptech extends Student{
    private int project;

    @Override
    public void input() {
        super.input(); 
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap diem project: ");
        project = sc.nextInt();
    }

    @Override
    public void output() {
        
        if(isGender() == false){
            project +=5;
        }
        super.output(); 
        System.out.println("project: " + project);
        System.out.println("Ket qua phan loai : " + evaluate());
    }

    public String evaluate(){
        String kq = "Ko dat";
        if(project>=90){
            kq = "Xuat sac";
        }
        else if(project>=80){
            kq="Gioi";
        }
        else if(project >=65){
            kq="Kha";
        }
        else if(project >=40){
            kq ="Trung binh";
        }
        
        return kq;
    }
    
}
