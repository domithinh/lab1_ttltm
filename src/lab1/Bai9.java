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
public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tự nhiên n: ");
        int n = scanner.nextInt();

        // a) Tìm số Fibonacci thứ n
        int fibonacciN = timSoFibonacciThuN(n);
        System.out.println("Số Fibonacci thứ " + n + " là: " + fibonacciN);

        // b) Liệt kê các số Fibonacci nhỏ hơn n là số nguyên tố
        System.out.println("Các số Fibonacci nhỏ hơn " + n + " là số nguyên tố:");
        lietKeFibonacciNguyenTo(n);

        scanner.close();
    }

    // Hàm tìm số Fibonacci thứ n
    public static int timSoFibonacciThuN(int n) {
        if (n <= 1) {
            return n;
        }
        int fibPrev = 1;
        int fibCurrent = 1;
        for (int i = 2; i < n; i++) {
            int temp = fibCurrent;
            fibCurrent += fibPrev;
            fibPrev = temp;
        }
        return fibCurrent;
    }

    // Hàm kiểm tra xem một số có phải là số nguyên tố hay không
    public static boolean kiemTraSoNguyenTo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hàm liệt kê các số Fibonacci nhỏ hơn n là số nguyên tố
    public static void lietKeFibonacciNguyenTo(int n) {
        int fibPrev = 1;
        int fibCurrent = 1;
        while (fibCurrent < n) {
            if (kiemTraSoNguyenTo(fibCurrent)) {
                System.out.print(fibCurrent + " ");
            }
            int temp = fibCurrent;
            fibCurrent += fibPrev;
            fibPrev = temp;
        }
        System.out.println(); // Xuống dòng sau khi liệt kê xong
    }
}
