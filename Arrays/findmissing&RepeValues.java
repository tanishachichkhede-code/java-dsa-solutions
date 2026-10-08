class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n*n;

        long actualSum =0;
        long actualSquareSum =0;

        for(int i=0 ;i<n;i++){
            for(int j=0;j<n;j++){
                int num =  grid[i][j];
                actualSum+=num;
                actualSquareSum+=(long)num*num;                
            }
        }
        long expectedSum = N*(N+1)/2;
        long expectedSquareSum = (long)N*(N+1)*(2L*N+1)/6;

        long Diff = actualSum-expectedSum;
        long squareDiff = actualSquareSum-expectedSquareSum;

        long sum = squareDiff/Diff;

        long repeated = (Diff+sum)/2;
        long missing = (sum - Diff)/2;

        return new int[]{
            (int)repeated,
            (int)missing        
        };
    }
}