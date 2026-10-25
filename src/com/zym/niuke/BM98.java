package com.zym.niuke;

import java.util.ArrayList;

public class BM98 {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> res = new BM98().spiralOrder(matrix);
        System.out.println(res);
    }

    public ArrayList<Integer> spiralOrder (int[][] matrix) {
        // 假设以[x, y]来表示元素的位置
        // 0,0->0,1->0,2 ->1,2->2,2 ->2,1->2,0 ->1,0 ->1,1
        // 可以观察到的是，到达边界后都是向右拐
        // 横向变纵向：y到达边界 纵向便横向：x到达边界
        // 螺纹中心判定：缩减边界
        // 外层数组可以是竖着或者横着，本题中抽象为竖着更方便
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return res;
        }

        int xLeft = 0;
        int xRight = matrix.length - 1;
        int yUp = 0;
        int yDown = matrix[0].length - 1;

        int x = 0, y = 0;
        //用来标记当前是横向遍历还是纵向遍历，true纵向，false横向
        boolean flag1 = true;
        //用来标记当前是向右向下还是向左向上，true向右向下，false为向左向上
        boolean flag2 = true;

        for (int i = 0; i < matrix.length * matrix[0].length; i++) {
            res.add(matrix[x][y]);
            if (flag1 && flag2 && y == yDown) {
                flag1 = !flag1;
                xLeft++;
            }
            if (!flag1 && flag2 && x == xRight) {
                flag1 = !flag1;
                flag2 = !flag2;
                yDown--;
            }
            if (flag1 && !flag2 && y == yUp) {
                flag1 = !flag1;
                xRight--;
            }
            if (!flag1 && !flag2 && x == xLeft) {
                flag1 = !flag1;
                flag2 = !flag2;
                yUp++;
            }

            if(flag1) {
                if(flag2) {
                    y++;
                } else {
                    y--;
                }
            } else {
                if(flag2) {
                    x++;
                } else {
                    x--;
                }
            }
        }
        return res;
    }

}
