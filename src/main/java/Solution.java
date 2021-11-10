import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Solution {
    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

}
