package org.example;

public class Repeater extends Handler {
    private Bid bid;

    @Override
    public void handle(Bid bid) {
        if (this.bid == bid) {
            System.out.println("Отказано всеми банками, делаем запрос по другим кредитным программам");
            changeProgram(bid);
        } else {
            this.bid = bid;
        }
        super.handle(bid);
    }

    private void changeProgram(Bid bid) {
        if (bid.getLoanAmount() > 50001) bid.setLoanAmount(50000);
        if (bid.getLoanAmount() > 10001) bid.setLoanAmount(10000);
        if (bid.getLoanAmount() > 1001) bid.setLoanAmount(1000);
    }
}
