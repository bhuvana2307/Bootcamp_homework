package io.javabrains.javabasics;
import java.util.*;
/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */
class Animal{
    String name;
    int age;
    Animal(String n,int age) {
        this.name = n;
        this.age = age;
    }
    public  String makesound(String s)
    {
        return s;
    }
    public String tostring(){
        return "Animal"+"name='"+name+" "+"age="+age;
    }
}
class Dog extends Animal{
    String breed;
    Dog(String name,int age,String b){
        super(name,age);
        this.breed=b;
    }
    public String makesound(String s){
        System.out.println("The dog barks");
        return s;
    }

}
class Cat extends Animal{
    int numlives;
     Cat(String name,int age,int num){
         super(name,age);
         this.numlives=num;
    }
    public String makesound(String s){
        System.out.println("The cat meows");
        return s;
    }

}

public class InheritanceChallenge {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Animal lion=new Animal("Lion",8);
     Animal dog=new Animal("Dog",10);
     Animal cat=new Animal("Cat",6);
     Animal panda=new Animal("panda",12);
     Animal[] animals={lion,dog,cat,panda};
     for(Animal ani:animals){
         System.out.println("Enter the sound of animal "+ani.name);
         System.out.println(ani.tostring()+" "+"sound="+ani.makesound(sc.nextLine()));
     }

    }
}
