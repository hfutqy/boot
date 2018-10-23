package com.qiyu.boot.utils;

/**
 * @author qiyu
 * @date 2018/10/23
 */
public class ArrayMove {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = a.length;
        int m = 3;
        int[] tmp = new int[m];
        for (int j = 0; j < m; j++) {
            tmp[j] = a[j];
            for (int i = 0; i < n; ) {
                if (i + j + m < n) {
                    a[i + j] = a[i + j + 3];
                    i += 3;
                } else {
                    break;
                }
            }
        }
        // a=[4,5,6,7,8,9,10,8,9,10]
        // tmp = [1,2,3]
        for (int i = m; i > 0; i--) {
            a[n - i] = tmp[m - i];
        }
        // a=[4,5,6,7,8,9,10,1,2,3]
        revert(a, 0, n-1);
        // a=[3,2,1,10,9,8,7,6,5,4]
        for (int i : a) {
            System.out.print(i + "   ");
        }
    }

    // 转置a[]中第l至第h的元素
    static void revert(int[] a, int l, int h) {
        for (int i = 0; i < (h - l + 1) / 2; i++) {
            int tmp = a[l + i];
            a[l + i] = a[h - i];
            a[h - i] = tmp;
        }
    }
}
