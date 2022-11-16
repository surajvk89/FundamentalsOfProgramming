public class dpProbelm {
    int dp[] = new int[1000];

    dpProbelm(){
        for(int i=0;i<dp.length;i++)
            dp[i]=-1;
    }
    public int bottomUp(int n){
        dp[0] =1;
        for(int i=1;i<=n;i++){
            dp[i] = dp[i-1] * i;
        }
        return dp[n];
    }


    public int topDown(int n){
        if(n==0 || n==1)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        return (dp[n]= topDown(n-1)*n);
    }

    public int fact(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
        dpProbelm dpobj = new dpProbelm();
        System.out.println(dpobj.fact(10));
        System.out.println(dpobj.fact(15)); //15*14*13*12*11*10!
        System.out.println(dpobj.bottomUp(10));
//        System.out.println(dpobj.bottomUp(12));
        System.out.println(dpobj.topDown(10));

    }
}
