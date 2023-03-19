package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */
class Rectangle{
    int width;
    int height;
    static int numofRectangle;
     Rectangle(int wid,int hei){
        this.width=wid;
        this.height=hei;
        numofRectangle++;
    }
    public int getArea() {
        return width*height;
    }
    public int getPerimeter(){
        return 2*(width+height);
    }
    public int getNumofRectangle(){
        return numofRectangle;
    }
}
public class StaticChallenge {
    public static void main(String[] args) {
     Rectangle r1=new Rectangle(2,5);
     Rectangle r2=new Rectangle(7,8);
     Rectangle r3=new Rectangle(3,9);
     Rectangle[] rectangle={r1,r2,r3};
     int i=0;
     for(Rectangle r:rectangle){
         ++i;
         System.out.println("Rectangle "+i);
         System.out.println("The area is: "+ r.getArea());
         System.out.println("The Perimeter is: " +r.getPerimeter());
     }
        System.out.println("The total rectangle created is: "+ r1.getNumofRectangle());

    }
}
