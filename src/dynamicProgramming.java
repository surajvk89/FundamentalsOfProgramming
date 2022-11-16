//1, 5, 10
//sum = 14

// 1*14 = 14
//10+1*4  = 5
//5*2+1*4 = 6

//min_number_coins = 5

import javax.swing.*;

public class dynamicProgramming {
    public int getCombinationCount(int []coins,int sum){
        int []ways = new int[sum+1];
        ways[0] = 1;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<ways.length;j++){
                if(coins[i]<=j){
                    ways[j] +=ways[j-coins[i]];
                }
            }
        }
        return ways[sum];
    }

    public void dynamicCoin(int[] coins, int amount){

        int[][] v = new int[amount+1][coins.length+1];
        //base condition
        for(int i=0;i<=coins.length;i++){
            v[0][i] = 0;
        }
        for(int i=0;i<=amount;i++){
            v[i][0] = i;
        }

        //fill rest of the table
        for(int j=1;j<=coins.length;j++){
            for(int i=1;i<=amount;i++){
                if(coins[j-1]<=i && v[i][j-1] > v[i-coins[j-1]][j]+1){
                    v[i][j] = v[i-coins[j-1]][j]+1;
                }else{
                    v[i][j] = v[i][j-1];
                }
            }
        }
        System.out.println("Number of coins required are : " + v[amount][coins.length]);

        //backtrack
        int i=amount;
        int j= coins.length;

        while(i>0 && j>0){
            if(v[i][j]==v[i][j-1]){
                j--;
            }else{
                System.out.println("Coin picked : " + coins[j-1]);
                i = i - coins[j-1];
            }
        }
        while(i>0){
            System.out.println("Coin picked : " + coins[0]);
            i--;
        }
    }

    public void coinsReq(int coins[],int amount){

        int[] coinsReq = new int[amount + 1];
        int amt, i, j;

        for (i = 0; i <= amount; i++) {
            coinsReq[i] = i;    }

        System.out.println("Coins required array values are : ");
        for (i = 0; i <= amount; i++) {
            System.out.print(" " +coinsReq[i]);
        }

        for (j = 1; j < coins.length; j++) {
            for (i = 1; i <= amount; i++) {
                if (i >= coins[j] && (coinsReq[i - coins[j]] + 1) < coinsReq[i])
                    coinsReq[i] = coinsReq[i - coins[j]] + 1;    }}

        System.out.println("Coins required: " + coinsReq[amount]);
    }

        public static void main(String[] args) {
        int coins[]= {1,2,5,10};
        dynamicProgramming dp = new dynamicProgramming();
        int amount = 14;
        System.out.println("For sum = 14, number of combinations are : "+ dp.getCombinationCount(coins,14));
            dp.dynamicCoin(coins,amount);
            dp.coinsReq(coins,amount);
    }
}