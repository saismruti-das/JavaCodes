import java.util.*;
class knapsack{
    static int[][] t;  //global table
    static int sack(int wt[], int val[], int W, int n){
        
        //memoization

        //base case
        if(n==0 || W==0)
        return 0;

        if (t[n][W] != -1)
        return t[n][W];

        //choice
        if (wt[n-1] <= W)
        return t[n][W] = Math.max(val[n-1] + sack(wt, val, W-wt[n-1], n-1), sack(wt, val, W, n-1));
        
        else
        return t[n][W] = sack(wt, val, W, n-1);
    }
    public static void main(String[] args){
        int wt[]={1,2,3,5};
        int val[]={1,3,5,7};
        int W=7;
        int n=wt.length;
        t=new int[n+1][W+1];
        
        //creating memoization table
        for (int[] row:t)
            Arrays.fill(row,-1);

        int profit= sack(wt, val, W, n);
        System.out.println("Max Profit="+profit);
    }
}