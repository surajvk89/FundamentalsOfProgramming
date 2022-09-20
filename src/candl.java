import java.util.Scanner;

public class candl {
    public static void main(String[] args) {
////        Day 5
//        boolean sessionScheduled;
//
//        sessionScheduled = false;
//
//        if(sessionScheduled == true){
//            System.out.println("Attend Session");
//        }
////        if(sessionScheduled == false){
////            System.out.println("Attend Test");
////        }
//        else {
//            System.out.println("Attend Test");
//        }
//
//        int a=10,b=20,c=30;
//        if(a>b && a>c){
//            System.out.println("A is greater");
//        }
//        if(b>a && b>c){
//            System.out.println("B is greater");
//        }
//        if(c>a && c>b){
//            System.out.println("C is greater");
//        }
//
//        //coffee machine- more than 2 options
//        //if-else-if
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b = sc.nextInt();
//        if(a>b){
//            System.out.println("A is greater than B");
//        }else if(a<b){
//            System.out.println("B is greater than A");
//        }else{
//            System.out.println("A is equal to B");
//        }
//
//        if(a>b && a>c){
//            System.out.println("A is greater");
//        }else if(b>a && b>c){
//            System.out.println("B is greater");
//        }else {
//            System.out.println("C is greater");
//        }
//
//
//        if(a>b){
//            //a>b
//            if(a>c) {
//                //a>b && a>c
//                System.out.println("A is greater");
//            }else{
////                a>b && c>a -- c>a && c>b
//                System.out.println("C is greater");
//            }
//        }else {
//            //b>a
//            if(b>c){
//                System.out.println("B is greater");
//        }else{
//                //c>b>a
//                System.out.println("C is greater");
//            }
//        }
//
//        double marks;
//        marks = sc.nextDouble();
//        String Grade;
//        if(marks>=40 && marks<50){
//            Grade = "Pass";
//        }else if(marks>=50 && marks<70){
//            Grade = "First class";
//        }else if(marks >=70 && marks<=100){
//            Grade = "Distinction";
//        }else{
//            Grade = "fail";
//        }
//
//        int month;
//        month = sc.nextInt();
////        String monthName;
////        monthName = sc.next();
//        switch(month){
//            case 1:
//                System.out.println("Summer");
//                break;
//            case 2 :
//                System.out.println("Monsoon");
//                break;
//            case 3 :
//                System.out.println("Winter");
//                break;
//            default :
//                System.out.println("Provide valid input");
//        }


//        Day 6 - Loops
//        for()
//            while()
//                do-while()

//        even numbers from 1 to 100
        int n = 1;
        while (n <= 10) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }

        int num = 1, product = 1;
        while (num <= 10) {
            product = product * num;
            num++;
        }
        System.out.println("Result :" + product);

        num = 1;
        product = 1;
        while (product < 500000) {
            product = product * num;
            if (product > 500000)
                break;
            System.out.println(num);
            num++;   // num = num + 1
        }
        System.out.println("Result :" + product);


//        while(true){
//            System.out.println("Infinite Loop");
//        }

//        for(initialization;condition;increment_or_decrement){
//            for loop statements
//        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Value of local variable i :" + i);
            if (i % 2 == 0)
                System.out.println("Number " + i + "is even.");
            else
                System.out.println("Number " + i + "is odd.");
        }


        product = 1;
        for (n = 1; n <= 10; n++) {
            product = product * n;
        }
        System.out.println("Result :" + product);


//        while(condition){
//            action
//        }

//        do{
//            action
//        }while(condition);
//
//        System.out.println("Inside do-while loop");
//
//        do{
//            System.out.println("Result :" + product);
//            product=0;
//        }while(product>0);
//
//
//        int arr[];
//        int size;
//        System.out.println("Provide array size :");
//        Scanner sc =new Scanner(System.in);
//        size = sc.nextInt();
//
//        arr = new int[size];
//        System.out.println("Enter Data values :");
//        for(int index=0;index<size;index++){
//            arr[index] = sc.nextInt();
//        }
//        for(int index=0;index<size;index++){
//           System.out.println(arr[index]);
//        }

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                if (j == k)
                    continue;
                System.out.println(j + "" + k);
            }
        }

//        Day 7
//        while(true) {
//        }
//        while(x>=0 || x<0){
//        }
//        x=0;
//        while(x++>=0){
//        }
//        x=0;
//        while(x--<=0){
//        }

//        functions
//        inbuild or user defined

        String str = "new String variable";
        int len = str.length();
        System.out.println(len);
        System.out.println(str.toUpperCase());

        evenOdd(76);
        evenOdd(87);
        evenOdd(8);
        evenOdd(11);

        candl cl = new candl();
        System.out.println(cl.add(1,2));

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean st = cl.prime(n);
        System.out.println(st);


        int x=10,y=20;
        System.out.println("Before swapping :" + x + " " + y);
        cl.swap(x,y);   //cl.swap(10,20);
        System.out.println("After swapping :" + x + " " + y);

        char ch='y';
        while(ch=='y'){
            System.out.println("Enter number to check , is prime or not : ");
            int val = sc.nextInt();
            System.out.println(cl.prime(val));
            System.out.println("Do you want to continue 'y/n'? ");
            ch = sc.next().charAt(0);
        }
    }

    public static void evenOdd(int num){
        if(num%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }

    int add(int a,int b){
        return a+b;
    }

    boolean prime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        }

        void swap(int a,int b){
        int t=a;
        a=b;
        b=t;
        }
    }
