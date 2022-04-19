public class Quiz1 {
    public static void main(String[] args) {
        //1에서 100까지의 수 중에서 3의 배수와 5의 베수의 합을 구하시오

        int hap = 0;

        for (int i = 1; i < 101; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                hap += i;
            }
            System.out.println(hap);
        }
    }
}
