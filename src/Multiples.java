public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 999; i >0; i--){
            boolean divisibleby3 = i % 3 ==0;
            boolean divisibleby5 = i % 5 ==0;

            if (divisibleby3 || divisibleby5) {
                count++;
            }

        }
        System.out.println(count);
    }
}
