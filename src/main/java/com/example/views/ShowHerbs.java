// Név: Bartha Levente Gábor
// Osztály: II-N 
// 2026.01.02
package com.example.views;

import java.util.ArrayList;

import com.example.models.Herb;

public class ShowHerbs {
    public static void startShow(ArrayList<Herb> herbList) {
        System.out.printf("%-5s %-20s\n", "ID", "Név");
        
        for(Herb herb : herbList) {
            System.out.printf("%-5d %-20s\n",
                herb.getId(),
                herb.getName()
            );
        }
        
    }    
}
