/*
*  created date: Sep 27, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan04;

import java.util.Arrays;

public class CTMinhHoaMang {
    public static void main(String[] args) {
        //cú pháp khai báo mảng
        int[] mangSoNguyen;//chưa chỉ định số phần tử

        mangSoNguyen = new int[5];//=> mảng trong java là 1 kiểu tham chiếu đối tượng

        
        double mangSoThuc[] = new double[10];


        //trước khi dùng thì phải xác định số phần tử của mảng
        mangSoNguyen[0] = 2;

        //KHAI BÁO CÓ KHỞI TẠO GIÁ TRỊ CHO MẢNG
        double diemMonHoc[] = new double[]{10.5, 5.5, 3.0, 4.5};
        System.out.println("Mảng điểm môn học: " + Arrays.toString(diemMonHoc));
        diemMonHoc[0] = diemMonHoc[1];
        //5.5, 5.5, 3.0, 4.5
        
        System.out.println("Mảng điểm môn học: " + Arrays.toString(diemMonHoc));

        System.out.println("Số phần tử của mảng điểm môn học: "+ diemMonHoc.length);


        //CÁCH 2
        String dsTenSinhVien[] = {"Tèo", "Tý", "Tửng"};


    }
}
