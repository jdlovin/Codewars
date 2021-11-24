public class XO {
    public static boolean getXO (String str) {
        boolean flag = false;
        char[] ch = str.toCharArray();
        int countO = 0;
        int countX = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'o'){
                countO++;
            } else if(ch[i] == 'x'){
                countX++;
            } else if(ch[i] == 'X'){
                countX++;
            } else if(ch[i] == 'O'){
                countO++;
            }
        }
        if(countO == countX){
            flag = true;
        }

        return flag;
    }
}
