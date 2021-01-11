package jihe;

import java.util.ArrayList;
import java.util.List;

public class Jihe_list {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add("hechixueyan");
        list.add(true);
        list.add("hechixueyan");

        System.out.println("当前个数"+list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
