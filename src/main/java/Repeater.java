public class Repeater {
    public static String repeat(String string,long n){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < n; i++){
            builder.append(string);
        }
        return String.valueOf(builder);
    }
}
