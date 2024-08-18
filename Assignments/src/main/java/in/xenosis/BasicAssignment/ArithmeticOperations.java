package in.xenosis.BasicAssignment;

import java.util.Scanner;

//Write a program to perform basic arithmetic operation
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        Integer num1=sc.nextInt();
        System.out.println("Enter Second number : ");
        Integer num2=sc.nextInt();
        //Addition
        System.out.println("Addition : "+(num1+num2));
        //Substraction
        System.out.println("Substraction : "+(num1-num2));
        //Multiplication
        System.out.println("Multiplication : "+(num1*num2));
        //Division
        System.out.println("Division : "+(num1/num2));
    }
}
