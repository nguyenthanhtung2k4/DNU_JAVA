import java.util.ArrayList;
import java.util.List;

public class tk_Class_OPP_KiTuDaiDien_3{
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);
        printNumbers(numberList);
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void printNumbers(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }
}
