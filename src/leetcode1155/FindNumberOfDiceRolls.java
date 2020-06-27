package leetcode1155;

public class FindNumberOfDiceRolls {
	// Dp solution
	// Time: O(d * target * f)
    public int numRollsToTarget(int d, int f, int target) {
    	// Need this to not overflow
    	// modulo 10^9 + 7
        int mod = (int)Math.pow(10, 9) + 7;
        
        int[][] dp = new int[d + 1][target + 1];
        
        // There is only 1 way to get target of 0
        dp[0][0] = 1;
        
        for(int i = 1; i <= d; i++){
            for(int j = 1; j <= target; j++){
            	// Dices with faces can not add to sum target
                if(j > i * f){
                    break;
                } else {
                	// ex: j - k is same as
                	// 1 + 6
                	// 2 + 5
                    for(int k = 1; k <= f && k <= j; k++){
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - k]) % mod;
                    }
                }
            }
        }
        
        return dp[d][target];
    }
}
