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
    
    
    public Question2(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
    
    public int findMinimumNumber(){
        int min;
        if(this.number1>=this.number2){
            min = this.number2;
        }else{
            min = this.number1;
        }
        if(min==this.number2){
            if(this.number2>this.number3)
                min = this.number3;
                
            else
                min = this.number2;
            
        } else if(min == this.number1){
            if(this.number1>this.number3)
                min = this.number3;
            else
                min = this.number1;
        }
        
        return min;
            
        
            
            
    }
    
}
