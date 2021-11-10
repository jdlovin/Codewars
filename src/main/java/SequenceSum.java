public class SequenceSum {
    public static String showSequence(int value){
        StringBuilder builder = new StringBuilder();
        int count = 0;
        if( value < 0) {
            for( int i = value; i < 0; i++){
                count += value;
                if( i < 0){
                    builder.append(i + "+");
                } else {
                    builder.append(i);
                    builder.append(" " + "=" + " " + count);
                }

            }
            } else if (value > 0) {
            for (int i = 0 ; i <= value; i++ ){
                count += i;
                if(i < value ){
                    builder.append(i + "+");
                } else {
                    builder.append(i);
                    builder.append(" " + "=" + " " + count);
                }
            }
        } else {
           builder.append(value + "=" + value);

        }
        return builder.toString();
    }
}
