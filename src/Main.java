import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Day1
        System.out.println("Hello world!");

//      Day2
        System.out.println("Name : ABC " + " Subject1 : 85 , Subject2 : 90 , Percentage: ");
        int subject1Marks, subject2Marks;
        subject1Marks = 85;
        subject2Marks = 90;
        double percentage = ((subject1Marks + subject2Marks) / 200) * 100;
        System.out.println("Percentage : " + percentage);
        // division : 10/20 = 0.5 = 0 * 100

//        datatype variable_name ;
//        variable_name = value;
//        datatype variable_name = value;


        double sum = 0;
//        sum = sum + bill1 + bill2 + bill3 +....+billn;
        System.out.println(sum);
        double distance = 0;

        distance = distance + 10; // = 10

        distance = 15; // = 15

        System.out.print("A");
        System.out.println("B");
        System.out.println("B");
//        System.out.println("My name is " + FirstName + LastName + " My Contact number is " + contact);
        long spaceDist;

        double a = 2.0;
        double b = 7.0;
        System.out.println("Division is :" + (b / a));
        System.out.println("MOD is :" + (b % a));

        Scanner input = new Scanner(System.in); // file or String

//        a = input.nextDouble();

//        Day 3
        int varInt = 10;
//        int varInt;
        varInt = 12;


        varInt = varInt + 5;
        varInt = 25;
        varInt = varInt + subject1Marks;


//        newDataTyep var = (newDataType) existing variable;
        double avg = (double) varInt;
        long longVar = (long) varInt;
        char ch = 'A';
        int ascii = (int) ch;

        System.out.println(ascii);

        percentage = ((double) subject1Marks + (double) subject2Marks) / 2;
        System.out.println("Percentage " + percentage);

//        String - collection of char - ""
//        char - single alphabet - ''
        ch = 'a';
        ch = '9';
        ch = '&';

        String string = "This is string variable";
        String firstName = "Fundamentals";
        String lastName = "of Programming";

        System.out.println(firstName + " " + lastName);
        String fullname = firstName + " " + lastName;
        System.out.println(fullname);


        int rollNumber[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        String fName = "Suraj";
        String fName[] = {"first", "Second", "third", "fourth"};
        String lName[] = {};
        long contact[] = {};

//        declare array
//        datatype array_Name[] = new datatype[size];
//        datatype array_name[];

        float maxTemp[] = new float[31];
        float minTemp[];
        minTemp = new float[31];

        maxTemp[5] = 23.8f;
        minTemp[5] = 12.4f;
//        size = n, last index = n-1
        maxTemp[30] = 25.1f;
        System.out.println(rollNumber[7]);
        System.out.println(rollNumber);

        if (a > b) { // true if a is greater, else false
            System.out.println("A is greater than B");
        }
//        Relational operators
//        a>b
//        x<y
//        e>=f
//        p<=q;
//        h==i;
//        k!=j;

//        AND &&
//                OR ||
//                NOT !;
//
//        primeSub or bill > 250 - waive off delivery charges
//        bill > 2000 and UPI = discount 5 %
//                freeTimeUsed - 0 or 1
//        if (!freeTimeUsed) =!0 = 1 {
//            allowAccess = true;
//            freeAccessTime = 10 min;
//
//        }
//        if (!failed) {
//
//        }

//        Day4 --         Comments , Errors and Debugging
        // single line comment
        /*
        multiline
        comment
        in
        java
         */

        a=10;
        double total;
        total = (double) a;
        float fval = (float) a;
        System.out.println(total + " " + fval);

        String string1 = "Hello ";
        String string2 = "World !";
        System.out.println(string1 + " " + string2);
        String concString = string1+" "+string2;
        System.out.println(concString);
//        ````````````0,1,2,3,4
        int[]marks = {1,2,3,4,5};
//        System.out.println(marks[5]);
//        System.out.println(10/0);








    }
}