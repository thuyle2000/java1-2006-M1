/*
Demo Regular Expression
 */
package demo;

import java.util.regex.*;
import java.util.*;

public class Vidu4 {

    public static void main(String[] args) {

        //Chuyen chuoi ky tu bat ky (chu, so, ky hieu dac biet) thanh chuoi so
        Scanner sc = new Scanner(System.in);
        String s1=null, s2 = null;
        Matcher m = null;
        Pattern p= null;


        System.out.println("Nhap chuoi: ");
        s1 = sc.nextLine().trim();
        s2 = s1.replaceAll("\\D+", " ").trim();
        

        System.out.printf("Chuoi moi : %s \n", s2);
    }

}
