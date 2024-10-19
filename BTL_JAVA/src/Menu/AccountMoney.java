package Menu;

import java.util.ArrayList;
import java.util.List;

public class AccountMoney {
    private double money;
    private String name;
    private List<String> history= new ArrayList<>();

    public AccountMoney(String name, double initialMoney) {
        this.name = name;
        this.money = initialMoney;
        this.history = new ArrayList<>();
        addHistory("AccountBank Login: " + initialMoney+"$");
    }
    public AccountMoney(String name, double initialMoney,String time) {
        this.name = name;
        this.money = initialMoney;
        this.history = new ArrayList<>();
        addHistory("AccountBank Login: " + initialMoney+"$ |Now: "+time);
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
        System.out.println("History Bank" + name + ":");
        for (String h : history) {
            System.out.println(h);
        }
    }
    public void Clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
