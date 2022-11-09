//1, 5, 10
//sum = 14

// 1*14 = 14
//10+1*4  = 5
//5*2+1*4 = 6

//min_number_coins = 5

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
    public static void main(String[] args) {
        int coins[]= {1,2,5,10};
        dynamicProgramming dp = new dynamicProgramming();
        System.out.println("For sum = 14, number of combinations are : "+ dp.getCombinationCount(coins,14));
    }
}


