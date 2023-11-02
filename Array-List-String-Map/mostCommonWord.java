import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> wordAndCount = new HashMap<String, Integer>();
        Set<String> bansSet = new HashSet<>(Arrays.asList(banned));

        //[!?,';] is the possible punctuations for this input, can also use '\\pP' instead for all of the punctuations.
        String[] words = paragraph.replaceAll("[!?',;.]"," ").toLowerCase().split("\\s+");
      
        int max = 0;
        String res = "";

        for(String word:words){
            word = word.toLowerCase();
            if(bansSet.contains(word)) continue;
        // use getOrDefault - Java8 new default function from Map interface
            wordAndCount.put(word, wordAndCount.getOrDefault(word, 0) + 1);
            int count = wordAndCount.get(word);
            if( count > max) {
                max = count;
                res = word;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        String para = "a, a, a, a, b,b,b,c, c";
        String[] banned = new String[] {"a"};
        System.out.println(MostCommonWord.mostCommonWord(para, banned));
    }
}