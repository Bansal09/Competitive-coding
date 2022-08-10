class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int sign = 1;
        boolean signSeen = false;
        boolean digitSeen = false;
        
        for (char ch: s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                digitSeen = true;
                if (ans > Integer.MAX_VALUE/10 || 
                    ans == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10)
                    return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                
                ans = ans * 10 + digit;
            }
            else if (ch == '-' || ch == '+') {
                if (digitSeen)
                    break;
                
                if (signSeen)
                    return 0;
                
                sign = ch == '-' ? -1 : 1;
                signSeen = true;
            }
            else if (ch == ' ') {
                if (signSeen || digitSeen)
                    break;
                ans = ans;
            }
            else
                break;
        }
        
        return sign * ans;
    }
}