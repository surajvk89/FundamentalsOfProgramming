//create list of positive and negative numbers
import java.util.ArrayList;
import java.util.Scanner;

class posNeg{
    int a[];
    int n;
    ArrayList<Integer> listA = new ArrayList<>();
    ArrayList<Integer> listB = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    posNeg(){
    //initialize variables
        n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sc.close();
    }
    //1. compare with zero
    //2. 2 = binary (0010) 0 - positive , 1 - negative , use XOR

    public void printList(){
        //compare with zero
        for(int i=0;i<n;i++){
            if(a[i]<0){
                listA.add(a[i]);
            }else{
                listB.add(a[i]);
            }
        }
        //without comparing with zero
        ArrayList<Integer> listC = new ArrayList<>();
        ArrayList<Integer> listD = new ArrayList<>();

        listC.add(a[0]);
        int t=listC.get(0);
        for(int i=1;i<n;i++){
            if((t^a[i])<0)
                listD.add(a[i]);
            else
                listC.add(a[i]);
        }

        System.out.println("List of Positive and Negative numbers are : ");
        for(Integer itr:listA){
            System.out.print(" " + itr);
        }
        System.out.println(" ");
        for(Integer itr:listB){
            System.out.print(" " + itr);
        }
        System.out.println(" ");


        for(Integer itr:listC){
            System.out.print(" " + itr);
        }
        System.out.println(" ");
        for(Integer itr:listD){
            System.out.print(" " + itr);
        }
        System.out.println(" ");


//          perform XOR of two numbers
    }
}

//a[] = {1,2,3,4}
//find sum of product of all possible subsets
//{1},{2},{3},{4},{1,2},{2,3},{3,4},{1,3},{1,4},{2,4},{1,2,3},{1,2,4},{2,3,4},{1,3,4},{1,2,3,4}
//1,2,3,4,2,6,12,3,4,8,6,8,24,12,24
//sum of all above product values
//119


//{1,2} = {1},{2},{1,2} = 1,2,2 = 5
//        {1,2,3} = {1},{2},{3},{1,2},{1,3},{2,3},{1,2,3} = 1,2,3,2,3,6,6 = 23
//
//a,b
//a+b+ab = a+b(1+a)+1-1 = b(1+a)+1(a+1) -1 = (1+a)*(1+b)-1 = 2*3-1 = 5
//
//
//a,b,c
//a+b+c+ab+ac+bc+abc = 1*(1+a)*(1+b)*(1+c)*(1+d)*(1+e)-1 =

class sumProduct{
    int n;
    int a[];
    Scanner sc = new Scanner(System.in);

    sumProduct(){
        n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }

    public void SumOfProd(){
        int prod = 1;
        for(int i=0;i<n;i++){
            prod*= (a[i] + 1);
        }
        prod = prod -1;
        System.out.println("Sum of product of all subsets is : " + prod);
    }

}


//sum of product of subsets with size 'k'




//product of sum of subsets
//1,2 = 1,{2},{1,2} = 1,2,3=6
//a*b*(a+b)
//
//1,2,3 = {1},{2},{3},{1,2},{2,3},{1,3},{1,2,3}=1,2,3,3,5,4,6 =
//        a*b*c*(a+b)*(b+c)*(a+c)*(a+b+c)


//minimize (max-min) for triplet
public class listExamples {
    static int a[]={1,2,4,6};
    static int b[]={2,4,5,8};
    static int c[]={2,4,8,9};

    static int max(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }
    static int min(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }
    static void triplet(){
        //if array is not sorted, sort array in non decreasing order
        //Array.sort(a);
        //Array.sort(b);
        //Array.sort(c);

        int n= a.length;
        int i=0,j=0,k=0;
        int resMax=0,resMin=0,resMid=0,sum=0;
        int diff=Integer.MAX_VALUE;

        while(i<n && j<n && k<n){
            sum=0;
            int maxN = max(a[i],b[j],c[k]);
            int minN = min(a[i],b[j],c[k]);
            sum = a[i]+ b[j]+ c[k];
//            System.out.println(sum);

            if(diff > (maxN - minN)) {
                diff = maxN - minN;
                resMax = maxN;
                resMin = minN;
                resMid = sum -(maxN + minN);
            }


            if(minN == a[i])
                i++;
            else if(minN==b[j])
                j++;
            else
                k++;
        }
//        System.out.println("Sum of triplet is : " + sum);
        System.out.println("Triplet  is : " + resMax + "," + resMid + "," + resMin );
    }


    public static void main(String[] args) {
//        triplet();
//        posNeg pnObj = new posNeg();
//        pnObj.printList();
        sumProduct spobj = new sumProduct();
        spobj.SumOfProd();

    }
}
