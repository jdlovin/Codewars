import java.util.Arrays;

public class Solution2 {
    static int stray(int[] numbers) {
        int value = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++){
                if(numbers[i] != numbers[j]) {
                    value = i;
                }
            }
        }

        return value;
    }
}
