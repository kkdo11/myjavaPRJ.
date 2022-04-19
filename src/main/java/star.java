public class star {
    public static void main(String[] args) {
        //별 찍기
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 10; i++) {
            for (int c = 0; c < 10 - i; c++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }



    }
}
