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
public class Bai3_Tinhhieu {
    public static void main(String[] args) {
        System.out.println("phep tinh co ban");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println("nhap so b");
        int b = sc.nextInt();
        System.out.println("dap so a va b");
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
    }
}
