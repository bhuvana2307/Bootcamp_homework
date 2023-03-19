package io.javabrains.javabasics;
import javax.xml.validation.SchemaFactory;
import java.util.*;


/*
1.  Create a class called `Car` with member variables for the make, model, and year of the car.
2.  Create a constructor method for the `Car` class that initializes the member variables.
3.  Create getter methods for the make, model, and year.
4.  Create a `toString` method that returns a string representation of the car in the form "year make model".
5.  In the `main` method of this class, create a `Car` object with a make, model, and year of your choice.
6.  Use the member variables and methods of the `Car` class to print the make, model, and year of the car.
7.  The expected output of the program is:

```
Make: Toyota
Model: Camry
Year: 2020
Details: 2020 Toyota Camry
```

 */
class Car{
     private String make;
      private String model;
     private int year;
    public  Car(String m,String mo,int y){
        //super();
        this.make=m;
        this.model=mo;
        this.year=y;
    }
    public  String getmake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getyear(){
        return year;
    }
    public String tostring(){
          return year+" "+model+" "+make;
    }


}

public class ClassesAndObjects {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Car obj=new Car("Toyota","camry",2020);

        System.out.println("Make: "+ obj.getmake() );
        System.out.println("Model: "+ obj.getModel());
        System.out.println("Year: "+ obj.getyear());
        System.out.println("Details: "+ obj.tostring());


    }
}
