import java.util.regex.Pattern;

public class Kata2 {
    public static String reverseLetter(final String str) {
        Pattern pattern = Pattern.compile("a-zA-Z");
       StringBuilder builder = new StringBuilder();
       char[] ch = str.toCharArray();
       for(int i = 0; i <= ch.length; i++ ){
       }
        return String.valueOf(builder.reverse());
    }
}
