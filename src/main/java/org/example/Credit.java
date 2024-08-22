package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Credit extends Handler {
    private final String BankName;

    @Override
    public void handle(Bid bid) {
        if (processBid(bid)) {
            System.out.println("Credit approved! -- Bank: " + BankName);
        } else {
            System.out.println("Credit rejected! -- Bank: " + BankName);
            super.handle(bid);
        }

    }

    private Boolean processBid(Bid bid) {
        if (bid.getLoanAmount() > 50001) {
            return (bid.getAge() >= 21) && (bid.getWorkPeriodInMonths() > 23) && (!bid.isLoansOverdue()) && clientFactor() && bid.getIncomePerMonth() > 9999;
        } else if (bid.getLoanAmount() > 10001) {
            return (bid.getAge() >= 18) && (bid.getWorkPeriodInMonths() > 10) && clientFactor() && bid.getIncomePerMonth() > 1000;
        } else if (bid.getLoanAmount() > 1001) {
            return bid.isWithPledge();
        } else {
            return clientFactor();
        }
    }


    private boolean clientFactor() {
        return Math.random() < 0.85;
    }
}
