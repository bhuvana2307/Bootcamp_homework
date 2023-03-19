package Packages;

import java.util.Scanner;

public class operators {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the val of a:");
        int a=sc.nextInt();
        System.out.println("Enter the val of b:");
        int b=sc.nextInt();
        System.out.println("Addition : "+(a+b));
        System.out.println("Subtraction : "+ (a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division : "+(a/b));
        System.out.println("Modulo : "+(a%b));
        int incre=a++;
        int decre=b++;
        System.out.println("increment : "+incre);
        System.out.println("decrement : "+decre);

    }
}
