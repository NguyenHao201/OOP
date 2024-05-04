/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author Computer
 */
public class ComplexNumber {
    private double re;
    private double im;


    public ComplexNumber() {
    }

    public ComplexNumber(double real, double image) {
        this.re = real;
        this.im = image;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }
    
    public void Input(Scanner obj){
        System.out.println("Enter real number: ");
        
    }


    
    public ComplexNumber Plus( ComplexNumber cp1)
    {
        ComplexNumber result = new ComplexNumber();
        result.setRe(this.re + cp1.getRe());
        result.setIm(this.im + cp1.getIm());
        return result;
    }
    
     public ComplexNumber Minus( ComplexNumber cp1)
    {
        ComplexNumber result = new ComplexNumber();
        result.setRe(this.re - cp1.getRe());
        result.setIm(this.im - cp1.getIm());
        return result;
    }
     
     public ComplexNumber Multiply ( ComplexNumber cp1)
    {
        ComplexNumber result = new ComplexNumber();
        result.setRe(this.re * cp1.getRe());
        result.setIm(this.im * cp1.getIm());
        return result;
    }
     

    public void output(){
        System.out.println(this.re +" + " +this.im+"i" );
        
    }
    
    
}
