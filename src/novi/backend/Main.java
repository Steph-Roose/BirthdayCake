package novi.backend;

public class Main {

    public static void main(String[] args) {
        //candles
        Candles candleFire = new Candles();
        candleFire.buildCandles();

        //candle base
        Candles candleBase = new Candles();
        candleBase.getCandleBase();

        //cake
        Base cake1 = new Base();
        cake1.getCake1();

        Base cakeFilling = new Base();
        cakeFilling.makeFillingCake();

        cake1.getCake1();

        Base cake2 = new Base();
        cake2.getBase3();
    }
}
