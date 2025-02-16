class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: arr){
            pq.add(i);
            if(pq.size()>k)
                pq.poll();
        }
        ArrayList<Integer> ans = new ArrayList();
        while(!pq.isEmpty()){
            ans.add(0, pq.poll());
        }
        return ans;
    }
}