package com.zym.niuke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class BM56 {

    public static void main(String[] args) {
        int[] num = {1,1,2};
        ArrayList<ArrayList<Integer>> res = new BM56().permuteUnique(num);
        System.out.println(res);
    }

    public ArrayList<ArrayList<Integer>> permuteUnique (int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        boolean[] mark = new boolean[num.length];
        Arrays.sort(num);
        back(num, list, res, mark);
        return res;
    }

    public void back(int[] num, LinkedList<Integer> list, ArrayList<ArrayList<Integer>> res, boolean[] mark) {
        if (list.size() == num.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (mark[i] || (i > 0 && num[i] == num[i - 1]) && !mark[i - 1]) {
                continue;
            }
            list.add(num[i]);
            mark[i] = true;
            back(num, list, res, mark);
            list.removeLast();
            mark[i] = false;
        }
    }

}
