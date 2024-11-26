package Menu;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountMoney extends AccountBank {
    private double money;
    private String name;
    private int id;
   
    private List<String> history= new ArrayList<>();
    public AccountMoney(){};
    public AccountMoney(String name, int id) {
        super(name,id);
    }
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
    private  static int  dem=0;
    public void showHistory() {
        System.out.println("History Bank" + name + ":");
        for (String h : history) {
            dem++;
            System.out.println(h);
        }
    }
    public void showHistory2(){
        if (dem>10){
            System.out.println("So luong thay doi: "+dem);
            System.out.println("Tat ca cac giao dich:\n");
            System.out.println("Giao dich nhieu\n");
            showHistory();
            System.out.println("Ben tren 10 giao dich noi bat");
        }if(dem==0){
            System.out.println("Bao cao tai chinh chua co du lieu");
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
