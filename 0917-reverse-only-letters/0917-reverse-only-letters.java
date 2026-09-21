class Solution {
    public String reverseOnlyLetters(String s) {
        char[] demo = s.toCharArray();
        int l = 0;
        int r = demo.length - 1;
        
        while (l < r) {
            if (!Character.isLetter(demo[l])) {
                l++;
            } else if (!Character.isLetter(demo[r])) {
                r--; 
            } else {
                char temp = demo[l];
                demo[l] = demo[r];
                demo[r] = temp;
                l++;
                r--;
            }
        }
        return new String(demo);
    }
}