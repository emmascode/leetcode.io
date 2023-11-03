import java.util.List;
import java.util.ArrayList;

class Solution {
    public boolean checkString(String s) {
       // iterate through the string s as long as the character is 'a'
        char[] ch = s.toCharArray();
        int len = s.length();
        int i = 0;
        while (i < len && ch[i] == 'a') {
            i++;
        }
       // iterate through the remainder of string s, if there is any a, return false, else return true
        while (i < len) {
            if (ch[i] == 'a') {
                return false;
            }
            i++;
        }
        return true;
    }
}