/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Question3 {


    private int number;
    
    public Question3(int number) {
        this.number = number;
        
    }
    
   
    public int HailstoneSequance(){
        int currentNum = this.number;
        while(currentNum > 1){
            if(currentNum%2==0)
                currentNum/=2;
            else
                currentNum=currentNum*3+1;
        }
        return currentNum;
        
        
    }
    
}
