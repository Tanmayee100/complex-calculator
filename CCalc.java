package com.eg.java;

import java.util.Scanner;

public class Main{
        public static void main(String[] args){
                String input1= getInput("Enter value one:");
                String input2= getInput("Enter value two:");
                String opt= getInput("Choose an option: 1.+ 2.- 3./ 4.%");
                double result=0;
                try{
                   switch(opt){
                         case "1":
                               result= addValues(input1,input2);
                               break;
                         case "2": 
                               result= subtractValues(input1,input2);
                               break;
                         case "3":
                               result= multiplyValues(input1,input2);
                               break;
                         case "4":
                               result= divideValues(input1,input2);
                               break;
                         default:
                               System.out.println("Unrecognized operation!");
                               return;
                     }
                    System.out.println("Answer"+ result);
                 } catch(Exception e){
                    System.out.println(e.getMessage());
                 }
               }
               private static double addValues(String input1,String input2){
                       double a= Double.parseDouble(input1);
                       double b= Double.parseDouble(input2);
                       return a+b;
               }
               private static double subtractValues(String input1,String input2){
                       double a= Double.parseDouble(input1);
                       double b= Double.parseDouble(input2);
                       return a-b;
               }
               private static double multiplyValues(String input1,String input2){
                       double a= Double.parseDouble(input1);
                       double b= Double.parseDouble(input2);
                       return a*b;
               }
               private static double divideValues(String input1,String input2){
                       double a= Double.parseDouble(input1);
                       double b= Double.parseDouble(input2);
                       return a/b;
               }
               private static String getInput(String prompt){
                       System.out.print(prompt);
                       Scanner scan= new Scanner(System.in);
                       return scan.nextLine();
               }
 }
 
                              
    
