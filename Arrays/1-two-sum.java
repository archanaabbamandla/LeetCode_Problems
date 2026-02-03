class Solution {
    public int[] twoSum(int[] num, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            int need = target - num[i];

            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }

            map.put(num[i], i);
        }

        return new int[] {}; // guaranteed 1 solution exist
    }
}
