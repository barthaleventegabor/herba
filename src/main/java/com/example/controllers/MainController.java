// Név: Bartha Levente Gábor
// Osztály: II-N 
// 2026.01.02
package com.example.controllers;

import java.util.ArrayList;

import com.example.models.Herb;
import com.example.models.Restapi;
import com.example.views.ShowHerbs;


public class MainController {
    public static void startProgram() {
        ArrayList<Herb> herbList = new Restapi().getHerbs();
        ShowHerbs.startShow(herbList);
    }
}
