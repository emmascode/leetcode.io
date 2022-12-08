import java.util.Arrays;

// Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, 
// each statue having an non-negative integer size. Since he likes to make things perfect, 
// he wants to arrange them from smallest to largest so that each statue will be bigger
//  than the previous one exactly by 1. He may need some additional statues to be able 
// to accomplish that. Help him figure out the minimum number of additional statues needed.

// Example

// For statues = [6, 2, 3, 8], the output should be
// solution(statues) = 3.

// Ratiorg needs statues of sizes 4, 5 and 7.

public class makeArrayConsecutive {
    public static int solution(int[] statues) {
        int count;
        Arrays.sort(statues);
        count = statues[statues.length -1] - statues[0] - (statues.length) + 1;
        return count;
    }
    public static void main(String[] args) {
        int[] statues = new int[] {6, 2,3, 8};
        System.out.println(solution(statues));
    }  
}