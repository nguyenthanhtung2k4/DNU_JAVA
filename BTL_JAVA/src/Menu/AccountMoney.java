package Menu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountMoney {
    private double money;
    private String name;
    private int id;
   
    private List<String> history= new ArrayList<>();

    public AccountMoney(String name, double initialMoney,int id) {
        this.name = name;
        this.money = initialMoney;
        this.id=id;
        this.history = new ArrayList<>();
        addHistory("AccountBank Login: " + initialMoney+"$");
    }
    public AccountMoney(String name, double initialMoney) {
        this.name = name;
        this.money = initialMoney;

        this.history = new ArrayList<>();
        addHistory("AccountBank Login: " + initialMoney+"$");
    }
    public AccountMoney(String name, double initialMoney,String time, int  id) {
        this.name = name;
        this.money = initialMoney;
        this.id=id;
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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public static void writeFile( String path,String write){
        try {
            FileWriter myWriter = new FileWriter(path, true);
            myWriter.write(write);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error: WriteFile");
        }
     }
    
}
