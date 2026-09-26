class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        String str = words[0];
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        for (int j = 1; j < words.length; j++) {
            String s = words[j];
            ArrayList<Character> temp = new ArrayList<>();
            for (int k = 0; k < s.length(); k++) {
                if (list.contains(s.charAt(k))) {
                    temp.add(s.charAt(k));
                    list.remove(Character.valueOf(s.charAt(k)));
                }
            }
            list = temp;
        }
        for (char c : list) {
            ans.add(String.valueOf(c));
        }
        return ans;
    }
}