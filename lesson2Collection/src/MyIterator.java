import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyIterator implements Iterator{
    private ListIterator<String> myListIterator;

    MyIterator(List<String> myList){
        myListIterator = myList.listIterator(myList.size());
    }

    @Override
    public boolean hasNext(){
        return myListIterator.hasPrevious();
    }

    @Override
    public String next(){
        return myListIterator.previous();
    }
}
