import java.util.*;
class Solution {
    public int count(String word1, String word2) {
        int count = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                count++;
            } 
        }
        return count;
    }

    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < dictionary.length; j++) {
                if (count(queries[i], dictionary[j]) <= 2) {
                    result.add(queries[i]);
                    break;
                } 
            }
        }
        return result;
    }
}      