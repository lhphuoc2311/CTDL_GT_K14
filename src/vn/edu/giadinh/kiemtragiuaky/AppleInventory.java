/*
*  created date: Nov 08, 2021
*  author: cgm
*/
package vn.edu.giadinh.kiemtragiuaky;

import java.util.ArrayList;

public class AppleInventory {

    ArrayList<Apple>  inventory = new ArrayList<>();

    public AppleInventory(){

    }

    public void them(Apple apple){

        inventory.add(apple);

    }


    public void inAppleList(){
        for (Apple apple : inventory) {
            apple.printApple();
        }
    }

    public ArrayList<Apple> findAppleByCorlor(String corlor){
        ArrayList<Apple> results = new ArrayList<>();

        for (Apple apple : results) {
            if(apple.corlor.equalsIgnoreCase(corlor)){
                results.add(apple);
            }
        }

        return results;
    }



    
}
