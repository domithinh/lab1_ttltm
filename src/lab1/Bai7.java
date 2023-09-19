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
public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhập các phần tử của mảng từ bàn phím
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // a) In ra các phần tử là số nguyên tố của mảng
        System.out.println("Các phần tử là số nguyên tố trong mảng:");
        for (int i = 0; i < n; i++) {
            if (kiemTraSoNguyenTo(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(); // Xuống dòng sau khi in phần tử

        // b) In ra các phần tử là số hoàn hảo của mảng
        System.out.println("Các phần tử là số hoàn hảo trong mảng:");
        for (int i = 0; i < n; i++) {
            if (kiemTraSoHoanHao(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(); // Xuống dòng sau khi in phần tử

        // c) In ra các phần tử là số chẵn
        System.out.println("Các phần tử là số chẵn trong mảng:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(); // Xuống dòng sau khi in phần tử

        scanner.close();
    }

    // Hàm kiểm tra xem một số có phải là số nguyên tố hay không
    public static boolean kiemTraSoNguyenTo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hàm kiểm tra xem một số có phải là số hoàn hảo hay không
    public static boolean kiemTraSoHoanHao(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
