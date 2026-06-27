class Solution {
    public int characterReplacement(String s, int k) {
          int l=0;
          int max_frq=0;
          int ans=0;

          HashMap<Character, Integer> map = new HashMap<>();
          for(int r=0;r<s.length();r++)
          {
                char ch= s.charAt(r);
                map.put(ch, map.getOrDefault(ch,0)+1);
                max_frq= Math.max(max_frq, map.get(ch));

                while( (r-l+1)-max_frq>k)
                {
                    char lch=s.charAt(l);
                    map.put(lch,map.get(lch)-1);
                    l++;
                }

                ans= Math.max(ans,(r-l+1));
          }

          return ans;
    }
}
