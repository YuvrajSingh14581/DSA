import java.util.*;

class Solution {
    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;

        // Comparator: compare by value, then by index
        Comparator<int[]> cmp = (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        };

        TreeSet<int[]> kMinimum = new TreeSet<>(cmp);
        TreeSet<int[]> remaining = new TreeSet<>(cmp);

        long sum = 0;   // sum of (k-1) smallest in window
        int i = 1;

        // Build first window [1 ... dist]
        while (i < n && i - dist < 1) {
            int[] cur = new int[]{nums[i], i};
            kMinimum.add(cur);
            sum += nums[i];

            if (kMinimum.size() > k - 1) {
                int[] largest = kMinimum.pollLast();
                sum -= largest[0];
                remaining.add(largest);
            }
            i++;
        }

        long result = Long.MAX_VALUE;

        // Sliding window
        while (i < n) {
            int[] cur = new int[]{nums[i], i};
            kMinimum.add(cur);
            sum += nums[i];

            if (kMinimum.size() > k - 1) {
                int[] largest = kMinimum.pollLast();
                sum -= largest[0];
                remaining.add(largest);
            }

            result = Math.min(result, sum);

            // Remove expired index (i - dist)
            int remIdx = i - dist;
            int[] toRemove = new int[]{nums[remIdx], remIdx};

            if (kMinimum.remove(toRemove)) {
                sum -= nums[remIdx];

                if (!remaining.isEmpty()) {
                    int[] promote = remaining.pollFirst();
                    kMinimum.add(promote);
                    sum += promote[0];
                }
            } else {
                remaining.remove(toRemove);
            }

            i++;
        }

        return nums[0] + result;
    }
}
