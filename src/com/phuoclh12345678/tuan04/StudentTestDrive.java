/*
*  created date: Sep 27, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan04;

import java.util.Scanner;

public class StudentTestDrive {

    public static void main(String[] args) {
        //tạo 1 danh sách sinh viên
        Student[] studentList  = new Student[2];

        //nhập danh sách sinh viên từ bàn phím
        Scanner varInput = new Scanner(System.in);

        System.out.println("Nhập vào danh sách sinh viên");

        for(int i = 0; i < studentList.length; i++){
            System.out.println("Nhập sinh viên thứ " + (i+1));
            System.out.print("Tên sinh viên: ");
            String name = varInput.nextLine();
            System.out.print("Tuổi: ");
            int age = varInput.nextInt();//15 ENTER
            varInput.nextLine();//NHẬN VÀO PHÍM ENTER
            studentList[i] = new Student(name, age);
        }


        //in danh sách sinh viên
        System.out.println("============in danh sách sinh viên sau nhập===========");
        for (Student student : studentList) {

            student.inThongTin();
            
        }

    }
    
}
