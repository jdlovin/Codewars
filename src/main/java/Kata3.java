public class Kata3 {
    public static boolean smallEnough(int[] a, int limit) {
        boolean flag = true;
        for(int i : a){
            if(i <= limit ){
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
