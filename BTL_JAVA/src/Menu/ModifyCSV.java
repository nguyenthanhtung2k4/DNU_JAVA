package Menu;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ModifyCSV {
    public ModifyCSV(){};
    public static List<String> lines = new ArrayList<>(); // Use descriptive variable name
    public static void readCSV(String path) {
        try {
            lines.clear();
            File file = new File(path);
            Scanner scanner = new Scanner(file);
             // Skip header line (assuming it exists)
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        }
    }
    public static void readDeleteCSV(String path, int Id) {
        try {
            lines.clear();
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (Integer.parseInt(parts[9])!= Id) {
                    lines.add(line);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        }
    }
    public static void CSV(int targetId,String plance) {
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] parts = line.split(",");
                try{
                    if (Integer.parseInt(parts[0]) == targetId) {
                        lines.set(i,plance);
                        break;
                    }
                }catch(Exception e){
                    if (Integer.parseInt(parts[9]) == targetId) {
                        lines.set(i,plance);
                        break;
                    }
                }
                // else{
                //     System.out.println("Khong tim thay");
                // }
            }
    }
    public static void writeCSV(String path,String fomat) {
            try {
                FileWriter writer = new FileWriter(path);
                writer.write(fomat+"\n");
                for (String line : lines) {
                    writer.write(line);
                    writer.write("\n");
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("Error writing to file - " + e.getMessage());
            }
    }
    public static void displayCSV(int targetId,String path,String fomat, String plance){
            readCSV(path);
            CSV(targetId,plance);
            writeCSV(path,fomat);
    }
    public static void displayCSVDelete(int targetId,String path,String fomat) {
            readDeleteCSV(path,targetId);
            // CSV(targetId,plance);
            writeCSV(path, fomat);
    }
    public class displayCSVDelete {}
    public class displayCSV {
    }
}