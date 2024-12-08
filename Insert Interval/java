class Solution {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]> ans = new ArrayList();
        int i=0, len = intervals.length;
        while(i<len && intervals[i][1]<newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }
        
        while(i<len && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        ans.add(newInterval);
        while(i<len){
            ans.add(intervals[i]);
            i++;
        }
        
        return ans;
    }
}