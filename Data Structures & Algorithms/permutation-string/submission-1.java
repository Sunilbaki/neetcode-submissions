class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []value =  new int[26];
        int []window =  new int[26];

        if(s1.length() > s2.length())
         return false;

        for(char ch: s1.toCharArray())
        {
            value[ch-'a']++;
        }

        for(int i=0;i<s1.length();i++)
        {
            window[s2.charAt(i)-'a']++;
        }


        
            if(match(value,window))
                return true;
            
        int l=0;
        for(int i=s1.length(); i< s2.length();i++)
        {
            window[s2.charAt(l)-'a']--;
            window[s2.charAt(i)-'a']++;
            l++;

            
            if(match(value,window))
                return true;
            
        }

        return false;
    }


    static boolean match(int []value, int []window)
    {
        for(int i=0;i<26;i++)
         {
            if(value[i]!=window[i])
            return false;
         }

         return true;
    }
}
