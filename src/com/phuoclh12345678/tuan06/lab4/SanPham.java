/*
*  created date: Oct 11, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan06.lab4;

public class SanPham {

    String tenShanPham;
    double donGia;
    double giamGia;
    float thueNhapKhau;

    //hàm tạo

    // in thông tin
    //hàm

    public SanPham(){

    }
   

    /**
     * @param tenShanPham
     * @param donGia
     * @param giamGia
     * @param thueNhapKhau
     */
    public SanPham(String tenShanPham, double donGia, double giamGia, float thueNhapKhau) {
        this.tenShanPham = tenShanPham;
        this.donGia = donGia;
        this.giamGia = giamGia;
        this.thueNhapKhau = thueNhapKhau;
    }



    void inThongTin(){
        System.out.println("===================================================");
        System.out.print("Tên SP: " + tenShanPham);
        System.out.print(" Đơn giá: " + donGia);
        System.out.print(" Giảm giá: " + giamGia);
        System.out.println(" Thuế nhập khẩu: " + thueNhapKhau);
        
    }

    public boolean equals (SanPham other){
        boolean match = true;

        if((tenShanPham.equals(other.tenShanPham)) && 
        donGia == other.donGia){
            match =  true;
        }else match = false;


        return match;

    }
    
}
