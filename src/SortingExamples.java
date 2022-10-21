import java.util.Scanner;
import java.io.*;

class BubbleSort{
    int size;
    int arr[];
    Scanner sc = new Scanner(System.in);

    BubbleSort(){
        System.out.println("Inside Bubble Sort. Enter Size : ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
    }

//    void bubbleSort(){
//        System.out.println("Array before sorting : ");
//        for(int i=0;i<size;i++)
//            System.out.print(" " + arr[i]);
//        boolean swap;
//        int swapCount=0;
//        do{
//            swap=false;
//            for(int inner=0;inner<size-1;inner++){
//                if(arr[inner]>arr[inner+1]){        //(arr[inner]<arr[inner+1])
//                    int temp = arr[inner];
//                    arr[inner] = arr[inner+1];
//                    arr[inner+1] = temp;
//                    swap = true;
//                    swapCount++;
//                }
//            }
//            System.out.println("");
//            for(int i=0;i<size;i++)
//                System.out.print(" " + arr[i]);
//            }while(swap);
//
//        System.out.println("\n Count : " + swapCount);
//
//        System.out.println("\n Array after sorting : ");
//        for(int i=0;i<size;i++)
//            System.out.print(" " + arr[i]);
//    }

    void bubbleSort(){
        System.out.println("Array before sorting : ");
        for(int i=0;i<size;i++)
            System.out.print(" " + arr[i]);
        boolean swap;
        int swapCount=0;
        for(int outer=1;outer<=size;outer++){
//            swap=false;
            for(int inner=0;inner<size-outer;inner++){
                System.out.println("Comparing elements at index " + inner + "and " + (inner+1));
                if(arr[inner]>arr[inner+1]){        //(arr[inner]<arr[inner+1])
                    int temp = arr[inner];
                    arr[inner] = arr[inner+1];
                    arr[inner+1] = temp;
//                    swap = true;
                    swapCount++;
                }
            }
            System.out.println("");
            for(int i=0;i<size;i++)
                System.out.print(" " + arr[i]);
        }

        System.out.println("\n Count : " + swapCount);

        System.out.println("\n Array after sorting : ");
        for(int i=0;i<size;i++)
            System.out.print(" " + arr[i]);
    }
}

class selectionSort{
    int size;
    int arr[];
    Scanner sc = new Scanner(System.in);

    selectionSort(){
        //read size and elements for array
        System.out.println("Inside selection sort. Enter Array Size : ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
    }
    public void SelectionSort(){
        int minElemIndex;
        int minElement;
        boolean swap=false;
        for(int i=0;i<size-1;i++) {
//            minElement = arr[i];
            minElemIndex = i;
            int j = i + 1;
            while (j < size) {
                if (arr[minElemIndex]> arr[j]) {
//                    minElement = arr[j];
                    minElemIndex = j;
                    swap = true;
                }
                j++;
            }
            if(swap) {
                System.out.println("Swapping elements at index : " + i + "," + minElemIndex);
                int temp = arr[i];
                arr[i] = arr[minElemIndex];
                arr[minElemIndex] = temp;
                swap = false;
            }
        }

        System.out.println("Sorted Array is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}


class insertionSort{
    int size;
    int []arr;
    Scanner sc = new Scanner(System.in);
    insertionSort(){
        System.out.println("Provide Size of Array to be sorted : ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Provide Array Elements : ");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
    }
    public void InsertionSort(){
        int temp;
        int count=0;

        for(int i=1;i<size;i++){
//            logic one
//            int j=i-1;
//            temp =arr[i];
//            while(j>=0 && arr[j]>temp){
//                arr[j+1] = arr[j];
//                j--;
//                count++;
//            }
//            arr[j+1] = temp;
//            System.out.println(" ");
//            for(int k=0;k<size;k++){
//                System.out.print(arr[k] + " ");
//            }
//            System.out.println("Count: "+ count);

//            logic two
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
                count++;
            }
            System.out.println(" ");
            for(int l=0;l<size;l++){
                System.out.print(arr[l] + " ");
            }
            System.out.println("Count: "+ count);

        }
        System.out.println("Sorted Array is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}


class mergeSort{
    int n;
    int []arr;
    Scanner sc =new Scanner(System.in);

    mergeSort(){
        System.out.println("Provide Size of Array to be sorted : ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Provide Array Elements : ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
    }
    public void startMergeSort(){
        arr = MergeSort(arr,0,n-1);
        System.out.println("Sorted arry is : ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
    }

    public int[] MergeSort(int []arr,int start,int end){
        //if more than one element in arr then
        //divide
        //conquer - merge
        //while merging - merge with sorted order
        //O(log n)
        if(start<end){
            int mid = (start + end) / 2;
            MergeSort(arr,start,mid);
            MergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
        return arr;
    }
    // Space required : O(n)
    public void merge(int[] arr,int start,int mid,int end){
        int k=0;
        int i=start;
        int t[]=new int[arr.length];
        //compare elements from subarrays and copy smaller element to temporary result array
        // O(n)
        // complexity O(n log n)
        int rStart = mid+1;
//        1 2 4 5         1 4 8 9           t - 1 1 2 4 4 5 8 9
//        start = 4       rStart = 8    arr -  1 2 4 5 1 4 8 9
//            mid = 3        end = 7
        while(start<=mid && rStart<=end){
            if(arr[start]<=arr[rStart]){
                t[k++] = arr[start++];
//                start++;
            }else{
                t[k++] = arr[rStart++];
//                rStart++;
            }
        }
        while(start<=mid){
            t[k++] = arr[start++];
        }
        while(rStart<=end){
            t[k++] = arr[rStart++];
        }
        k=0;
        start=i;
        while(start<=end){
            arr[start++] =  t[k++];
        }
    }
}


class quickSort{
    int n;
    int []arr;
    Scanner sc =new Scanner(System.in);
    static int swapCount ;

    quickSort(){
        System.out.println("Provide Size of Array to be sorted : ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Provide Array Elements : ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
    }

    public void startQuickSort(){
        QuickSort(arr,0,n-1);
        System.out.println("Sorted arry is : ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
    }
    public void QuickSort(int []arr, int start, int end){
        if(start<end){
            int partitionIndex = partition(arr,start,end);
            QuickSort(arr,start,partitionIndex-1);
            QuickSort(arr,partitionIndex+1,end);
        }
    }

    public int partition(int []arr,int start,int end){
        int partitionIndex=start;
        int j;

        //find all smaller elements and swap with element pointed by partitionIndex
        int pivot = arr[end];
        for(j=start;j<end;j++){
            if(arr[j]<pivot){
                int temp = arr[j];
                arr[j] = arr[partitionIndex];
                arr[partitionIndex] = temp;
                partitionIndex++;
                swapCount++;
            }
        }

        //swap pivot element and element at partitionIndex
        arr[end] = arr[partitionIndex];
        arr[partitionIndex] = pivot;
        System.out.println("Number of swap in this iteration : " + (swapCount+1));
        return partitionIndex;
    }
}


class mergeArray{
    int m=3,n=4;
    int nums1[] = {1,3,4,0,0,0,0};
    int nums2[] = {1,2,5,6};

    public void mergeSortedArray() {
        int a1 = m - 1, a2 = n - 1;
        int tn = m + n - 1;

        while (a2 >= 0) {
            if (a1 >= 0 && nums1[a1] >= nums2[a2]) {
                nums1[tn--] = nums1[a1--];
            } else {
                nums1[tn--] = nums2[a2--];
            }
        }

        System.out.println("Sorted array is : ");
        tn=0;
        while(tn<nums1.length){
            System.out.print(" " + nums1[tn]);
            tn++;
        }

    }
}


public class SortingExamples {
    public static void main(String[] args) {
//        BubbleSort bs = new BubbleSort();
//        bs.bubbleSort();
//        selectionSort sSort = new selectionSort();
//        sSort.SelectionSort();
//        insertionSort isort = new insertionSort();
//        isort.InsertionSort();

//        mergeSort mSort = new mergeSort();
//        mSort.startMergeSort();
//
//        quickSort qSort = new quickSort();
//        qSort.startQuickSort();

        mergeArray ms = new mergeArray();
        ms.mergeSortedArray();

    }
}
