/*
*  crated date: Sep 20, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan03;

import java.util.Scanner;

public class ChuongTrinhLab2Bai4 {
    public static void main(String[] args) {
        System.out.println("==============Menu============");
        System.out.println(">>1. Giải phương trình bậc I");
        System.out.println(">>2. Giải phương trình bậc II");
        System.out.println(">>3. Tính tiền điện");
        System.out.println("==============Menu============");
        int suLuaChon;
        System.out.print("Lựa chọn chức năng:");
        Scanner bienNhap;
        bienNhap = new Scanner(System.in);
        suLuaChon = bienNhap.nextInt();

        switch(suLuaChon){
            case 1: giaiPTBacI(); break;
            case 2: giaiPTBacII(); break;
            case 3: tinhTienDien(); break;
            default: System.out.println("Chọn chức năng khác");
        }
    }

    static void giaiPTBacI(){
        float a = 0, b = 0;
        
        if(a == 0){
            if(b == 0){
                System.out.println("PT vô số nghiệm...");
            }
        }
    }

    
    static void giaiPTBacII(){
        System.out.println("Triển khai code giải phương trình bậc II ....");
    }

    static void tinhTienDien(){
        System.out.println("Triển khai code tinh tien dien ....");
    }
    
}
