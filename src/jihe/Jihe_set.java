package jihe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Jihe_set {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(1);
        set.add("hechixueyan");
        set.add(true);
        set.add(1);
        System.out.println("当前个数为"+set.size());
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
