package com.designpatterns.app;

import com.designpatterns.Design.Jalebi;
import com.designpatterns.Design.Samosha;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Design Patterns Backend!");
        System.out.println("Java version: " + System.getProperty("java.version"));
        //calling the Samosha class to demonstrate its functionality
        // new Samosha();
        Samosha samosha1 = Samosha.getSamosha();
        System.out.println(samosha1.hashCode());
         Samosha samosha2 = Samosha.getSamosha();
        System.out.println(samosha2.hashCode());
        //calling jalebi class to demonstrate its functionality
        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode()); 
    }
}
