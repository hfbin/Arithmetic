package cn.hfbin.linkedlist.dummylinkedlist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       /* LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0 ; i < 5 ; i ++){
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }

        linkedList.add(2, 666);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);*/

        List<Integer> list = new ArrayList();
        for(int i = 0 ; i < 5 ; i ++){
            list.add(i);
        }
        System.out.println(list);
        List<Integer>  list2 = list;
        for(int i = 5 ; i < 10 ; i ++){
            list2.add(i);
        }
        System.out.println("list2"+list2);
        System.out.println("list"+list);
    }
}
