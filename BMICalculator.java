package com.example.bmi;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] arg){
        Scanner input= new Scanner(System.in);
        float input1;
        float input2;
        float input3;
        float input4;
        System.out.print("Please Enter Weight in Kilogram: ");
        input1=input.nextFloat();
        System.out.print("Please Enter Height in ft: ");
        input2=input.nextFloat();
        input2= (float) (input2 * 0.3048);
        System.out.print("Please Enter Height in inch: ");
        input3=input.nextFloat();
        input3= (float) (input3 * 0.0254);
        input4=input2+input3;

        float BMI= input1/(input4*input4);
        System.out.println(BMI);

        if (BMI<18.5){
            System.out.println("UnderWeight");
        }

        if (BMI>=18.5 && BMI<=24.9){
            System.out.println("Normal");
        }
        if (BMI>=25 && BMI<=29.9){
            System.out.println("OverWeight");
        }
        if (BMI>=30){
            System.out.println("Obese");
        }


    }
}
