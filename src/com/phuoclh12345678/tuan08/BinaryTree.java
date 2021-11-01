/*
*  created date: Oct 25, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan08;

import java.lang.reflect.WildcardType;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;
import javax.swing.RootPaneContainer;

public class BinaryTree {
   public Node root;

    private Node addRecursive(Node current, int value) {

        if (current == null) {
            return new Node(value); // kết thúc hàm
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;

    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public static BinaryTree createBinaryTree() {

        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

    public static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public static void breadthFirst(Node node){
        if(node == null){
            System.out.println("Empty Tree");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.println(current.value);
            if(current.left !=null) {
                queue.add(current.left);
            }

            if(current.right !=null) {
                queue.add(current.right);
            }
        }
    }

}
