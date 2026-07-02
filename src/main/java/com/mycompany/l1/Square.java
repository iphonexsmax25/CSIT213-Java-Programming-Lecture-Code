package com.mycompany.l1;

public class Square {
    private int length; // Instance Variable
                        // Instance Variable are global within class
    //Constructor
    // (1) No return type 
    // (2) method name must be the same as class name 
    public Square(int initlength){
        this.length = initlength;
    }

    //get and set methods
    public void setLength(int length){
        this.length = length;
    }
    public int getArea(){ //Instance Method
        return length * this.length;
    }
    public int getPerimeter(){
        return length * 4;
    }
}
// test 