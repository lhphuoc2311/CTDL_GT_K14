/*
*  created date: Oct 04, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan05;

import java.util.ArrayList;
import java.util.List;

import com.phuoclh12345678.tuan04.Dog;
import com.phuoclh12345678.tuan04.Student;

public class CTMinhHoaArrayList {

    public static void main(String[] args) {
        
        ArrayList a = new ArrayList(5);
        a.add("Cường");
        a.add(1);
        a.add(new Dog(22, "Vàng", "Fido"));

        Dog dog = (Dog)a.get(2);
        System.out.println("Dog name: " + dog.name + " corlor " + dog.color);

        a.add(1.5);
        a.add(5);

        System.out.println(a.get(0));

        

        List bienTCArrayList = new ArrayList();

        bienTCArrayList.add(new Student("Tèo", 18));

        //lấy 1 phần tử từ List
        Student student = (Student)bienTCArrayList.get(0);

        System.out.println(bienTCArrayList);

        List<String> lisStrings = new ArrayList<>();
        //lisStrings.add(1);
        lisStrings.add("Mr Tèo");

        ArrayList<Student> aStudents = new ArrayList<>();
        //aStudents.add("Mr tèo");
        Student student2 = new Student();
        aStudents.add(student2);
        aStudents.add(new Student());
        



    }
    
}
