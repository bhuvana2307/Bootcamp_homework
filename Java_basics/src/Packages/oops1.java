package Packages;

import java.util.Scanner;
class Rectangele{
    int length;
    int width;
    public int area(int len,int bred){
        length=len;
        width=bred;
        return length*width;

    }

}

public class oops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangele obj=new Rectangele();
        System.out.println("Enter the value of length");
        int len=sc.nextInt();
        System.out.println("Enter the value of width");
        int width= sc.nextInt();
        int res;
        res= obj.area(len,width);
        System.out.println("The area of rectangle is = " + res);



    }
}
