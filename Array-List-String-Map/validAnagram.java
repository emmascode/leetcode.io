import java.util.Map;
import java.util.HashMap;

class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            Map<Character, Integer> mapOne = new HashMap<>();            
            for (int i = 0; i < s.length(); i++) {
                mapOne.put(s.charAt(i) , mapOne.getOrDefault(s.charAt(i) , 0) +1);
            } 
            Map<Character, Integer> mapTwo = new HashMap<>();
            for (int j = 0; j < t.length(); j++) {   
                mapTwo.put(t.charAt(j) , mapTwo.getOrDefault(t.charAt(j) , 0) +1);       
            }
            return (mapOne.equals(mapTwo));    
        }      
    }
    public void main(String[] args) {
        String s = "anagram";
        String  t = "nagaram";
        System.out.println(ValidAnagram.isAnagram(s, t));
    }
}