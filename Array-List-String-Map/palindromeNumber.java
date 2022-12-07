import java.util.List;
import java.util.ArrayList;

class Palindrome {
    public static boolean isPalindrome(Integer x) {
        if (x < 0) {
            return false;
        } else {
            List<Integer> lst = new ArrayList<>();
            Integer a;
            Integer b;
            while (x > 0) {
                a = x / 10;
                b = x % 10;
                lst.add(b);
                x = a;
            }
            for (int i = 0; i < lst.size(); i++) {
                if (lst.get(i) != lst.get(lst.size() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    } 
    public static void main(String[] args) {
        Integer x = -121;
        System.out.println(Palindrome.isPalindrome(x));
    }
}
