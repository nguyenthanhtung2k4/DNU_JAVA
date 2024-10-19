import java.util.ArrayList;
import java.util.List;

public class tk_Class_OPP_KiTuDaiDien_1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        printList(stringList);
        printList(integerList);
    }

    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }
}
