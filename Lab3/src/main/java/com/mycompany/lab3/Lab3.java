/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author tai.tran
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class CD implements Comparable<CD> {

public class Lab3 {
    public static void main(String[] args) {
        // Sample CDs
        ArrayList<CD> cds = new ArrayList<>();
     
                cds.add(new CD("Greatest Hits", "Queen", 15.99));
                cds.add(new CD("Thriller", "Michael Jackson", 12.99));
                cds.add(new CD("Back in Black", "AC/DC", 14.99));
                cds.add(new CD("Dark Side of the Moon", "Pink Floyd", 13.99));

        // Sort the array of CDs (required for binary search)
      //  Arrays.sort(cds);

        // Perform binary search for a CD with a specific title
       
       
        int index = Collections.binarySearch(cds, new CD("Greatest Hits", "", 0),CD.compareAboutTitle);
        
        if (index != -1) {
            System.out.println("Found CD: " + cds.get(index));
        } else {
            System.out.println("CD not found.");
        }
         Comparator<CD> compareAboutPrice = new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                if(o1.getPrice()>o2.getPrice()) return 1;
                if(o1.getPrice()<o2.getPrice()) return -1;
                return 0;
            }
        };
        index = Collections.binarySearch(cds, new CD("", "", 14.99),compareAboutPrice);
        
        if (index != -1) {
            System.out.println("Found CD: " + cds.get(index));
        } else {
            System.out.println("CD not found.");
        }
//        Comparator<CD> compareAboutTitle_Price = new Comparator<CD>() {
//            @Override
//            public int compare(CD o1, CD o2) {
//               if(o1.getTitle().compareTo(o2.getTitle())==1) return 1;
//               if(o1.getTitle().compareTo(o2.getTitle())==-1) return -1;
//               if(o1.getTitle().compareTo(o2.getTitle())==0)
//               {
//                   if(o1.getPrice()>o2.getPrice()) return 1;
//                   if(o1.getPrice()<o2.getPrice()) return -1;
//                   return 0;
//               }
//            }
//        };
    }
        

   
}
