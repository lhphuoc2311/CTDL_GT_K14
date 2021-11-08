/*
*  created date: Oct 25, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {

    public static void main(String[] args) {
        Queue<Integer> queue;

        queue = new LinkedList<>();

        queue.add(8);
        queue.add(10);
        queue.add(2);

        //lấy ra 1 phần tử - trong quee  - lấy đầu
        

        System.out.println(queue);

        int phanTuDuocLayRa = queue.remove();

        System.out.println("Phần tử đươc lấy ra từ Queue " + phanTuDuocLayRa);

        System.out.println("Phần tử còn lại trong Queue");

        System.out.println(queue);

        //thăm 1 phần tử của Queue - không loại khỏi queue
        int phanDuocTham =  queue.peek();

        System.out.println("Phần tử vừa được thăm " + phanDuocTham);

        System.out.println("Phần từ còn lại trong queue sau Thăm");

        System.out.println(queue);



        //Cài đặt Linked List - Queue - Book
            //thêm 1 phần tử vào cuối
            //lây 1 phần tử ở đầu
            //xoá 1 phần tử ở đầu


        //Dùng Linked List để cài đặt cấu trúc Stack - Student
        //Cài đặt Linked List
            //thêm 1 phần tử vào cuối
            //lây 1 phần cuối
            //xoáy 1 phần tử ở cuối

            LinkedList linkedList;

            
        
    }
    
}
