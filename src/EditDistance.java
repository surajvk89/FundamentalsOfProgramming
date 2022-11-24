public class EditDistance {
    public int minVal(int a, int b, int c){
        if(a<=b && a<=c)
            return a;
        if(b<=a && b<=c)
            return b;
        return c;
    }

    public int minCost(String s1,String s2){
        int m= s1.length();
        int n= s2.length();

        int costMat[][]=new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            costMat[i][0]=i;
        }
        for(int i=1;i<=n;i++){
            costMat[0][i] =i;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                int cost = (s1.charAt(i-1)==s2.charAt(j-1)?0:1);
                costMat[i][j] = minVal(1+costMat[i-1][j],1+costMat[i][j-1],cost + costMat[i-1][j-1]);
            }
        }
        return costMat[m][n];
    }


    public static void main(String[] args) {

        String str1="abc";
        String str2="abdjkl";
        EditDistance edObj = new EditDistance();
        System.out.println("Cost is: " + edObj.minCost(str1,str2));


    }
}
