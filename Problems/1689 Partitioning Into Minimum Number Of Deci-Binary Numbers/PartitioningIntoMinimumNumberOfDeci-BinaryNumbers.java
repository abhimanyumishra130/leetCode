//https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/

class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(char ch: n.toCharArray()) {
            max = Math.max(max, ch-'0');
        }
        return max;
    }
}
