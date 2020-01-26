import java.util.Comparator;

public class MyComparator implements Comparator<String>{

    @Override
    public int compare(String str1,String str2){
        if (str1.length() != str2.length()) return str1.length()-str2.length();
            else return str1.compareTo(str2);
    }
}
