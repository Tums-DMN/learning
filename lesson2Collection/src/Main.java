import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit.\n" +
        "Maecenas porttitor congue massa.\n" +
        "Fusce posuere, magna sed pulvinar ultricies, purus lectus malesuada libero, sit amet commodo magna eros quis urna.\n" +
        "Nunc viverra imperdiet enim.\n";


    public static void main(String[] args)        {
        System.out.println("Текст:\n"+text);
        TextHandler work = new TextHandler(text);
        System.out.println("--------------------");
        work.counter();
        System.out.println("--------------------");
        work.sortWords();
        System.out.println("--------------------");
        work.repeatCounter();
        System.out.println("--------------------");
        work.reverse();
        System.out.println("--------------------");
        work.stringOrder();
    }
}
