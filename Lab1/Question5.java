package com.mycompany.lab1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class Question5 {
    private ArrayList<Integer> numberList;

    // Constructor
    public Question5() {
        this.numberList = new ArrayList<>();
    }
    
    public void inputRangeFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers in the range: ");
        int n = sc.nextInt();
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numberList.add(num);
        }
    }
    //5a
    
//    public void chooseNumToRemove(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number to delete: ");
//        int numberToDelete = sc.nextInt();
//        numberList.remove(numberToDelete);
//        if (numberList.contains(numberToDelete)) {
//            numberList.remove(Integer.valueOf(numberToDelete));
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//    }
    
        
    
    //5b
//    public void insertElement() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter position: ");
//        int position = sc.nextInt();
//        System.out.println("Enter element: ");
//        int element = sc.nextInt();
//        numberList.add(position, element);
//        for (int i = 0; i < numberList.size(); i++) {
//            System.out.print(numberList.get(i)+" ");
//        
//        }
//    }
    
    //5c
//    public void ArrayDuplicateFinder() {
//        ArrayList<Integer> duplicates = new ArrayList<>();
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int num : numberList) {
//            if (!set.add(num)) {
//                if (!duplicates.contains(num)) 
//                    duplicates.add(num);
//                
//            }
//        }
//
//        System.out.println("Duplicate values: " + duplicates);
//    }
    
    //5d
    public void ArrayDuplicateRemover() {
    // Function to remove duplicate values from an array of integers
    //public static ArrayList<Integer> removeDuplicates(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array
        for (int num : numberList) {
            // Add the element to the result if it's not in the set
            if (set.add(num)) {
                result.add(num);
            }
        }

        System.out.println(result); 
    }
    
}

    
    
    

        

