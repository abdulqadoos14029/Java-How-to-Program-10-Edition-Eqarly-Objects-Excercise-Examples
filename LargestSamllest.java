package com.example.largestsamllest;
import java.util.Scanner;

public class LargestSamllest {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        int input1,input2,input3,input4,input5;
        System.out.print("Enter 1st number: ");
        input1=input.nextInt();
        System.out.print("Enter 2nd number: ");
        input2=input.nextInt();
        System.out.print("Enter 3rd number: ");
        input3=input.nextInt();
        System.out.print("Enter 4th number: ");
        input4=input.nextInt();
        System.out.print("Enter 5th number: ");
        input5=input.nextInt();

        if(input1>input2 && input1>input3 && input1>input4 && input1>input5 ){
            System.out.print("Highest Number: ");
            System.out.println(input1);
        }
        if(input2>input3 && input2>input4 && input2>input5 && input2>input1){
            System.out.print("Highest Number: ");
            System.out.println(input2);
        }
        if(input3>input2 && input3>input4 && input3>input5 && input3>input1){
            System.out.print("Highest Number: ");
            System.out.println(input3);
        }
        if(input4>input3 && input4>input1 && input4>input5 && input4>input2){
            System.out.print("Highest Number: ");
            System.out.println(input4);
        }
        if(input5>input3 && input5>input4 && input5>input2 && input5>input1){
            System.out.print("Highest Number: ");
            System.out.println(input5);
        }



        if(input1<input2 && input1<input3 && input1<input4 && input1<input5 ){
            System.out.print("Smallest Number: ");
            System.out.println(input1);
        }
        if(input2<input3 && input2<input4 && input2<input5 && input2<input1){
            System.out.print("Smallest Number: ");
            System.out.println(input2);
        }
        if(input3<input2 && input3<input4 && input3<input5 && input3<input1){
            System.out.print("Smallest Number: ");
            System.out.println(input3);
        }
        if(input4<input3 && input4<input1 && input4<input5 && input4<input2){
            System.out.print("Smallest Number: ");
            System.out.println(input4);
        }
        if(input5<input3 && input5<input4 && input5<input2 && input5<input1){
            System.out.print("Smallest Number: ");
            System.out.println(input5);
        }
    }
}
