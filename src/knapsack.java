//0-1 knapsack - select item complete or do not select
//W - max capacity : sum(wi)<=W
//objective - maximize profit / value


import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

class knapsackZeroOne{
    int getMax(int a,int b){
        return (a>b)?a:b;
    }
    public int getMaxValue(int []wt,int []val,int capacity,int n){
        int currVal=0;
        //case 1 - val obtained from n items : value of nth Item + max value from n-1 items
        //case 2 - excluding nth item : maxvalue from n-1 items
        if(n==0 || capacity==0)
            return currVal;
        else{
            if(wt[n-1]>capacity){
                System.out.println("Current capacity is : "+ capacity+". Discarding last item : " + wt[n-1]);
                currVal = getMaxValue(wt,val,capacity,n-1);
            }
            else
                currVal = getMax(getMaxValue(wt,val,capacity,n-1),val[n-1]+getMaxValue(wt,val,capacity-wt[n-1],n-1));
        }
        return currVal;
    }
}

class fractionalKnapsack{
    static class Items{
        int wt,val,ind;
        double ration;
        Items(int wt,int val,int ind){
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            ration = ((double)this.val/(double)this.wt);
        }
    }
    public double getMaxValue(int[] wt,int[] val,int capacity,int n){
        Items[] itemVal = new Items[n];
        for(int i=0;i<wt.length;i++){
            itemVal[i] = new Items(wt[i],val[i],i);
        }

        Arrays.sort(itemVal,new Comparator<Items>(){
            public int compare(Items i1,Items i2){
//                return (int)(i1.ration).compareTo((i2.ration));
                return (int) (i1.ration - i2.ration);
            }
        });

        double maxValue= 0;

        for(Items it:itemVal){
            int curWt,curVal;
            curWt = it.wt;
            curVal = it.val;
            //pick complete item if capacity is greater than current item weight
            if(capacity-curWt>=0){
                System.out.println("Item added with weight: " + curWt);
                maxValue+= curVal;
                capacity = capacity - curWt;
            }else{
                //pick fraction of item
                System.out.println("Item added with fractional weight: " + curWt);
                double fraction = (double)capacity/(double)curWt;
                maxValue = maxValue + (double) (curVal * fraction);
                capacity-= curWt*fraction;
                //as this will be last item picked , exit from function
                break;
            }
        }
        return maxValue;
    }
}


public class knapsack {
    public static void main(String[] args) {
        int wt[]={10,20,30,40};
        int val[]={50,100,150,200};
        int W=60;
        knapsackZeroOne kzo = new knapsackZeroOne();
        System.out.println("Using 0-1 knapsack solution , Maximum Value is : " + kzo.getMaxValue(wt,val,W,wt.length));
        fractionalKnapsack fknap = new fractionalKnapsack();
        System.out.println("Using fractional knapsack solution , Maximum Value is : " + fknap.getMaxValue(wt,val,W,wt.length));

    }
}
