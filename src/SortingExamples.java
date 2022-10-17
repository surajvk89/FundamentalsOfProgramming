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

    void bubbleSort(){
        System.out.println("Array before sorting : ");
        for(int i=0;i<size;i++)
            System.out.print(" " + arr[i]);
        boolean swap;
        int swapCount=0;
        do{
            swap=false;
            for(int inner=0;inner<size-1;inner++){
                if(arr[inner]>arr[inner+1]){        //(arr[inner]<arr[inner+1])
                    int temp = arr[inner];
                    arr[inner] = arr[inner+1];
                    arr[inner+1] = temp;
                    swap = true;
                    swapCount++;
                }
            }
            System.out.println("");
            for(int i=0;i<size;i++)
                System.out.print(" " + arr[i]);
            }while(swap);

        System.out.println("\n Count : " + swapCount);

        System.out.println("\n Array after sorting : ");
        for(int i=0;i<size;i++)
            System.out.print(" " + arr[i]);
    }

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


public class SortingExamples {
    public static void main(String[] args) {
//        BubbleSort bs = new BubbleSort();
//        bs.bubbleSort();
        selectionSort sSort = new selectionSort();
        sSort.SelectionSort();

    }

}



