package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Bid {
    private int loanAmount;
    private boolean withPledge;
    private int age;
    private int incomePerMonth;
    private boolean loansOverdue;
    private int workPeriodInMonths;
}

