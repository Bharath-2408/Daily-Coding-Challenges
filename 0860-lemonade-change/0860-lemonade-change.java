 class Solution {
    public boolean lemonadeChange(int[] bills) {

        int twenty = 0;
        int five = 0;
        int ten = 0;

        for (int demo : bills) {

            if (demo == 5) {
                five++;
            }

            else if (demo == 10) {

                demo = demo - 5;

                if (demo / 5 <= five) {
                    five -= demo / 5;
                    ten++;
                } else {
                    return false;
                }
            }

            else {

                demo = demo - 5;   // 15 change needed

                if (ten >= 1 && five >= 1) {

                    demo = demo - 10;
                    ten--;

                    if (demo / 5 <= five) {
                        five -= demo / 5;
                        twenty++;
                    } else {
                        return false;
                    }
                }

                else if (demo / 5 <= five) {
                    five -= demo / 5;
                    twenty++;
                }

                else {
                    return false;
                }
            }
        }

        return true;
    }
}