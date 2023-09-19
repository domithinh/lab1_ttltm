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
public class Bai8 {
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

        // Sắp xếp mảng bằng thuật toán chèn
        sapXepMangChen(arr);

        // Hiển thị mảng đã sắp xếp
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    // Hàm sắp xếp mảng bằng thuật toán chèn
    public static void sapXepMangChen(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int currentElement = arr[i];
            int j = i - 1;
            
            // Di chuyển các phần tử lớn hơn currentElement về bên phải
            while (j >= 0 && arr[j] > currentElement) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // Chèn currentElement vào vị trí thích hợp
            arr[j + 1] = currentElement;
        }
    }
}
