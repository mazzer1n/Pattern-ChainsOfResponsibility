package org.example;

public class Main {
    public static void main(String[] args) {
        Handler handler = new Repeater();

        handler.bind(new Credit("TBank"))
                .bind(new Credit("AlphaBank"))
                .bind(new Credit("BetaBank"))
                .bind(new Credit("GammaBank"))
                .bind(handler);

        Bid bid = new Bid(100000, true, 18, 100, false, 34 );
        handler.handle(bid);
    }
}