package calculator;

import java.util.Scanner;

import operations.Addition;
import operations.Subtraction;
import operations.Multiplication;
import operations.Division;

public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(Addition.add( num1,num2));
            break;
        case 2:
            System.out.println(Subtraction.sub( num1,num2));
            break;      
        case 3:
            System.out.println(Multiplication.mult( num1,num2));
            break;
        case 4:
            System.out.println(Division.div( num1,num2));
            break;
            default:
                System.out.println("Illigal Operation");
         inp.close();
        }
    }
}