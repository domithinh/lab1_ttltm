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
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập vào một số nguyên dương n.");
            System.out.println("2. Tính tổng các số từ 1 đến n.");
            System.out.println("3. Kiểm tra n có là số nguyên tố.");
            System.out.println("4. Kiểm tra n có là số hoàn hảo.");
            System.out.println("5. Hiển thị số n thành tích các thừa số nguyên tố.");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            
            choice = scanner.nextInt();
            int n = 0;
            switch (choice) {
                case 1:
                    n = nhapSoNguyenDuong();
                    break;
                case 2:
                    if (n <= 0) {
                        System.out.println("Vui lòng nhập n trước khi tính tổng.");
                        break;
                    }
                    int tong = tinhTong(n);
                    System.out.println("Tổng các số từ 1 đến " + n + " là: " + tong);
                    break;
                case 3:
                    if (n <= 0) {
                        System.out.println("Vui lòng nhập n trước khi kiểm tra số nguyên tố.");
                        break;
                    }
                    boolean laSNT = kiemTraSoNguyenTo(n);
                    if (laSNT) {
                        System.out.println(n + " là số nguyên tố.");
                    } else {
                        System.out.println(n + " không là số nguyên tố.");
                    }
                    break;
                case 4:
                    if (n <= 0) {
                        System.out.println("Vui lòng nhập n trước khi kiểm tra số hoàn hảo.");
                        break;
                    }
                    boolean laSHH = kiemTraSoHoanHao(n);
                    if (laSHH) {
                        System.out.println(n + " là số hoàn hảo.");
                    } else {
                        System.out.println(n + " không là số hoàn hảo.");
                    }
                    break;
                case 5:
                    if (n <= 0) {
                        System.out.println("Vui lòng nhập n trước khi hiển thị thừa số nguyên tố.");
                        break;
                    }
                    hienThiThuaSoNguyenTo(n);
                    break;
                case 6:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (choice != 6);
        
        scanner.close();
    }
    
    public static int nhapSoNguyenDuong() {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Nhập một số nguyên dương n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập số nguyên dương.");
            }
        } while (n <= 0);
        
        return n;
    }
    
    public static int tinhTong(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        return tong;
    }
    
    public static boolean kiemTraSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean kiemTraSoHoanHao(int n) {
        int tong = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                tong += i;
                if (i != n / i) {
                    tong += n / i;
                }
            }
        }
        return tong == n;
    }
    
    public static void hienThiThuaSoNguyenTo(int n) {
        System.out.print("Thừa số nguyên tố của " + n + " là: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        System.out.println();
    }
}
