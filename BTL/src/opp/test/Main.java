package opp.test;

import java.util.ArrayList;
import java.util.List;


class AccountMoney {
    private double money;
    private String name;
    private List<String> history;

    public AccountMoney(String name, double initialMoney) {
        this.name = name;
        this.money = initialMoney;
        this.history = new ArrayList<>();
        addHistory("Account created with initial balance: " + initialMoney);
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void addHistory(String action) {
        history.add(action);
    }

    public void showHistory() {
        System.out.println("Transaction History for " + name + ":");
        for (String h : history) {
            System.out.println(h);
        }
    }
}


class CreditCard extends AccountMoney {
    private double creditLimit;
    private double debt;

    public CreditCard(String name, double initialMoney, double creditLimit) {
        super(name, initialMoney);
        this.creditLimit = creditLimit;
        this.debt = 0;
        addHistory("Credit Card created with limit: " + creditLimit);
    }

    public void payDebt(double amount) {
        if (amount > 0 && amount <= debt) {
            debt -= amount;
            addHistory("Paid debt: " + amount + ". Remaining debt: " + debt);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    public void useCard(double amount) {
        if (amount > 0 && (debt + amount) <= creditLimit) {
            debt += amount;
            addHistory("Used card for: " + amount + ". Current debt: " + debt);
        } else {
            System.out.println("Insufficient credit limit.");
        }
    }

    public void checkCreditLimit() {
        System.out.println("Credit Limit: " + creditLimit + ", Current Debt: " + debt);
        addHistory("Checked credit limit and debt.");
    }
}

public class Main {
    public static void main(String[] args) {
        CreditCard card = new CreditCard("John Doe", 5000, 2000);
        card.useCard(1000);  
        card.checkCreditLimit();  
        card.payDebt(500);  
        card.showHistory(); 
    }
}
