import java.util.Scanner;

abstract class Hinh {
    abstract double tinhDienTich();
    abstract double tinhChuVi();
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

        System.out.print("Chọn hình (1: Hình chữ nhật, 2: Hình tròn): ");
        int choice = scanner.nextInt();

        Hinh hinh;
        if (choice == 1) {
            System.out.print("Nhập chiều dài: ");
            double dai = scanner.nextDouble();
            System.out.print("Nhập chiều rộng: ");
            double rong = scanner.nextDouble();
            hinh = new HinhChuNhat(dai, rong);
        } else if (choice == 2) {
            System.out.print("Nhập bán kính: ");
            double banKinh = scanner.nextDouble();
            hinh = new HinhTron(banKinh);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }

        System.out.println("Diện tích: " + hinh.tinhDienTich());
        System.out.println("Chu vi: " + hinh.tinhChuVi());
    }
}