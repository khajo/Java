package weekP2.Ex1.printer;

public class PrinterApplication {
    public static void main(String[] args) {


       Article article = new Article("New Austrian Coding School","New Austrian Coding School is a programming school " +
               "for everyone. We offer a nine-month training program to develop coding and software development skills" +
               ", free of charge. The program is designed for people living in or around Vienna who are currently unemployed and " +
               "want to work as developers in the near future.");
        Printer printer = new Printer();
        printer.print(article);
    }


}
