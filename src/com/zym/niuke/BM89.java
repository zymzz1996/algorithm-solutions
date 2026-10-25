package com.zym.niuke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BM89 {

    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(10, 30));
        intervals.add(new Interval(20,60));
        intervals.add(new Interval(80,100));
        intervals.add(new Interval(150,180));
        ArrayList<Interval> res = new BM89().merge(intervals);
        System.out.println(res);
    }

    public ArrayList<Interval> merge (ArrayList<Interval> intervals) {
        ArrayList<Interval> res = new ArrayList<>();
        if (intervals.isEmpty()) {
            return res;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start > o2.start) {
                    return 1;
                } else if (o1.start < o2.start) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Interval interval : intervals) {
            if (res.isEmpty()) {
                res.add(new Interval(interval.start, interval.end));
            } else {
                Interval last = res.get(res.size() - 1);
                if (interval.start > last.end) {
                    res.add(new Interval(interval.start, interval.end));
                } else {
                    last.end = Math.max(last.end, interval.end);
                }
            }
        }
        return res;
    }

    //"区间"定义
    static class Interval {
        int start; //起点
        int end;   //终点

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

}
