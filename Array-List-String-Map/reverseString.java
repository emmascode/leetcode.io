// Write a program to reverse a string 
// Input: Hello 
// Output: olleH


class ReverseString {
    public static String reverseString(String string) {
        String result = "";
        char ch;
        for (int i = 0; i < string.length(); i ++) {
            ch = string.charAt(i);
            result = ch + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(ReverseString.reverseString(string));
    }
}