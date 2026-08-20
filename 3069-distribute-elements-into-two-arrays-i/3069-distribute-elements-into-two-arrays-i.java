import java.util.ArrayList;

class Solution {
    public int[] resultArray(int[] nums) {

        if (nums.length <= 2) {
            return nums;
        }

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {

            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        int[] res = new int[nums.length];
        int index = 0;
        for (int i = 0; i < arr1.size(); i++) {
            res[index++] = arr1.get(i);
        }
        for (int i = 0; i < arr2.size(); i++) {
            res[index++] = arr2.get(i);
        }

        return res;
    }
}