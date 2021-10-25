/*
*  created date: Oct 25, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan07;

import java.util.Stack;

import com.phuoclh12345678.tuan04.Student;

public class StackDemoProgram {
    public static void main(String[] args) {
        
        Stack<String> stack;

        stack = new Stack<>();

        //thêm phần tử vào Stack
        stack.push("WelCome");
        stack.push("To");
        stack.push("Data Structure and Algotithm");

        System.out.println(stack);

        //lấy ra 1 phân tử từ đỉnh Stack (xóa phần tử khỏi Stack)
        String poped = stack.pop();

        System.out.println("Đã lấy ra từ danh stack " + poped);

        System.out.println("Phần tử còn lại của Stack");
        System.out.println(stack);

        //THĂM NÚT ĐỈNH // không loại khỏi danh sách
        String phanTuDuocTham = stack.peek();
        System.out.println("Thăm phần tử đỉnh: " + phanTuDuocTham);

        //sau khi thăm
        System.out.println(stack);


        Stack<Student> stack2;

    }
    
}
