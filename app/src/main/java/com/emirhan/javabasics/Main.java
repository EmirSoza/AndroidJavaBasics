package com.emirhan.javabasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        final double pi = 3.14; // immutable now
        int sideIE = 20;
        int r = 4;
        double area = pi*r*r;
        String name= "Emirhan";
        int leng=name.length();
        name =name.toUpperCase();

        //Arrays
        String[] stringArray = new String[3]; //have to specify the length in this way
        stringArray[0] = name;
        String[] newArray = {name};

        //Lists   sirali ve esnek genelde bunu kullan
        ArrayList<String> musics = new ArrayList<>();
        musics.add("stfu");
        String a = musics.get(0);
        musics.add(0, "Kim");


        //HashSet --setler sirasiz ve elemanlar unique
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(1);
        intSet.add(2);


        //HashMap
        HashMap<Integer,String> myMap = new HashMap<Integer,String>(){{put(1,"w");put(2,"q");}};
        HashMap<Integer,String> myMap2 = new HashMap<Integer,String>();
        myMap.get(1); //w
        myMap.values(); //value set
        myMap.keySet(); //keys
        System.out.println(myMap.values().toArray()[0]);

        //statements
        if(r<=6 || true){

        }
        else if (r == 0) {

        }
        else {

        }

        //Switch
        int day =1;
        switch (day){
            case 1  : day++; break;
            case 2 : day--; break;
            case 3 : day = 0; break;
            default: day = 29; break;
        }

        //for loop
        int[] nums = {1,2,4,8,0,89,5};
        for (int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        for (int elem : nums){
            System.out.println(elem*4);
        }

        //While loop
        int c = 0;
        while (c < nums.length){
            System.out.println(nums[c]);
            c++;
        }

    }
}
