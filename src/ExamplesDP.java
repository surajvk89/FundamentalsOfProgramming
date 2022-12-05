

import java.util.ArrayList;
import java.util.LinkedList;

public class ExamplesDP {
    //Given array arr[], minimum(max+min) for subarray

//arr[] ={10,20,40,32,60,54,31}
//        find - max , min
//        max+min - minimum
//        10,20 - 30
//10,20,40 - 50
//20,40,32 - 60
//32,60,54,31 - 91
//ans -
//30


    //1. generate all subarrays : find min(max+min)
//2. travel in array with subarray of size 2 only
    public static int findMinSum(int arr[]){
        int min=Integer.MAX_VALUE;

        //brute force - O(n^2)
        /*int maxN,minN;
        for(int i=0;i+1<arr.length;i++){
            min=Integer.MAX_VALUE;
            minN=arr[i];
            maxN=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(maxN<arr[j])
                    maxN=arr[j];
                if(minN>arr[j])
                    minN=arr[j];
                if((maxN+minN)<min)//min=30,max+min=70
                    min = maxN+minN;
            }
        }
        return min;*/


        //optimized solution O(n)
//        int arr[]={10,20,30,45,58,69,25,4};
        min = arr[0] + arr[1]; //30
        for(int i=1;i+1<arr.length;i++){
            if(min > (arr[i]+arr[i+1]))   //30>50
                min = arr[i]+arr[i+1];
        }
        return min;
    }

    //given arr[] and k
    //find closet product pair
    //arr[]= {2,5,8,3,7,10,9,4} , k=42
//    8
//    12 <-> 8
//    16 <-> 12
//    20 <-> 16
//    28 - 20  2,14
//    24 - 28 no 4,6
//    32 - 28 4,8
//    40 - 32 4,10

//    arr is not sorted = O(n^2) - pair with each next element
    // sort , 42 / 2 = 21, left-right
    //already sorted, left - right,


    public static void closePair(int arr[],int k){
        int diff,lInd=0,rInd=0;
        int l,r;
        diff=Integer.MAX_VALUE;
        l=0;
        r=arr.length-1;

        while(l<r){
            if(Math.abs((arr[l]*arr[r])-k)<=diff){
                diff= Math.abs((arr[l]*arr[r])-k);
                lInd = l;
                rInd = r;
            }
            if((arr[l]*arr[r]) < k)
                l++;
            else
                r--;
        }
        System.out.println("Closest product pair is : " + arr[lInd] + "," + arr[rInd] + " and Product is: " + (arr[lInd]*arr[rInd]));
    }


    //longest increasing subsequence
//    int arr[]={2,4,6,7,9,10,12,21};
//    2,4,6,7 - subArray
//    2,6,9,21 - subsequence
//    2,4,6,7,10,21
//
//    {5,8,2,4,9,10,43,23,27,30}
//    5,8,9,10,43 - 1
//    5,8,9,10,23,27,30 - 2
//lis(i) = 1 + max(lis(j)) j<i , j=0 to i-1
//    i = 5
//    5,8,9
//    2,4,9
//    arr[i]>arr[j]
//    currMax = 4    3  2 3 2

    static int maxLen;
    static int currMax;

    static int LIS(int arr[],int n){
        //for each single element, LIS is 1. If array size is 1, LIS is 1
        if(n==1){
         return 1;
        }
        int ans;
        currMax = 1;
        for(int i=1;i<n;i++){
            ans = LIS(arr,i);
            if((arr[i-1]<arr[n-1]) && (ans+1 > currMax)){
                currMax = 1 + ans;
            }
        }

        if(maxLen < currMax)
            maxLen = currMax;
        return currMax;
    }
    public static int findLis(int arr[],int n){
        maxLen =1;

        maxLen = LIS(arr,n);

        return maxLen;
    }

//Dynamic programming
    //arr[] ={2,4,5,7,9,11};
    //LIS[n] = {1,1,1,1,1,1};
    //start with second element
//    LIS[i] = 1 + max(LIS[j],LIS[j-1],LIS[j-2],...,LIS[0]) , arr[i] > arr[j]

    static public int findLIS(int arr[],int n){
    int LIS[] = new int[n];
    for(int i=0;i<n;i++)
        LIS[i] = 1;

    for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            if((arr[i]>arr[j]) && ((1+LIS[j])>LIS[i]))
                LIS[i] = 1 + LIS[j];
        }
    }
    int longS=0;
    for(int i=0;i<n;i++){
        if(longS<LIS[i])
            longS= LIS[i];
    }
    return longS;
    }

//triangle sum of array
//0 //          48
//1 //        20 28
//2 = n-3//      8  12  16
//3 = n-2//    3   5   7   9
//4 = n-1//  1  2  3   4    5


    public static void triangleSum(int arr[]){
        int n=arr.length;
        if(n==1) {
            System.out.println("Array size is 1, Triangle sum is : " + arr[0]);
            return;
        }
        int sumArr[][] = new int[n][n];

        //copy elements from given array in solution/answer matrix
        for(int i=0;i<n;i++)
            sumArr[n-1][i] = arr[i];

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                sumArr[i][j] = sumArr[i+1][j] + sumArr[i+1][j+1];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(sumArr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Triangle sum is : " + sumArr[0][0]);
    }


    //given array
    //  1 2 3 4 5
    //   3 5 7 9
    //    8 2 6
    //     0 8
    //      8
//       sum%10

    static void modSum(int arr[]){
        int n = arr.length;
        if(n==1){
            System.out.println("Array is of length 1, Mod sum is : " + arr[0]);
            return;
        }
        int sumArr[][] = new int[n][n];
        int i,j;
        for(i=0;i<n;i++){
            sumArr[0][i] = arr[i];
        }

        for(i=1;i<n;i++){
            for(j=0;j<n-i;j++){
                sumArr[i][j] = (sumArr[i-1][j] + sumArr[i-1][j+1])%10;
            }
        }
        System.out.println("Mod Sum is : " + sumArr[n-1][0]);
    }


    // given an array = {8,4,6,2,1,0,5,3}, containing numbers [0,n], find missing number
    // O(n)
    static int missingNumber(int []arr){
        int ind=0;
        //O(n^2)
//        for(int i=0;i<=arr.length;i++){
//            boolean found=false;
//            for(int j=0;j<arr.length;j++){
//                if(i==arr[j]){
//                    found=true;
//                    break;
//                }
//            }
//            if(!found){
//                System.out.println("missing number is : " + i);
//                ind=i;
//            }
//             }
//        return ind;
        int n=arr.length;
        int sum= (n * (n+1))/2;
        int eleSum=0;
        for(int e:arr){
            //eleSum+=e;
            sum-=e;
        }

//        return sum-eleSum;
        return sum;
    }

//    {0,1,2,3,5,6,7}
//    [0,1,2,3,4,5,6]
    static int missingInSortedArr(int []arr){
        int num=0,i=0;
        //linear search
//        while(i<arr.length){
//            if(i!=arr[i]) {
//                return i;
//            }
//            i++;
//        }
//        return i;


        //xor
        // 2^1^2 = 1
        while(i<arr.length){
            num = num ^ i ^ arr[i];
            i++;
        }
        return num^i;
    }

    //sqrt(n) - O(log n)
    static int sqrtN(int n){
        long left=0,right=n;
        while(left<right){
            long mid = left +((long)right-left+1)/2;
            if((mid*mid)<=(long)n){
                left = mid;
            }else{
                right = mid-1;
            }
        }
        return (int)left;
    }

    // Given an array = [] , number = n,
    //find first and last occurence of number n
//    {2,4,5,7,7,7,7,7,8}
//    n = 7
//    first = 4
//    last = 7
//    O(log n)

    //try


    // arrayList and LinkedList
    // add arraylist to Linkedlist

    static void appendArraylist(){
        ArrayList<Integer> aList = new ArrayList<>();
        LinkedList<Integer> llist = new LinkedList<>();

        aList.add(7);
        aList.add(8);
        aList.add(9);
        aList.add(10);

        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);

        for(Integer i:aList){
            llist.add(i);
        }
        System.out.println(llist);
    }




    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,6,7};
        
//        System.out.println("Minimum (max+min) is : " + findMinSum(arr));
//        System.out.println("Closest product pair solution for given array : " );
//        closePair(arr,42);

//        System.out.println("Longest Increasing subsequence is of length : " + findLIS(arr,arr.length));

//        System.out.println(" Finding triangle sum for given array :");
//        triangleSum(arr);

//        System.out.println(" MOd sum for given array :");
//        modSum(arr);

//        System.out.println(missingNumber(arr));
//        System.out.println(missingInSortedArr(arr));

//        int x=30;
//        System.out.println(" Square root of " + x + " is : " + sqrtN(x));

        appendArraylist();
    }
}




