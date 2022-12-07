class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String letters = s.replaceAll("[^A-Za-z0-9]", "");
        String lowerCase = letters.toLowerCase();
        int i = 0;
        int j = lowerCase.length() - 1;
        while (i <= j) 
        {
            if(lowerCase.charAt(i) != lowerCase.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(ValidPalindrome.isPalindrome(s));
        String x =  "race a car";
        System.out.println(ValidPalindrome.isPalindrome(x));
    }
}