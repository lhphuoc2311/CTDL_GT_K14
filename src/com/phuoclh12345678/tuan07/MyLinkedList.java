/*
*  created date: Oct 18, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan07;

public class MyLinkedList {

    Node head = null;// DANH SÁCH RỖNG
    Node tail = null;


    public MyLinkedList(){}

    
    void add(int data){

        //Tạo 1 Node mới
        Node newNode = new Node(data);

        if(head == null){//thêm 1 nút vào ds rỗng
            head = newNode;
            tail = newNode;
        }else{//ds không rỗng// thêm vào đuổi danh sách
            tail.next = newNode;
            tail = newNode;
        }


    }

    void remve(){

    }

    void print(){
        Node current = head;

        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("Các nút nút trong danh sách:");
        while(current != null){
            System.out.println(current.data);
            current = current.next;

        }


    }

    void find(){

    }
    
}
