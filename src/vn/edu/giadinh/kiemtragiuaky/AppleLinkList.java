/*
*  created date: Nov 08, 2021
*  author: cgm
*/
package vn.edu.giadinh.kiemtragiuaky;


public class AppleLinkList {

    Node head = null;

    Node tail = null;

    public AppleLinkList() {

    }

    // them dau
    /**
     * true: empty false: not empty
     * 
     */
    boolean isEmpty() {

        boolean emtpy = true;

        if (head == null) {
            emtpy = true;
        } else {
            emtpy = false;
        }

        return emtpy;

    }

    public void addFirst(Apple apple) {

        // kiem tra danh sach co rong khong?

        Node newNode = new Node(apple);

        if (isEmpty()) {// THEM rong
            head = newNode;
            tail = newNode;

        } else {

            newNode.next = head;
            head = newNode;
        }

    }

    public void addLast(Apple apple) {

        Node newNode = new Node(apple);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }

    }

    Node binarySeach(int id){

        Node node = null;

        //bản chất????
        //giá trị các khóa được sắp xếp

        return null;

    }

    public Node findAppleById(int id) {
        Node node = null;

        if (isEmpty()) {
            System.out.println("List is empty!");
        } else {

            Node current;
            current = head;
            while(current != null){
                if(current.data.id == id){
                    node = current;
                }
                current = current.next;
            }

        }

        return node;
    }

    //theem truuoc
    public void addPreNode(int id, Apple apple){

       // Node node = null;

        Node preNode;

        if (isEmpty()) {
            System.out.println("List is empty!");
        } else {

            Node current;
            current = head;

            if(head.data.id == id){
                addFirst(apple);
            }
            
            while(current.next != null){

                preNode = current;
                //ddang tim
                if(current.data.id == id){
                    //node = current;

                    Node newNode = new Node(apple);//nust moi
                    preNode.next = newNode;
                    newNode.next = current;
                }
                current = current.next;
            }

        }
    }

    void deleteLast(){
        
        if(isEmpty()){

        }

        Node temp;
        temp = head;

        while(temp != null){
            //temp = temp.next;
            if(temp.next == tail){
                tail = temp;
                tail.next = null;
            }

            temp = temp.next;
            
        }

    }


    // them cuoi

    // tim kiem theo ma

    // in danh sach

    // them vao truoc nut tim duoc

    // xoa cuoi

}
