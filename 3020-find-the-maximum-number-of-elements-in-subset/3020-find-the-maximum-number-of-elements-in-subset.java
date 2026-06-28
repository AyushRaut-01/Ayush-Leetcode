class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> freq = new HashMap<>();

        for (int x : nums) {
            long v = x;
            freq.put(v, freq.getOrDefault(v, 0) + 1);
        }

        int ans = 1;

        // Handle 1 separately
        if (freq.containsKey(1L)) {
            int cnt = freq.get(1L);
            ans = Math.max(ans, cnt % 2 == 0 ? cnt - 1 : cnt);
        }

        for (long x : freq.keySet()) {
            if (x == 1) continue;

            long cur = x;
            int len = 0;

            while (freq.getOrDefault(cur, 0) >= 2) {
                len += 2;

                if (cur > (long) 1e9) break;
                cur = cur * cur;

                if (cur > (long) 1e18) break;
            }

            if (freq.getOrDefault(cur, 0) >= 1) {
                len++;
            } else {
                len--;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}