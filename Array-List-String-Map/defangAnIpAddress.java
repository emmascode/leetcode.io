class defangAnIpAddress {
    public static String defangIPaddr(String address) {
        String newString = "";
        String dotString = "[.]";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                newString += dotString;
            } else {
                newString += address.charAt(i);
            }
        }
        return newString;
    }
    public static void main(String[] args) {
        String add = "255.100.50.0";
        System.out.println(defangAnIpAddress.defangIPaddr(add));
    }
}

