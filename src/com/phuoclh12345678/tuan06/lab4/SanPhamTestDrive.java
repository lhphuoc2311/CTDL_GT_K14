/*
*  created date: Oct 11, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan06.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SanPhamTestDrive {

    public static void main(String[] args) {
        List<SanPham> dsSanPham;
        dsSanPham = new ArrayList<>();

        dsSanPham.add(new SanPham("Mì hảo", 2000, 0, 0.1f));
        dsSanPham.add(new SanPham("Nước tương Chinsu", 15000, 1000, 0.1f));
        dsSanPham.add(new SanPham("Bánh ngọt", 500, 0, 0));
/* 
        inDSSanPham(dsSanPham);
        
        sapXepTangDanTheoGia(dsSanPham);

        System.out.println("Sau khi sắp xếp");

        inDSSanPham(dsSanPham); */
/* 
        //câu 1
       SanPham sanPham =  timSanPhamTheoTheo("Mì hảo 100", dsSanPham);

       //sanPham.inThongTin();

       if(sanPham != null){
           sanPham.inThongTin();
       }else{
           System.out.println("Không tìm thấy cái ứ gì hết á ...");
       } */

       String tenSanPham = "Mì hảo";

       xoaSanPham(tenSanPham, dsSanPham);

       inDSSanPham(dsSanPham);


    }

    void nhapDSSanPham(){
        //xử lý việc nhập
    }

  static  void inDSSanPham(List<SanPham> dsSanPham){
        //xử lý in
        for (SanPham sanPham : dsSanPham) {
            sanPham.inThongTin();// mỗi sản phẩm sẽ tự in thông tin của nó
        }
    }

   static void sapXepTangDanTheoGia(List<SanPham> dsSanPham){// danh sách
        Comparator<SanPham> comp;
        comp = new Comparator<SanPham>(){

            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.donGia, o2.donGia);
            }
            
        };

        Collections.sort(dsSanPham, comp);
        
    }    

    //hàm
   static SanPham timSanPhamTheoTheo(String tenSanPham, List<SanPham> dSanPhams){
        SanPham result = null;

        for (SanPham sanPham : dSanPhams) {

            if(sanPham.tenShanPham.equals(tenSanPham)){
                result = sanPham;
            }
            
        }

        return result;
    }


    static void xoaSanPham(String tenSanPham, List<SanPham> dsSanPham){

        SanPham sanPham = timSanPhamTheoTheo(tenSanPham, dsSanPham);
        
        dsSanPham.remove(sanPham);

    }
}
