/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Question2;
import java.util.ArrayList;

/**
 *
 * @author Computer
 */
public class Question2 {

    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
        arr.add(new Employee("123", "Nam", 2001, "Binh Duong", "012345"));
        arr.add(new Employee("456", "Sonic", 2002, "Binh Tan", "123456"));
        arr.add(new Employee("789", "Cacao", 2003, "Binh Thanh", "234567"));
        
        String info = getInfo(arr , "123");
        System.out.println(info);
    }
    
    public static String getInfo(ArrayList<Employee> arr, String ID) {
        for (Employee employ : arr) {
            if (employ.getEmployeeID().equals(ID)) {
                return "Employee{" + "employeeID=" 
                        + employ.getEmployeeID() 
                        + ", employeeName=" +
                        employ.getEmployeeName() 
                        + ", yearOfBirth=" + employ.getYearOfBirth() 
                        + ", address=" + employ.getAddress() + ", phone=" + employ.getPhone() + '}';
            }
        }
                    return "Not Found";

    }
    
    
}
