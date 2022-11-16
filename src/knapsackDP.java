class dpKnapsack{
    int val[]={12,10,21,15};
    int weight[]={2,1,3,2};

    int n=4;
    public int profit(int W){
        int matrix[][] = new int[n+1][W+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                if(weight[i-1]<=j && (val[i-1] + matrix[i-1][j-weight[i-1]]) > matrix[i-1][j]){
                    matrix[i][j] = val[i-1] + matrix[i-1][j-weight[i-1]];
//                    matrix[i][j] = Math.max(matrix[i-1][j], val[i] + matrix[i-1][j-weight[i]]);
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }

        System.out.println("Backtracking -- ");
        int i=n,j=W;
        while(i>0 && j>0){
            if(matrix[i][j]==matrix[i-1][j])
                i--;
            else
            {
                System.out.println("Item selected , item number :" + i + "Weight is : " + weight[i-1]);
                i--;
                j = j-weight[i];
            }
        }

        return matrix[n][W];
    }
}


public class knapsackDP {
    public static void main(String[] args) {
        dpKnapsack dpkobj = new dpKnapsack();
        System.out.println(dpkobj.profit(8));
    }
}
