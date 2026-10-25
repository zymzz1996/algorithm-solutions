package com.zym.niuke;

import java.util.ArrayList;
import java.util.Arrays;

public class BM54 {

    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
//        int[] nums = {-10,0,10,20,-10,-40};
        ArrayList<ArrayList<Integer>> res = new BM54().threeSum(nums);
        System.out.println(res);
    }

    public ArrayList<ArrayList<Integer>> threeSum (int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
           if (num[i] > 0) {
               break;
           }
           if (i > 0 && num[i] == num[i - 1]) {
               continue;
           }
           int target = -num[i];
           int left = i + 1;
           int right = num.length - 1;
           while (left < right) {
               if (num[left] + num[right] == target) {
                   ArrayList<Integer> list = new ArrayList<>();
                   list.add(num[i]);
                   list.add(num[left]);
                   list.add(num[right]);
                   res.add(list);
                   while (left < right && num[left] == num[left + 1]) {
                       left++;
                   }
                   while (left < right &&  num[right] == num[right - 1]) {
                       right--;
                   }
                   left++;
                   right--;
               } else if (num[left] + num[right] > target) {
                   right--;
               } else {
                   left++;
               }
           }
        }
        return res;
    }

}
