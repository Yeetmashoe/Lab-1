public class Reduce {
    public static void main(String[] args) {
        int count = 1;
        int start = 100;

        while (start > 1){
            if(start % 2 == 0){
                start = start / 2;
            } else {
                start = start - 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
