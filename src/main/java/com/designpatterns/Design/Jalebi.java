package com.designpatterns.Design;

public class Jalebi {
    private static Jalebi jalebi = new Jalebi();
    //Eager initialization: we will create the instance of the class at the time of class loading,
    //  which can ensure that only one instance is created and is thread-safe..
    public static Jalebi getJalebi(){
        return jalebi;
    }

}
