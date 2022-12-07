class LengthOfLastWord {
    public static int length(String s) {
        String[] str = s.split(" ");
        if(str.length == 0){
            return 0;
        }
        return str[str.length -1].length();
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(LengthOfLastWord.length(s));
    }
}