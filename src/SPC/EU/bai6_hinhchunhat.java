/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SPC.EU;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class bai6_hinhchunhat {
    public static void main(String[] args) {
    System.out.println("chuong hinh chu nhat");
    Scanner sc = new Scanner(System.in);
    double cd, cr, cv, dt;
    System.out.println("Nhap chieu dai:");
    cd = sc.nextDouble();
    System.out.println("nhap chieu rong:");
    cr = sc.nextDouble();
    cv = 2*(cd+cd);
    dt = cd * cr;
    System.out.println("chu vi: "+ cv);
    System.out.println("chu vi: "+ dt);
    
    
        
    }
    
}
