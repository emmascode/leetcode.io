class CommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        for(int i = 0; i < strs[0].length(); i++) {
            for (String str: strs) {
                if (i == str.length()) {
                    return res;
                }
                char a = strs[0].charAt(i);
                char b = str.charAt(i);
                if (b != a) {
                    return res;
                }
            }
            res += strs[0].substring(i, i+1);    
        }
        return res;       
    }
    public static void main(String[] args) {
        String[] string = new String[] {"flower","flow","flight"};
        System.out.println(CommonPrefix.longestCommonPrefix(string));
    }
}