/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author DomiThinh
 */
public class Bai10 {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng hai chiều để lưu điểm của hai học sinh
        int[][] diemHocSinh = {
            {60, 55, 70}, // Điểm của học sinh thứ nhất
            {80, 60, 41}  // Điểm của học sinh thứ hai
        };

        // Tính điểm trung bình cho cả hai học sinh
        double[] diemTrungBinh = new double[2];
        for (int i = 0; i < 2; i++) {
            int tongDiem = 0;
            for (int j = 0; j < 3; j++) {
                tongDiem += diemHocSinh[i][j];
            }
            diemTrungBinh[i] = (double) tongDiem / 3;
        }

        // Hiển thị điểm trung bình của cả hai học sinh
        for (int i = 0; i < 2; i++) {
            System.out.println("Điểm trung bình của học sinh thứ " + (i + 1) + " là: " + diemTrungBinh[i]);
        }
    }
}
