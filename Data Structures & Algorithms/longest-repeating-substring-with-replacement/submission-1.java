class Solution {
    public int characterReplacement(String s, int k) {
       HashMap<Character,Integer> map = new HashMap<>();

       int maxf= 0;

       int left = 0;
       int ans = 0;

       for(int r = 0; r<s.length(); r++)
       {
          map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
          maxf = Math.max(maxf, map.get(s.charAt(r)));

          while((r-left+1)-maxf > k)
          {
             map.put(s.charAt(left), map.get(s.charAt(left))-1);
             left++;
          }

          ans = Math.max(ans, (r-left+1));
       }

       return ans;
    }
}
