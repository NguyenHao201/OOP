/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

import com.mycompany.Question2.Employee;
import java.util.Scanner;

/**
 *
 * @author Computer
 */
public class PartTimeEmployee extends Employee {
    private int workingHour;
    private float payRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int workingHour, float payRate, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }
    
    @Override
    public void Input(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter working hour: ");
        workingHour = sc.nextInt();
        System.out.println("Enter pay Rate: ");
        payRate = sc.nextFloat();
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
        return (float)(getWorkingHour() * getPayRate());
    }
    
}

    
    

