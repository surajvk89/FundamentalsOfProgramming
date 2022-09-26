import java.util.Scanner;

public class search {

    int linearSearch(int arr[],int element){
        //search linearly i.e.compare elements one by one
        //if found return index, else return -1
        for(int index=0;index<arr.length;index++){
            if(element == arr[index])
                return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n,element;
        search s = new search();
        //take input from user for array size
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size : " );
        n = sc.nextInt();
        //declare array of size n
        int arr[] = new int[n];

        //read array elements from user
        System.out.println("Enter Array elements : " );
        for(int index=0;index<n;index++){
//            System.out.println("Index : " + index + " Value : ");
            arr[index] = sc.nextInt();
        }


        //take user input for element to be searched
        System.out.println("Enter element to search : " );
        element = sc.nextInt();

        //call linear search method
        int result = s.linearSearch(arr,element);
        //check result and print appropriate message
        if(result == -1)
            System.out.println("Element not Found");
        else
            System.out.println("Element " + element + " Found at index : " + result);

    }
}

