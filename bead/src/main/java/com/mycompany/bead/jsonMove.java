/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bead;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author user
 */
public class jsonMove {
    public void move(){
        
        JSONParser parser = new JSONParser();
        try{
            JSONArray obj = (JSONArray) parser.parse(new FileReader("./newjson.json"));
            for (Object o : obj) {
                JSONObject jso = (JSONObject)o;
                String nev = (String)jso.get("nev");
                System.out.println(nev);
            }
                    }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
