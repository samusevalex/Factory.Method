public class Main {
    public static void main(String[] args) {
        Window window;
        if (System.getProperty("os.name").equals("Windows 10")) {
            window = new LinuxWindow();
        }else {
            window = new HtmlWindow();
        }
        window.renderWindow();
    }
}
