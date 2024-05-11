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
//add
        cds.add(new CD("123444", "game", "audio", "conan", 2003, 100));
        cds.add(new CD("123443", "game1", "audio1", "conan1", 2005, 1000));
        cds.add(new CD("123442", "game2", "audio1", "conan1", 2004, 10009));
        cds.add(new CD("123441", "game2", "audio1", "conan1", 2002, 10056));
        
//Search CD by CD title
        String checkTitle = SearchByTitle(cds, "conan");
        //System.out.println(check);
//Search CD by CD title
        String checkCollection = SearchByCollection(cds, "game");
        // System.out.println(checkCollection);
 //Delete CD by CD ID       
        //String deletecDID = deleteCDId(cds, "123444");
 //Edit CD information by Id
        String result =  EditCD(cds,"123444", "Edited Title" );
            for(CD cd : cds){
//                System.out.println(cd);
            }
//       Sort the CD list ascending by year of release
//        sortCDAscendingByYear(cds);
                    
    }
    public static String EditCD(ArrayList<CD> cds, String Id, String title){
        for (CD cd : cds) {
            if (cd.getID().equals(Id)) {
                cd.setTitle(title);
                               
                return cd.toString();
            }
        }
        return "NotFound";
    }

    public static String SearchByTitle(ArrayList<CD> cds, String tittle) {
        for (CD cd : cds) {
            if (cd.getTitle().equals(tittle)) {
                return cd.toString();
            }
        }
        return "Not found";
    }

    public static String SearchByCollection(ArrayList<CD> cds, String collection) {
        for (CD cd : cds) {
            if (cd.getCollection().equals(collection)) {
                return cd.toString();
            }
        }
        return "Not found";
    }

    public static String deleteCDId(ArrayList<CD> cds, String ID) {
        for (CD cd : cds) {
            if (cd.getID().equals(ID)) {
                cds.remove(cd);
                return "CD ID" + ID + "deleted";
            }
        }
        return "NotFound";
    }
    
    public static void sortCDAscendingByYear(ArrayList<CD> cds){
         Collections.sort(cds, Comparator.comparingInt(CD::getYear));
        for(CD cd : cds){
                System.out.println(cd);
            }
    }

}

//        int index = Collections.binarySearch(cds, new CD("Greatest Hits", "", 0),CD.compareAboutTitle);
//        
//        if (index != -1) {
//            System.out.println("Found CD: " + cds.get(index));
//        } else {
//            System.out.println("CD not found.");
//        }
//         Comparator<CD> compareAboutPrice = new Comparator<CD>() {
//            @Override
//            public int compare(CD o1, CD o2) {
//                if(o1.getPrice()>o2.getPrice()) return 1;
//                if(o1.getPrice()<o2.getPrice()) return -1;
//                return 0;
//            }
//        };
//        index = Collections.binarySearch(cds, new CD("", "", 14.99),compareAboutPrice);
//        
//        if (index != -1) {
//            System.out.println("Found CD: " + cds.get(index));
//        } else {
//            System.out.println("CD not found.");
//        }
//        
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
//


