package Packages;
import java.util.*;
public class Data_types {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the name:");
        String name=sc.nextLine();
        System.out.println(" Enter the age:");
        int age=sc.nextInt();
        System.out.println(" Enter the Salary:");
        int salary=sc.nextInt();
        System.out.println( String.format("Name : [%s]",name));
        System.out.println(String.format("Age : [%d]",age));
        System.out.println(String.format("Salary : [%d]",salary));


    }
}
