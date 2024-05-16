/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Question2;

import java.util.Scanner;


/**
 *
 * @author Computer
 */
public class FullTimeEmployee extends Employee {
    private float salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(float salary, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
    
    public float getPayMent(float salary){
     return salary;
    }
    
    @Override
    public void Input(){
    Scanner obj = new Scanner(System.in);
    salary = obj.nextFloat();
    }
    

    @Override
    public String getInfo() {
        return "Employee ID: " + employeeID +
               " Employee Name: " + employeeName +
                " Year of Birth: " + yearOfBirth +
                " Address: " + address +
                " Phone: " + phone;
    }
    

    @Override
    public float getPayment() {
        return salary;
    }
}
