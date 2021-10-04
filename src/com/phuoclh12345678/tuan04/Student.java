/*
*  created date: Sep 27, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan04;

public class Student {

    String name;
    int age;

   public Student (){};

    public Student(String n, int a){
        name = n;
        age = a;
    }

    void inThongTin(){
        System.out.println("Name: " + name + "   age: " + age);
    }
    
}
