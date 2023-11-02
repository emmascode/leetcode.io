// Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
// Note:
//     The length of both num1 and num2 is < 5100.
//     Both num1 and num2 contains only digits 0-9.
//     Both num1 and num2 does not contain any leading zero.
//     You must not use any built-in BigInteger library or convert the inputs to integer directly.

class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder str=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int sum=carry; //initially sum is equal to carry for that unit place
            if(i>=0) sum+=num1.charAt(i--) - '0'; //this converts to ASCII for comparision
            if(j>=0) sum+=num2.charAt(j--) - '0'; //subtracting '0' "converts" it to it's digit value
            str.append(sum%10);
            carry=sum/10;
        }
        if(carry>0){
            str.append(carry);
        }
        return str.reverse().toString(); //we reverse the string since the final sum is in reverse order
    }

    public static void main(String[] args) {
        String string1 = "11", string2 = "123";
        System.out.println(AddStrings.addStrings(string1, string2));
    }
}