/*
*  created date: Oct 25, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan08;

public class BinaryTreeTestDrive {

    public static void main(String[] args) {
        BinaryTree binaryTree =  BinaryTree.createBinaryTree();

        //BinaryTree.traverseInOrder(binaryTree.root);

        BinaryTree.breadthFirst(binaryTree.root);

    }
}
