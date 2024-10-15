import java.util.Scanner;

abstract class Hinh {
    abstract double tinhDienTich();
    abstract double tinhChuVi();
}
class HinhVuong extends Hinh{
    double dai;
    public HinhVuong(double dai){
        this.dai = dai;
    }
    @Override
    double tinhDienTich() {
        return dai * dai;
    }
    @Override
    double tinhChuVi() {
        return 4 * dai;
    }
}
class HinhChuNhat extends Hinh {
    private double dai, rong;

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    double tinhDienTich() {
        return dai * rong;
    }

    @Override
    double tinhChuVi() {
        return 2 * (dai + rong);
    }
}

class HinhTron extends Hinh {
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
}

public class tk_Class_OPP_TruuTuong{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("hinh (1: Hcn , 2: h tron ,3 vuong): ");
        int choice = scanner.nextInt();

        Hinh hinh;
        if (choice == 1) {
            System.out.print("dai: ");
            double dai = scanner.nextDouble();
            System.out.print("rong  ");
            double rong = scanner.nextDouble();
            hinh = new HinhChuNhat(dai, rong);
        } else if (choice == 2) {
            System.out.print("ban kinh");
            double banKinh = scanner.nextDouble();
            hinh = new HinhTron(banKinh);
        }else if (choice == 3) {
            System.out.print(" canh : ");
            double canh = scanner.nextDouble();
            hinh = new HinhVuong(canh);
        } else {
            System.out.println("khong hop le !");
            return;
        }

        System.out.println("S = " + hinh.tinhDienTich());
        System.out.println("C= " + hinh.tinhChuVi());
    }
}