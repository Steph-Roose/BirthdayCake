package novi.backend;

public class Base {
    //build base1 and return
    public void getCake1() {
        int i, j, f = 2;

        for (i = 1; i <= f; i++) {
            for (j = 1; j <= f; j++) {
                System.out.print("# # # # # # # # # ");
            }
            System.out.println();
        }
    }


    //make filling cake and return
    public void makeFillingCake() {
        int i, g = 3;

        for (i = 1; i <= g; i++) {
            fillingCake(i, g);
            fillingCake(i, g);
            System.out.println();
        }
    }

    private void fillingCake(int i, int g) {
        int j;
        for (j = 1; j <= g; j++) {
            for (j = 1; j <= g; j++) {
                if (i == j || i + j == g + 1)
                    System.out.print(" @ ");
                else
                    System.out.print(" x ");
            }
        }
        for (j = 1; j <= g; j++) {
            for (j = 1; j <= g; j++) {
                if (i == j || i + j == g + 1)
                    System.out.print(" @ ");
                else
                    System.out.print(" x ");
            }
        }
    }


    public void getBase3() {
        System.out.println("       HAPPY BIRTHDAY!");
    }
}