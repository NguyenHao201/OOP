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
    private String title;
    private String artist;
    private double price;

    public CD(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
                ", artist='" + artist + '\'' +
                ", price=" + price +
                '}';
    }
     static Comparator<CD> compareAboutTitle = new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };
    
}

