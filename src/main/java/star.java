public class star {
    public static void main(String[] args) {
        //별 찍기
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" * ");

            }
            System.out.println();
        }


    }
}
