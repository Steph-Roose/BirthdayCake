package novi.backend;

public class Candles {
    //build candles and return
    public void buildCandles() {
        int i, c=2;

        for (i = 1; i <= c; i++) {
            buildTopCandleFire(i, c);
            buildTopCandleFire(i, c);
            buildTopCandleFire(i, c);
            System.out.println();
        }

        //build BottomCandleFire
        for (i = 1; i <= c; i++) {
            buildBottomCandleFire(i, c);
            buildBottomCandleFire(i, c);
            buildBottomCandleFire(i, c);
            System.out.println();
        }
    }

    private void buildBottomCandleFire(int i, int c) {
        int j;
        for (j = 1; j <= i; j++) {
            System.out.print("   ");
        }
        for (j = i; j <= c-1; j++) {
            System.out.print("*  ");
        }
        for (j = i; j <= c; j++) {
            System.out.print("*  ");
        }
        for (j = 1; j <= i-1; j++) {
            System.out.print("   ");
        }
    }

    private void buildTopCandleFire(int i, int c) {
        int j;
        for (j = i; j <= c; j++) {
            System.out.print("   ");
        }
        for (j = 1; j <= i-1; j++) {
            System.out.print("~  ");
        }
        for (j = 1; j <= i; j++) {
            System.out.print("~  ");
        }
        for (j = i; j <= c-1; j++) {
            System.out.print("   ");
        }
    }

    //build candleBase and return
    public void getCandleBase() {
        int i, j, d=3;

        for (i = 1; i <= d; i++) {
            for (j = 1; j <= d; j++) {
                System.out.print("    ! ! !   ");
            }
            System.out.println();
        }
    }
}