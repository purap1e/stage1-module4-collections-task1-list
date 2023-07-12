package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.*;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> list =  sourceList.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        List<Integer> list1 =  sourceList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        list.forEach(linkedList::addFirst);
        linkedList.addAll(list1);
        return linkedList;
    }
}
