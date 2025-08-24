class knapsack{

    static int sack(int wt[], int val[], int W, int n){
        
        //recursive
        //base case
        if(n==0 || W==0)
        return 0;

        //choice
        if (wt[n-1] <= W)
        return Math.max(val[n-1] + sack(wt, val, W-wt[n-1], n-1), sack(wt, val, W, n-1));
        
        else
        return sack(wt, val, W, n-1);
    }
    public static void main(String[] args){
        int wt[]={1,2,3,5};
        int val[]={1,3,5,7};
        int W=7;
        int profit= sack(wt, val, W, wt.length);
        System.out.println("Max Profit="+profit);
    }
}