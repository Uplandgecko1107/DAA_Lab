class Solution {
   public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length];
        return minCostTickets(days, costs, 0, dp);
    }
    
    public static int minCostTickets(int[] days, int[] costs, int day, int[] dp){
        if(day >= days.length) return 0;
      
        if(dp[day] != 0) return dp[day];
         int i;
        
        
        int buyOneDay =  minCostTickets(days, costs, day + 1, dp) + costs[0];

       
        for(i = day; i < days.length; i++)
            if(days[i] >= days[day] + 7) break;
        int buySevenDays = minCostTickets(days, costs, i, dp) + costs[1];
        
        
        for(i = day; i < days.length; i++)
            if(days[i] >= days[day] + 30) break;
        int buyThirtyDays = minCostTickets(days, costs, i, dp) + costs[2];
        
        
        int result = Math.min(Math.min(buyOneDay, buySevenDays), buyThirtyDays);
        dp[day] = result;
        return result;
        
    }
}
