/*
*  created date: Oct 11, 2021
*  author: cgm
*/
package com.phuoclh12345678.tuan06.lab4.bai2;

import java.util.ArrayList;
import java.util.Collections;


public class CTMinhHoaBaiLab4DoiTEn {

    public static void main(String[] args) {
        ArrayList<String> hoTen = new ArrayList<>();

        hoTen.add("Mít");
        hoTen.add("Tý");
        hoTen.add("an");

        System.out.println(hoTen);

        Collections.shuffle(hoTen);

        System.out.println(hoTen);

        Number number1,  number2;

        

        number1 = Integer.valueOf(5);

        number2 = Integer.valueOf(10);

        //swap(number1, number2);
       // Number temp = Integer.valueOf(10);

        //number1 = temp;

        //System.out.println("Number 1: " + number1);

        //System.out.println(number1);

        String str1 = "Ku";
        String str2 = "Ty";

        str2.length();

        swap(str1, str2);

        System.out.println("" + str1);

    }

    static void swap(String number1, String number2){
        String temp = number2;
        number1 = new String(number2);
    }

    static void swap(Number number1, Number number2){

        //Number temp = Integer.valueOf(10);
        //number1 = Integer.valueOf(number2.intValue());
        number1 = number2;
        //num
        
    }
    
}
