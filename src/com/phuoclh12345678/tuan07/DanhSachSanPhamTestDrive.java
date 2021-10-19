/*
*  created date: Oct 18, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan07;

import com.phuoclh12345678.tuan06.lab4.SanPham;

public class DanhSachSanPhamTestDrive {
    public static void main(String[] args) {
        DanhSanhSanPham danhSanhSanPham = new DanhSanhSanPham();
        
        //danhSanhSanPham.add(sanPham);
        //danhSanhSanPham.add(1, sanPham);

        danhSanhSanPham.inDanhSachSanPham();;

        String str1 = "Mr Teo";

        String str2 = "Mr Ty";

        if(str1.equals(str2)){
            System.out.println("Không giống nhau");
        }

        SanPham sanPham = new SanPham();


        SanPham sanPham2 = new SanPham();

        sanPham = sanPham2;

        if(sanPham == sanPham2){
            System.out.println("Bằng nhau tại sao????");
        }

        if(sanPham.equals(sanPham2)){
            //code
        }

    }
    
}
