class Solution {
    public String multiply(String num1, String num2) {


        if(num1.equals("0") || num2.equals("0"))
         return "0";

        
        int n = num1.length();
        int m = num2.length();

        int []ans = new int[n+m];

        for(int i = n-1; i>=0; i--)
        {
            for(int j = m-1; j>=0; j--)
            {
                int val = (num1.charAt(i)-'0') * ( num2.charAt(j)-'0');

                int p1 = i + j + 1;
                int p2 = i + j;

                val = val + ans[p1];
                ans[p1] = val % 10;
                ans[p2] += val / 10;
            }
        }


        StringBuilder  st = new StringBuilder();
        for(int val : ans)
        {
            if(st.length() == 0 && val ==0)
             continue; 
            
            st.append(val);
        }

        return st.toString();
    }
}
