class Solution {
    int countStrings(String s) {
        // code here
        Map<Character, Integer> freq = new HashMap();
        for(char ch: s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        int ans = 0;
        int len = s.length();
        boolean flag = false;
        for(char ch: s.toCharArray()){
            if(freq.get(ch) > 1){
                flag = true;
            }
            ans+=len - freq.get(ch);
        }
        ans/=2;
        ans+=flag ? 1 : 0;
        return ans;
    }
}