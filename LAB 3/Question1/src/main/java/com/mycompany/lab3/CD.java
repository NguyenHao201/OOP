/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Computer
 */



   //class CD implements Comparable<CD> {
public class CD{
    private String ID;
    private String collection;
    private String type;
    private String title;
    private int  year;
    private double price;

    public CD() {
    }

    
    
    public CD(String ID, String collection, String type, String title, int dateTime, double price) {
        this.ID = ID;
        this.collection = collection;
        this.type = type;
        this.title = title;
        this.year = dateTime;
        this.price = price;
    }
    
    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Comparator<CD> getCompareAboutTitle() {
        return compareAboutTitle;
    }

    public static void setCompareAboutTitle(Comparator<CD> compareAboutTitle) {
        CD.compareAboutTitle = compareAboutTitle;
    }
    
    

    
    

//    @Override
//    public int compareTo(CD otherCD) {
//        // Compare CDs based on their titles
//        return this.title.compareTo(otherCD.getTitle());
//    }

    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", year='" + year   + '\'' +
                ", price=" + price +
                '}';
    }
     static Comparator<CD> compareAboutTitle = new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };
     
     public void Input(){
     Scanner obj = new Scanner(System.in);
         System.out.println("Enter ID: " );
         ID = obj.nextLine();
         System.out.println("Enter collection: ");
         collection = obj.nextLine();
     }
     
     public void Output(){
         System.out.println("ID: " + ID + "\nCollection: " + this.collection);
     }
    
}

