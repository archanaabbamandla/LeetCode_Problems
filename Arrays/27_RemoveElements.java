class Solution {
    public int removeElement(int[] num, int val) {

        // k keeps track of the position where the next valid element should be placed
        int k = 0;

        // Loop through each element in the array
        for (int i = 0; i < num.length; i++) {

            // Check if the current element is NOT equal to the value to remove
            if (num[i] != val) {

                // Copy the valid element to index k
                num[k] = num[i];

                // Move k to the next position
                k++;
            }
        }

        // Return the number of elements remaining after removing val
        return k;
    }
}

