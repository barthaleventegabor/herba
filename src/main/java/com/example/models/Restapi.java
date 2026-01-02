// Név: Bartha Levente Gábor
// Osztály: II-N 
// 2026.01.02
package com.example.models;

import java.util.ArrayList;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;

public class Restapi {
    
    String url = "http://localhost:8000/api/herbs";

    public ArrayList<Herb> getHerbs() {
        ResClient client = new ResClient();
        String json = client.get(url);
        Result result = ResConvert.toObject(json, Result.class);
        if(result.success) {
            return result.data;
        }
        return null;
    }
}
