//1. Check if rotating subarray can generate sorted array
//int a[]={6,7,8,1,2,4,5}; arr[n-1] arr[0] arr[1] arr[2] ... arr[n-2]
//        {1,2,4,6,5,7,8};
//        {5,6,8,2,4,1,3}
//            {2,4,1,3,5,6,8} - false

//already sorted array - true
//iterate through array till a[i]<a[i+1] , stop iterating wherever a[i]>a[i+1],
// from i+1 till end check if a[k]<a[k+1]
//k=i+1 to n-2, a[n-1]<a[0] - true


//2. Given a rotated array, search an element in rotated array
// O(n) , consition - O(log n),



import java.util.Scanner;

class sortedSearch{
    int arr[],n;
    Scanner sc = new Scanner(System.in);
    sortedSearch(){
        System.out.println("Enter array size : ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }

//    {7,8,9,0,1,2,3,4,5,6}     ele=0

    public int BinarySearch(int arr[],int start,int end,int ele){
        int mid;
        if(start>end)
            return -1;
            mid = (start+end)>>1;  //(start+end)/2;
            if(arr[mid]==ele)
                return mid;
            if(ele<arr[mid])
                return BinarySearch(arr,start,mid-1,ele);
            else if(ele>arr[mid])
                return BinarySearch(arr,mid+1,end,ele);
        return -1;

/*        while(start<end){
            mid = (start+end)>>1;  //(start+end)/2;
            if(arr[mid]==ele)
                return mid;
            if(ele>=arr[start] && ele<arr[mid])
                end= mid-1;
            else if(ele>arr[mid] && ele<=arr[end])
                start = mid+1;
        }
        return -1;*/

    }

    public int Binsearch(int ele){
        return BinarySearch(arr,0,n-1,ele);
    }
}




class SortedArrayExample{
    int arr[];
    int n;
    Scanner sc = new Scanner(System.in);
    SortedArrayExample(){
        System.out.println("Enter array size : ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }

    public boolean isPossible(){
        //check is array sorted, if yes return true
        int in=0,dec=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                in++;
            }
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                dec++;
            }
        }
        if(in == n-1 || dec == n-1){
            return true;
        }

        int i=1;
        while(arr[i-1]<arr[i]){
            i++;
        }
        boolean breakFlag = false;
        for(int k=i;k<n-1;k++){
            if(arr[k]>arr[k+1]){
                breakFlag = true;
                break;
            }
        }

        if(breakFlag)
            return false;

        if(arr[n-1]<=arr[0])
            return true;

        return false;
    }
}
public class sortedArray {
    public static void main(String[] args) {
//        SortedArrayExample saObj = new SortedArrayExample();
//        System.out.println("By rotating subarray, will it generate sorted array ? : " + saObj.isPossible());
        sortedSearch ss = new sortedSearch();
        System.out.println("Search result : " + ss.Binsearch(0));
    }
}
