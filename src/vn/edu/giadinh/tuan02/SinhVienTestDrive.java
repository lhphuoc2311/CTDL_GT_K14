/*
*  crated date: 9/13/2021
*  author: cgm
*/
package vn.edu.giadinh.tuan02;

public class SinhVienTestDrive {

    public static void main(String[] args) {
        SinhVien sinhVien;//khai báo biến tên sinhVien tham chiếu đối tượng kiểu SinhVien

        sinhVien = new SinhVien();//Tạo Đối tượn sinh viên trong vùng nhớ Heap
        sinhVien.mssv = "12345";
        sinhVien.tenSinhVien = "Lê Văn Tèo";
        sinhVien.queQuan = "TPHCM";
        sinhVien.tuoi = 18;

        sinhVien.inThongTinSV();
    }
    
}
