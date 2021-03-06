package com.company;


// The abstract template that Zookeepers are derived from.
public abstract class ZooEmployee {

    // Variables
    protected String name;
    protected float pay;

    // Constructor
    public ZooEmployee(){
        name = "";
        pay = 0;
    }

    // Methods
    public String GetName(){
        return(name);
    }
}
