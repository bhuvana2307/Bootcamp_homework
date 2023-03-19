package Packages;

import java.util.Scanner;

public class control {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the val for num:");
        int num = sc.nextInt();
        if(num>0){
            System.out.println(" Num is Positive");
        }
        else{
            System.out.println(" NUm is Negative");
        }
    }
}
