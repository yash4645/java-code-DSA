public class recursionQ15 {
    // frog question :- find minimum cost to go from index 0 to last ,frog can jump one or two index only at a time
    // eg :- [20,10,40,30,50]...minimum cost is 20-40-50=30
    public static void main(String[] args) {
        int[] arr={20,10,20,30,40};
       int cost= minCostPath(arr,0);
       System.out.println(cost);
    }
    public static int minCostPath(int []a,int idx) {
        if(idx+1==a.length) return 0;
        int firstCost=Math.abs(a[idx]-a[idx+1])+minCostPath(a, idx+1);
        if(idx+2==a.length) return firstCost;
        int secondCost=Math.abs(a[idx]-a[idx+2])+minCostPath(a, idx+2);
       return Math.min(firstCost, secondCost); 
    }
}
