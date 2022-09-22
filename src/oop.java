import java.util.Scanner;

public class oop {
    double area;
    final double pi=3.1415;
    static int count;   // default value 0


    String str = "new string";
    int len = str.length();
    char c = str.charAt(2);
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
//        carObj.printDetails();
//        car.printDetails();


        car carObj1 = new car("Scorpio",5,1300,12);
//        carObj1.printDetails();

        animal anm1 = new animal();
        animal anm2 = new animal();
        animal.printInfo();
        anm1.legs = 2;
        anm2.printInfo();
//        car.price=20;


    }
}


class car{
    double average;
    double cc;
    int sittingCapacity;
    String model;
    private double price;

   public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if(price<0){
            this.price=0;
        }else {
            this.price = price;
        }
    }

    car(){
        model = "";
        sittingCapacity = 0;
        cc = 0;
        average = 0;
        setPrice(0);
    }
    car(String model, int sittingCapacity,double cc, double average){
        this.model = model;
        this.sittingCapacity = sittingCapacity;
        this.cc = cc;
        this.average = average;
        printDetails();
    }

     private void printDetails(){
        System.out.println("Car details are as follow : " );
        System.out.println("Model :" + model);
        System.out.println("CC :" + cc);
        System.out.println("Average :" + average);
    }
}

class animal{
    static int legs;
    static int eyes;
    animal(){
        legs =4;
        eyes =2;
    }
    animal(int legs,int eyes){
        this.legs = legs;
        this.eyes = eyes;
    }

    static void printInfo(){
        System.out.println("Number of legs : " + legs + " , Number of eyes : " + eyes );
    }

   public final void sound(){
        System.out.println("Default");
    }
}



class dog extends animal{
    dog(int legs, int eyes){
        super(legs,eyes);
    }



//    public void sound(){
//        System.out.println(" bow bow");
//    }
}



//class cat extends animal{
//    public void sound(){
//
//    }
//}
//


class c1{
//    properties of class c1
}

class c2 extends c1{
    //public and protected properties of c1 are inherited in c2
    //properties of c2 class
}

class c3 extends c1{
    //public and protected properties of c1 are inherited in c3
    //properties of c3 class
}


class shape{
    //public - inherited in all sub classes
    //protected - inherited in immediate subclass only
}
class rectangle extends shape{

}
class square extends rectangle{

}
class square1 extends square{

}