package com.designpatterns.Design;

public class Samosha {
    private static Samosha samosha;
    //constructor
    private Samosha() {
        System.out.println("Samosha is ready to be served!");
    }
    //by making it private, we can control the instantiation of the class
    //  and ensure that only one instance is created (Singleton pattern)
    //we need a static method to get the instance of the class without it how would we access the private constructor??
    //Lazy initialization: we will create the instance of the class only when it is needed, which can save memory and improve performance
    public synchronized static Samosha getSamosha(){
       if(samosha==null){
         samosha =  new Samosha();
       }
        
        return samosha;
    }
    //this method wiil used to return the object of the class to the caller
    //NOTE :-> But, this method can called multiple times and 
    // it will create multiple instances of the class which is not what we want in a singleton pattern
}
