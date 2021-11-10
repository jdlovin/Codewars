import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MixedSum {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        int total = 0;
        for(Object i : mixed) {
            total += Integer.parseInt(i.toString());
        }
        return total;
    }
}
