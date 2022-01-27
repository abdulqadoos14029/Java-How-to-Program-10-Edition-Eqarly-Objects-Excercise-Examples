package com.example.separatedigit;
import java.util.Scanner;

public class SeparateDigit {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        int input1, x;
        System.out.print("Please Enter Number: ");
        input1=input.nextInt();
        if(input1/10000<1 || input1/10000>9){
            System.out.println("Please Enter Five Digit");
        }
        else{
            x=input1/10000;
            System.out.printf("%d\t", x);
            x=input1%10000;
            System.out.printf("%d\t", x/1000);
            x=x%1000;
            System.out.printf("%d\t", x/100);
            x=x%100;
            System.out.printf("%d\t", x/10);
            x=x%10;
            System.out.printf("%d\t",x );
        }
    }
}
