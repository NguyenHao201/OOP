/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */


public class Question4 {

    
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int number5;
    
    public Question4(int number1, int number2, int number3, int number4, int number5) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
        this.number5 = number5;
    }
    
    
   
    
    public int sumArray(){
        //input
        int[] Array1 = new int[5];
        Array1[0] = this.number1;
        Array1[1] = this.number2;
        Array1[2] = this.number3;
        Array1[3] = this.number4;
        Array1[4] = this.number5;
        //sum
        int sum=0;
        for(int e:Array1){
            if(e%2==0)
                sum +=e;
        }
        return sum;
    }
    
}
