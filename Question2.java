/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Question2 {

    
    private int number1;
    private int number2;
    private int number3;
    private int minimum;
    
    public Question2(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
    
    public int findMinimumNumber(){
        int minimumNumber = 0;
        if(this.number1>=this.number2){
            minimum = this.number2;
        }else{
            minimum = this.number1;
        }
        if(minimum==this.number2){
            if(this.number2>this.number3)
                minimum = this.number3;
                
            else
                minimum = this.number2;
            
        } else if(minimum == this.number1){
            if(this.number1>this.number3)
                minimum = this.number3;
            else
                minimum = this.number1;
        }
        
        return minimum;
            
        
            
            
    }
    
}
