package com.hillel.lecture_14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public List<String> getReversList(List<String> list) {
//        TODO implements result
        //List<String> data = Arrays.asList("one", "two", "three", "four", "five");
        // Collections.reverse(list);
        List reverse = new ArrayList();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }
        list = reverse;
        return list;
    }

    public String getLongestString(List<String> list) {
//        TODO implements result
        String result = "";
        for (String s : list) {
            if (s.length() > result.length()) {
                result = s;
            }
        }
        return result;
    }


    public List<String> changeIndex(List<String> list) {
//        TODO implements result
        list.set(3, "Captain America");
        list.set(1, "Star Lord");
        return list;
    }

    public List<String> removeDuplicates(List<String> list) {
//        TODO implements result
        List dups = new ArrayList(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = dups.size() - 1; j > i; j--) {
                if (list.get(i).equals(dups.get(j))) {
                    dups.remove(j);
                }
                list = dups;
            }
        }
        return list;
    }

    public List<String> sortList(List<String> list) {
//        TODO implements result
//        list.sort(String::lastIndexOf);
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).length() > list.get(i + 1).length()) {
                String res = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, res);

            }
        }
        return list;
    }
}
