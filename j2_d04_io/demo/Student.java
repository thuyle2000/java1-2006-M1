
package demo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;


public class Student implements Serializable{
    public String id, name;
    public boolean gender;
    public LocalDate dob;
    public float finalExam;

    public Student() {
        id="SV01";
        name ="Luong Xuan Phat";
        gender=true;
        dob = LocalDate.of(1999, Month.JULY, 8);
        finalExam = 99.9876f;
    }

    public Student(String id, String name, boolean gender, LocalDate dob, float finalExam) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.finalExam = finalExam;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %.2f",id, name,gender?"nam":"nu", dob, finalExam );
    }
    
    
}
