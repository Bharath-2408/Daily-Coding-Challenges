class Solution {
    public String removeOuterParentheses(String s) {
        int open =0;
        int close =0;
        char op = '('; //open 
        char cp = ')'; //close 
        String temp = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == op)
            {
                open += 1;
            }
            if(s.charAt(i) == cp)
            {
                close += 1;
            }

            temp += s.charAt(i);

            if(open == close)
            {
                if(temp.length() > 2)
                {
                    temp = temp.substring(1);
                    temp = temp.substring(0,temp.length() - 1);
                    sb.append(temp);
                    temp = "";
                    open = 0;
                    close =0;

                }
                else
                {
                    temp = "";
                    open = 0;
                    close = 0;
                }
                 
            }
            
        }

        return sb.toString();
    }
}