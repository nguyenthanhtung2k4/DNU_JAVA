package opp;

public class Naprut {
    public static void main(String[] args) {
        Tien tien = new Tien(1000000);

        tien.napTien(500000);
        tien.rutTien(200000);
    }
}

abstract class Nap {
    public abstract void napTien(double amount);
    public abstract void rutTien(double amount);
}

class Tien extends Nap {
    private double money; 

    public Tien(double initialMoney) {
        this.money = initialMoney;
    }

    @Override
    public void napTien(double amount) {
        if (amount > 0) {
            money += amount; 
            System.out.println("Nap tien thanh cong. So du hien tai: " + money);
        } else {
            System.out.println("So tien nap phai lon hon 0.");
        }
    }

    @Override
    public void rutTien(double amount) {
        if (amount > 0 && amount <= money) {
            money -= amount; 
            System.out.println("Rut tien thanh cong. So du hien tai: " + money);
        } else if (amount > money) {
            System.out.println("So tien rut khong du.");
        } else {
            System.out.println("So tien rut phai lon hon 0.");
        }
    }
}
