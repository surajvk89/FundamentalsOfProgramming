//For given arr[] = {1,4,3,7,6,9,10,14,17,20};
//and k = 7;
//find count subarrays - {1},{4},{3},{6},{1,4},...
//count++


import java.util.ArrayList;
import java.util.Scanner;

class subArray{
    int k,n;
    int arr[];
    int count;
    Scanner sc = new Scanner(System.in);
    subArray(){
        System.out.println("Number of elements in array : ");
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Value of K : ");
        k = sc.nextInt();
        count=0;
    }

//    arr[] = {1,4,3,7,6,9,10,14,17,20};
//   sum  i       j      sum+arr[j]         k         count
//    0   0       0       1                   7       1
//    1   0       1       5                   7       2
//    5   0       2       8
//        1
//    0   1       1       4                   7       3
//    4   1       2       7                   7
//        2
//    0   2       2       3                   7       4
//    3   2       3       10
//        3
//    0   3       3       7
//        4
//    0   4       4       6                   7       5
//


    public void countArrays(){
     for(int i=0;i<n;i++){
         int sum=0;
         for(int j=i;j<n;j++){
             if(sum+arr[j]<k){
                 sum = sum + arr[j];
                 count++;
             }else{
                 break;
             }
         }
     }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
     System.out.println("\n Number of sub-arrays with sum less than k : " + count);
    }


    public void slidingCountArray(){
        count=0;
        int start=0,end=0,currSum=arr[0];
        while(start<n && end<n){
            if(currSum<k){
                end++;
                if(end>=start)
                    count=count+(end-start);
                if(end<n)
                    currSum = currSum + arr[end];
            }else{
                currSum-=arr[start];
                start++;
            }
        }
        System.out.println("Count is : " + count);
    }

}


//given 2D array
//print elements in spiral form

//1 2 3 4
//5 6 7 8
//9 1 2 3
//
//1 2 3 4 8 3 2 1 9 5 6 7

class spiralArray{
    int arr[][];
    int n,m;
    Scanner sc = new Scanner(System.in);
    spiralArray(){
        System.out.println("Number of rows and columns in array : ");
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        System.out.println(" Enter array elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void VisitSpiral(){
        ArrayList<Integer> arrList = new ArrayList<>();
        if(arr.length == 0){
            System.out.println("Empty Array.");
        }else{
            boolean visited[][] = new boolean[n][m];
            int rd[] = {0,1,0,-1};
            int cd[] = {1,0,-1,0};
            int dir = 0;

            int r=0,c=0;
            for(int i=0;i<n*m;i++){
                arrList.add(arr[r][c]);
                visited[r][c] = true;

                int nr = r + rd[dir];
                int nc = c + cd[dir];

                if(0<=nr && nr<n && 0<=nc && nc<m && !visited[nr][nc] ){
                    r = nr;
                    c = nc;
                }else{
                    dir = (dir + 1 ) % 4;
                    r = r + rd[dir];
                    c = c + cd[dir];
                }
            }
            for(Integer i:arrList){
                System.out.print(i + " ");
            }
        }
    }
}



public class arrayExamples {
    public static void main(String[] args) {

        subArray sa = new subArray();
        sa.countArrays();
        sa.slidingCountArray();

//        spiralArray sa = new spiralArray();
//        sa.VisitSpiral();
    }
}
