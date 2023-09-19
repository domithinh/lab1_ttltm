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
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của dãy: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của dãy:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập giá trị x cần xóa: ");
        int x = scanner.nextInt();

        // Xóa các phần tử có giá trị bằng x
        int newSize = xoaPhanTu(arr, n, x);

        // In dãy sau khi xóa
        System.out.println("Dãy sau khi xóa các phần tử có giá trị bằng " + x + ":");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    // Hàm xóa các phần tử có giá trị bằng x và trả về kích thước mới của mảng
    public static int xoaPhanTu(int[] arr, int n, int x) {
        int newSize = 0; // Kích thước mới của mảng

        // Duyệt qua mảng và xóa các phần tử có giá trị bằng x
        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        return newSize;
    }
}

