package novi.backend;

public class Base {
    private String base1;
    private String base2;
    private String base3;

    //build base1 and return
    public String getBase1() {
        int i, j, f = 2;

        for (i = 1; i <= f; i++) {
            for (j = 1; j <= f; j++) {
                System.out.print("# # # # # # # # # ");
            }
            System.out.println();
        }
        return base1;
    }

    public void setBase1(String base1) {
        this.base1 = base1;
    }

    //build base2 and return
    public String getBase2() {
        int i, j, g = 3;

        for (i = 1; i <= g; i++) {
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
            System.out.println();
        }
        return base2;
    }

    public void setBase2(String base2) {
        this.base2 = base2;
    }

    public String getBase3() {
        System.out.println("       HAPPY BIRTHDAY!");
        return base3;
    }

    public void setBase3(String base3) {
        this.base3 = base3;
    }

}
