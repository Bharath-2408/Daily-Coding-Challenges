class Solution {
    public int mirrorDistance(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.reverse();
        int number = Integer.parseInt(sb.toString());
        return Math.abs(number-n);
    }


}