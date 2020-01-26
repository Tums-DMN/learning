import java.util.*;

public class TextHandler {
    private List<String> words = new ArrayList<>();
    private List<String> strings = new ArrayList<>();
    private Set<String> uniqWords;

    TextHandler(String str){
        Collections.addAll(words,str.trim().split("[\\W]+"));
        Collections.addAll(strings,str.split("\n"));
            }
    public void counter (){
        uniqWords = new HashSet<>(words);
        System.out.println("В тексте " + strings.size() + " строк(и) и "+ words.size() + " слов(а) (уникадьных - " + uniqWords.size() +" )." );
    }

    public void sortWords(){
        System.out.println("Отсортированный список слов:");
        uniqWords = new TreeSet<>(new MyComparator());
        for (int i = 0; i < words.size();i++){
            uniqWords.add(words.get(i));
        }
        Iterator<String> itr = uniqWords.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void repeatCounter(){
        uniqWords = new HashSet<>(words);
        System.out.println("Слова использующиеся в тексте:");
        for (String word:uniqWords){
            int count = 0;
            for (int i = 0; i< words.size();i++){
                if (word.equals(words.get(i))) count++;
            }
            System.out.println(word + " - " + count + " раз(а).");
        }
    }
    public void reverse(){
        MyIterator strReverse = new MyIterator(strings);
        System.out.println("Строки в обратном порядке:");
        while (strReverse.hasNext()) {System.out.println(strReverse.next());
            
        }
    }

    public void stringOrder(){
        int num = 3;
        System.out.println("Строка " + num + " :\n" + strings.get(num-1));
    }

}
