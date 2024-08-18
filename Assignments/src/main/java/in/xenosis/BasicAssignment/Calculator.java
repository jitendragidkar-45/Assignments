package in.xenosis.BasicAssignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Substraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.print("Enter your choice : ");
        Integer choice=sc.nextInt();
        System.out.print("Enter first number : ");
        Integer number1=sc.nextInt();
        System.out.print("Enter Second number : ");
        Integer number2=sc.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Addition of " + number1 + " & " + number2 + " : " + (number1 + number2));
            case 2 -> System.out.println("Subtraction of " + number1 + " & " + number2 + " : " + (number1 - number2));
            case 3 -> System.out.println("Multiplication of " + number1 + " & " + number2 + " : " + (number1 * number2));
            case 4 -> {
                if (number2 != 0) {
                    System.out.println("Division of " + number1 + " & " + number2 + " : " + (number1 / number2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            }
            default -> System.out.println("Please enter valid input !!");
        }
        }

    }
