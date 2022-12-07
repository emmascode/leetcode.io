import java.util.*;

class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();     // For storing result       
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] character = str.toCharArray();
            Arrays.sort(character); 
            String sortedString = new String(character);
            
            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            // Now Putting the string into the list that we just created in if-condition
            map.get(sortedString).add(str);     
        }
        result.addAll(map.values());
        return result;
    }

    public static void main(String[] args) {
        String[] string1 = new String[] {"eat","tea","tan","ate","nat","bat"};
        // String[] string2 = new String[] {""};
        // String[] string3 = new String[] {"a"};
        System.out.println(GroupAnagrams.groupAnagrams(string1));
        // System.out.println(Solution.groupAnagrams(string2));
        // System.out.println(Solution.groupAnagrams(string3));
    }
} 



