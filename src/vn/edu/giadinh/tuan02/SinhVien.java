/*
*  crated date: 9/13/2021
*  author: cgm
*/
package vn.edu.giadinh.tuan02;

import java.util.Date;

public class SinhVien {

    //1. thuộc tính - attribute

    String mssv;
    String tenSinhVien;
    int tuoi;

    boolean gioiTinh;//false

    String queQuan;

    Date ngaySinh;//Kiểu ngày th

    

    //2. phương thức - method - function
    //<Kiểu trả về> <tên hàm> <(danh sách tham số)>{.......}
    void inThongTinSV(){
        System.out.println("Mã số sinh viên: " + mssv);
        System.out.println("Tên sinh viên :" + tenSinhVien);
        //
        
    }


    
}
