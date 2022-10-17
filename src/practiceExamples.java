import java.util.ArrayList;
import java.util.Scanner;


//find standard deviation and variance
//find mean, stdDev = sum(element-mean)^2 / n, var = sqrt(stdDev)
class stdVar{
    Scanner sc = new Scanner(System.in);
   int n;
   double mean;
   double stdDev;
   double variance;
   double arr[];

   stdVar(){
       System.out.println("Enter array size : ");
       n = sc.nextInt();
       arr = new double[n];
   }

   public void stdDevVar(){
       System.out.println("Enter array elements : ");
       for(int i=0;i<n;i++)
           arr[i] = sc.nextDouble();
       System.out.println("Calculating arithmetic mean: ");
       int sum=0;
       for(int i=0;i<n;i++){
           sum+= arr[i];
       }
       mean = sum / n;
       System.out.println("Arithmetic mean is : " + mean);

       System.out.println("Calculating Variance : ");
       sum =0;
       for(int i=0;i<n;i++){
           sum+= (arr[i]-mean) * (arr[i]-mean);
       }
       variance = (double) sum / (double) n;
       System.out.println("Variance is : " + variance);

       System.out.println("Calculating Standard deviation: ");
       stdDev = Math.sqrt(variance);
       System.out.println("Standard deviation is : " + stdDev);
    }
}

//prime numbers till n
//prime : number divisible by 1 and number itself
class primeNum{
    int n;
    Scanner sc = new Scanner(System.in);
    primeNum(){
        System.out.println("Enter number : ");
        n = sc.nextInt();
    }

    public boolean isPrime(int n){
        if(n<=1)
            return false;
        if(n<=3)
            return true;

        if((n%2 == 0) || (n%3 == 0))
            return false;

//        for(int j=2;j<n;j++){
//            if(n%j == 0)
//                return false;
//        }

        for(int i=5; i<=Math.sqrt(n);i+=6){
            if((n%i == 0) || (n%(i+2) == 0))
                return false;
        }
        return true;
     }
    public void checkPrime(){
        for(int k=2;k<=n;k++){
            if(isPrime(k))
                System.out.print(k +" ");
        }
    }

}


// last non zero digit of factorial 5!=4*3*1 = 12 = 2
//5 * 2 = 10
//120 = %10 -> 0
//120 / 10 -> 12 % 10 -> 2

//1 to 9
//n! - D(n)
//second last digit of n - odd
//D(n) = 4 * D(floor(n/5)) * D(unit digit of n)
//second last digit of n - even
//D(n) = 6 * D(floor(n/5)) * D(unit digit of n)
//1- 1, 2- 2, 3-6, 4-4, 5- 2, 6-2, .....
//n = 33
//= 4 * D(floor(33/5)) * D(3)
//= 4 * D(6) * D(3) = 4 * 2 * 6 = 48 -> 8

//n/10
//234/10 = 23 % 10 = 3


class factNDig{
    static int nzdig[] = {1,1,2,6,4,2,2,4,2,8};

    static int lastNZDig(int n){
        if(n<10)
            return nzdig[n];
        if((((n/10)%10))%2 == 0)
            return (6 * lastNZDig(n/5) * nzdig[n%10]) % 10;
        else
            return (4 * lastNZDig(n/5) * nzdig[n%10]) % 10;
    }
}


//            1
//        1       1
//    1       2        1
//1       3       3          1
//
//nCr
//
//n - number of rows
//n! / (n-r)! r!
//
//r - 0 to n-1(including)
//
//0C0
//1C0 1C1
//2C0 2C1 2C2

class pascalTriangle{
    static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        return n * factorial(n-1);
    }

    static void pascalTri(int rows){
        for(int n=0;n<=rows;n++){
//            print space
            for(int j=0;j<rows-n;j++){
                System.out.print(" ");
            }
//            print numbers on row
            for(int r=0;r<=n;r++){
                System.out.print(" " + factorial(n) / (factorial(n-r) * factorial(r)));
            }
            System.out.println("");
        }
    }
}

// p1 - x1  s1
// p2 - x2  s2
//x1>x2
//s1>s2
//
//x2>x1
//s2>s1
//
//x1 greater x2
//if(x1<x2)  swap(x) swap(s)
//x1>x2 s2>s1
//x2>x1 s1>s2
//while(x1>=x2)
//    if(x1==x2)
//        true
//    x1= x1+s1;
//    x2=x2+s2;
//
//    return false

class personMeet{

    boolean isPalindrome(String str){
        if(str.length()==0 || str.length()==1)
            return true;
        if(str.charAt(0) != str.charAt(str.length()-1))
            return false;
        else
            return isPalindrome(str.substring(1,str.length()-1));
    }

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static boolean checkMeet(int x1,int s1, int x2, int s2){
        if(x1>x2 && s1>s2)
            return false;
        if(x2>x1 && s2>s1)
            return false;

        //change x1 so x1 is greater number
        if(x1<x2){
            swap(x1,x2);
            swap(s1,s2);
        }
        //x1 is greater
        while(x1>=x2){
            if(x1==x2)
                return true;
            x1= x1+s1;
            x2= x2+s2;
        }

//        if(x2>x1)
//            return true;
        return false;
    }
}


interface A{
     public default void printStm(){
        System.out.println("Method of A interface");
    }
}

interface B{
    public default void printStm(){
         System.out.println("Method of B interface");
    }
}

public class practiceExamples implements A,B{

//    public static int searchL(int[] arr, int key){
//        for(int i=0;i<10;i++){
//            if(arr[i]==key)
//                return i;
//        }
//        return -1;
//    }

    public void printStm(){
        A.super.printStm();
        B.super.printStm();
    }

    public static void main(String[] args) {
//        stdVar stdObj = new stdVar();
//        stdObj.stdDevVar();

//        primeNum primeObj = new primeNum();
//        primeObj.checkPrime();

//        factNDig factNObj = new factNDig();
//        System.out.println(factNObj.lastNZDig(11));

//    pascalTriangle ptObj = new pascalTriangle();
//    ptObj.pascalTri(5);

//        personMeet pmObj = new personMeet();
//        System.out.println(pmObj.checkMeet(00,10,4,5));
//        System.out.println(pmObj.isPalindrome("MAM"));
//
//        int[] arr = new int[100];
//
//        for(int i=0;i<10;i++){
//            arr[i] = 10 - i;
//        }
//
//        System.out.println(searchL(arr,8));
        practiceExamples peobj = new practiceExamples();
        peobj.printStm();
    }
}




//  for(;;){
//     for(;;){
//
//            }
//        }
//
//      for(;;){
//          n
//      }
//      for(;;){
//          m
//      }

//      O(n)   >    O(n^2)   >   O(n^3)
//        O(n^3)<O(n^2)<O(n)




//countString(int n, int lastBit){
//    if(n==0)
//        return 0;
//   if(n==1)
//      return (lastBit==1)?1:2;
//    if(lastBit==0)
//        return countString(n-1,0) + countString(n-1,1);
//    else
//        return countString(n-1,0);
//        }

//        main(){
//    n=sc.nextInt();
//    countString(n,0);
//        }


//fib(0) = 0
//fib(1) = 1
//
//fib(n) = fib(n-1) + fib(n-2)
//n = 2 to infinite
//
//method(int n){
//    method(n-1);
//        method(n+1);
//        }
//
//        n! = n * n-1 * n-2 * n-3 * n-4 ... * 2 * 1
//0 = 1
//n*fact(n-1)
//O(n)
//O(n)
//
//factorial = 1;
//for(int i=1;i<=n;i++){
//    factorial = factorial * i;
//        }
//O(n)
//O(1)
//
//
//int fibbo(int n){
//    if(n<2)
//        return n;
//    else
//        return fibbo(n-1)+fibbo(n-2);
//        }
//
//int fibbo(int n){
//    int [] fib =  new int[n+1];
//    fib[0] = 0;
//    fib[1] = 1;
//    if(n<2)
//        return n;
//    else
//        for(int i=2;i<=n;i++){
//            fib[i] = fib[i-1] + fib[i-2];
//        }
//        return fib[n];
//        }



//divide or multiply loop variable by some constant - O(log n)
//for(int i=0;i<n;i=i*3)
//        {}
//for(int i=n;i>=0;i=i/3){
//        }
//
//exponential increase or decrease - O(log log n)
//for(int i=0;i<n;i=pow(i,c)){
//        }
//for(int i=n;i>0;i=root(i))


