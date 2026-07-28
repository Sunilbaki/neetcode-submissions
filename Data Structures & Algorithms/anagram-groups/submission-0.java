class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int n = strs.length;
        int[] visited = new int[n];

        List<List<String>> output = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (visited[i] == 1)
                continue;

            char[] ch1 = strs[i].toCharArray();
            Arrays.sort(ch1);

            List<String> list = new ArrayList<>();

            for (int j = i; j < n; j++) {

                if (visited[j] == 1)
                    continue;

                char[] ch2 = strs[j].toCharArray();

                if (ch1.length != ch2.length)
                    continue;

                Arrays.sort(ch2);

                if (Arrays.equals(ch1, ch2)) {
                    list.add(strs[j]);
                    visited[j] = 1;
                }
            }

            output.add(list);
        }

        return output;
    }
}