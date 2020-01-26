public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit.\n" +
        "Maecenas porttitor congue massa.\n" +
        "Fusce posuere, magna sed pulvinar ultricies, purus lectus malesuada libero, sit amet commodo magna eros quis urna.\n" +
        "Nunc viverra imperdiet enim.\n";


    public static void main(String[] args)        {
        System.out.println("Текст:\n"+text+"\n");
        TextHandler work = new TextHandler(text);
        work.counter();
        work.sortWords();
        work.repeatCounter();
        work.reverse();
        work.stringOrder();
    }
}
