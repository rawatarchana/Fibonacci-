package com.hva;

import java.util.ArrayList;

public class Fibbo {

    public ArrayList<Integer> perform(Integer limit) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer num = 0, n1 = 0, n2 = 1;
        while (num <= limit) {
            
           if(num<=limit)
           {
            list.add(n1);
           }
           num = n1 + n2;
            n1 = n2;
            n2 = num;
        }

        return list;

    }
    public static void main(String[] args) {
        Fibbo fibbo = new Fibbo();
         System.out.println(fibbo.perform(13));
        
    }

}
