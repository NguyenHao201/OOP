/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.defbank;

import java.util.Scanner;

/**
 *
 * @author tai.tran
 */
public class DEFBank {

    public static void main(String[] args) {
//        Bank bank = new Bank();
//        bank.Input();
//        bank.Print();
//        bank.Deposit1Account();
          Scanner obj = new Scanner(System.in);
          BankAccount bankAcc = new BankAccount();
          bankAcc.Input(obj);
          
          
    }
}
