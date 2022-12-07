class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i >= 0; i--){
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newArr = new int[n+1];
        newArr[0] = 1;
        return newArr;
    }
    public static void main(String[] args) {
        int[] digits = new int[] {4,3,2,1};
        System.out.println(PlusOne.plusOne(digits));
    }
}