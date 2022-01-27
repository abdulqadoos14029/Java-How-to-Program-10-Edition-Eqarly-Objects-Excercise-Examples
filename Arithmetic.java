package com.example.arithmetic;

import java.util.Scanner;                   //Importing Java Library

public class Arithmetic {
    public static void main(String[] arg){
        Scanner input= new Scanner(System.in);  //Getting User Input
        int input1,input2;
        System.out.print("Enter 1st Number: ");
        input1= input.nextInt();
        System.out.print("Enter 1st Number: ");
        input2= input.nextInt();
        System.out.printf("Sum: %d%n",input1+input2);
        System.out.printf("Difference: %d%n",input1-input2);
        System.out.printf("Multiply: %d%n",input1*input2);
        System.out.printf("Division: %d%n",input1/input2);

    }
}
