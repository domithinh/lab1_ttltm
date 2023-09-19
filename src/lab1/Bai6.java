/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DomiThinh
 */
public class Bai6 {
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

        // a) Sắp xếp và in lại dãy đã sắp
        sapXepVaInMang(arr);

        // b) In ra màn hình phần tử có giá trị nhỏ nhất
        int min = timGiaTriNhoNhat(arr);
        System.out.println("Phần tử có giá trị nhỏ nhất là: " + min);

        // c) Tính trung bình cộng các phần tử chia hết cho 3
        double trungBinhCong = tinhTrungBinhCongChiaHetCho3(arr);
        System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: " + trungBinhCong);

        scanner.close();
    }

    // a) Sắp xếp và in lại mảng
    public static void sapXepVaInMang(int[] arr) {
        Arrays.sort(arr); // Sắp xếp mảng
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Xuống dòng sau khi in mảng
    }

    // b) Tìm giá trị nhỏ nhất trong mảng
    public static int timGiaTriNhoNhat(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // c) Tính trung bình cộng các phần tử chia hết cho 3
    public static double tinhTrungBinhCongChiaHetCho3(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0; // Tránh chia cho 0
        }
    }
}
