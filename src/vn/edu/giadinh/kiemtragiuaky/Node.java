package vn.edu.giadinh.kiemtragiuaky;
/*
*  created date: Nov 08, 2021
*  author: cgm
*/

public class Node {

    //noi dung / du lieu
    Apple data;

    Node next;

    Node pre;

    //Lien Ket

    public Node(){
        data = null;
        next = null;
    }


    public Node(Apple apple){
        data = apple;
        next = null;
    }

    public Node(Apple apple, Node node){
        data = apple;
        next = node;
    }

    
}
