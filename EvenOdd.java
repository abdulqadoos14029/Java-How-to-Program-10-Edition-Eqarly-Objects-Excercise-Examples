package com.example.evenodd;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        int input1;
        System.out.print("Enter Number: ");
        input1=input.nextInt();
        if(input1%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }


}
