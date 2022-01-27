package com.example.multiplenumber;
import java.util.Scanner;
public class MultipleNumber {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        int input1,input2;
        System.out.print("Enter 1st Number: ");
        input1=input.nextInt();
        System.out.print("Enter 2nd Number: ");
        input2=input.nextInt();
        if(input1%input2==0){
            System.out.println("Multiple");
        }
        else{
            System.out.println("Not Multiple");
        }

    }


}
