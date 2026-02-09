class Solution {
    public boolean rotateString(String s, String goal) {
        //check length
        if (s.length() != goal.length()) {
            return false;
        }

        //  Check rotation
        String doubled = s + s;
        return doubled.contains(goal);
    }
}

