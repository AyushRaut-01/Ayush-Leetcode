class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0;
        int one = 0;
        int len = Integer.MAX_VALUE;
        String ans = "";

        for (int j = 0; j < s.length(); j++) {

            if (s.charAt(j) == '1') {
                one++;
            }
            while (one >= k) {
                if (one == k) {
                    int currLen = j - i + 1;
                    String curr = s.substring(i, j + 1);

                    if (currLen < len || 
                        (currLen == len && curr.compareTo(ans) < 0)) {
                        len = currLen;
                        ans = curr;
                    }
                }

                if (s.charAt(i) == '1') {
                    one--;
                }

                i++;
            }
        }

        return ans;
    }
}