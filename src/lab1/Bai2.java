/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author DomiThinh
 */
public class Bai2 {
    public static void main(String[] args) {
        float a,b,c;
        float delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so thu nhat:");
        a = sc.nextFloat();
        System.out.println("Nhap he so thu hai:");
        b = sc.nextFloat();
        System.out.println("Nhap he so thu ba:");
        c = sc.nextFloat();
        delta = (float) (Math.pow(b,2) - 4 * a * c);
        if(delta<0)
            System.out.println("PT vo nghiem");
        else if(delta==0){
            float x = (float)-b/(2*a);
            System.out.printf("PT co nghiem kep x1=x2=%.2f",x);
        }else{
            float x1 = (float) (-b-Math.sqrt(delta))/(2*a);
            float x2 = (float) (-b+Math.sqrt(delta))/(2*a);
        }
    }
}
