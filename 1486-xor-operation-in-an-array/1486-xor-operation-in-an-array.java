class Solution {
    private int xorTillNum(int n){
        if(n%8 == 0 || n%8 == 1) return n;
        if(n%8 == 2 || n%8 == 3) return 2;
        if(n%8 == 4 || n%8 == 5) return n+2;
        if(n%8 == 6 || n%8 == 7) return 0;
        return -1;
    }


    public int xorOperation(int n, int start) {
        int tn = start + (n-1)*2; 
        return xorTillNum(tn) ^ xorTillNum(start -2 >= 0 ? start - 2 : 0 );
    }
}