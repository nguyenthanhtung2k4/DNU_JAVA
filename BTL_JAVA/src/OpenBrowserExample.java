import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenBrowserExample {
    public static void main(String[] args) throws URISyntaxException {
        try {
            // Kiem tra xem he  thong ton tai khong
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                // Kiểm tra xem Desktop có hỗ trợ duyệt web không
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    URI uri = new URI("https://www.google.com"); 
                    desktop.browse(uri); // Mở trang web
                }
            } else {
                System.out.println("Desktop  khong ho tro");
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
       

    }
}
