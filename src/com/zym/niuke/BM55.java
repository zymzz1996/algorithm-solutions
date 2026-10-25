package com.zym.niuke;

import java.util.ArrayList;
import java.util.LinkedList;

public class BM55 {

    public ArrayList<ArrayList<Integer>> permute (int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        back(num, list, res);
        return res;
    }

    public void back(int[] num, LinkedList<Integer> list, ArrayList<ArrayList<Integer>> res) {
        if (list.size() == num.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < num.length; i++) {
            if (list.contains(num[i])) {
                continue;
            }
            list.add(num[i]);
            back(num, list, res);
            list.removeLast();
        }

    }

}
