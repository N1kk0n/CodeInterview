package ru.n1kk0n.listpages;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List getListPage(List list, int pageNumber, int pageSize) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (pageNumber <= 0 || pageSize <= 0) {
            return null; 
        } 
        int from = pageSize * (pageNumber - 1);
        if (from > list.size()) {
            return null;
        }
        int to = from + pageSize;
        return list.subList(from, Integer.min(to, list.size()));
        
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 97; i++) {
            arrayList.add(Integer.toString(i + 1));
        }
        List sub = getListPage(arrayList, 10, 10);
        System.out.println(sub);   
    }
}
