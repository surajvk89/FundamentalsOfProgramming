import java.util.Scanner;

public class oop {
    double area;
    final double pi=3.1415;
    static int count;   // default value 0


    oop(){
        area = 0;
    }

    oop(double x,int y){
        area = x;
        count = y;
    }

    double circleArea(double radius){
        area = pi*radius*radius;
        return area;
    }

    double triangleArea(double height, double base){
        area = 0.5*height*base;
        return area;
    }

    double squareArea(double side){
        return side*side;
    }



    public static void main(String[] args) {
//        Day 8 : OOP concepts, class and object, constructor, this keyword
//        one file - one or more class
//        one class - one or more function / method
        oop oopRef;

        oop oopObj = new oop();
        oop oopParObj = new oop(0,0);
        double radius;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        System.out.println("Circle area is : " + oopObj.circleArea(radius));

        double base, height;
        base = sc.nextDouble();
        height = sc.nextDouble();
        System.out.println("Triangle area is : " + oopObj.triangleArea(height, base));

        car carObj = new car();
        carObj.model = "Nexon";
        carObj.sittingCapacity = 5;
        carObj.cc = 1200;
        carObj.average = 450;
//        carObj.price = 450000;
        System.out.println("Range of Tata Nexon EV is : " + carObj.average);
        carObj.printDetails();


        car carObj1 = new car("Scorpio",5,1300,12);
        carObj1.printDetails();


    }
}


class car{
    double average;
    double cc;
    int sittingCapacity;
    String model;
    private double price;

    car(){
        model = "";
        sittingCapacity = 0;
        cc = 0;
        average = 0;
        price=0;
    }
    car(String model, int sittingCapacity,double cc, double average){
        this.model = model;
        this.sittingCapacity = sittingCapacity;
        this.cc = cc;
        this.average = average;
    }

    void printDetails(){
        System.out.println("Car details are as follow : " );
        System.out.println("Model :" + model);
        System.out.println("CC :" + cc);
        System.out.println("Average :" + average);
    }
}