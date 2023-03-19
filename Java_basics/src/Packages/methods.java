package Packages;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sting:");
        String s=sc.nextLine();
        int len=s.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'|| s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                count++;
            }
        }
        System.out.println("count of vowels in string  = " + count);
    }
}
