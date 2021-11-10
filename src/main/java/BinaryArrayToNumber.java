import java.util.Collections;
import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder builder = new StringBuilder();
        for(int i : binary) {
            builder.append(i);
        }

        int number = Integer.parseInt(String.valueOf(builder),2);


        return number;
    }
}
