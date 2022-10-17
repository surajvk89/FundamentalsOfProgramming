import java.util.*;


public class searchExample {

    //O(log n)
//    public static int binarySearch(int []arr,int key){
//        int low,high,mid;
//        low = 0;
//        high = arr.length-1;
//        while(low<=high){
//            mid = (low + high) / 2;
//            if(arr[mid]==key)
//                return mid;
//            else if(key<arr[mid])
//                high = mid - 1;
//            else
//                low = mid + 1;
//        }
//        return -1;
//    }

    public static int binarySearch(int []arr,int key,int low,int high){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]==key)
            return mid;
        if(key<arr[mid])
            return binarySearch(arr,key,low,mid-1);
        if(key>arr[mid])
            return binarySearch(arr,key,mid+1,high);
        return -1;
    }

    public static void main(String[] args) {
        int n;  //number of elements
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of Elements in array : ");
        n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements in array : ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter Element to be searched in array : ");
        int key = sc.nextInt();

        System.out.println("Result is :" + binarySearch(arr,key,0,n-1));

    }
}
