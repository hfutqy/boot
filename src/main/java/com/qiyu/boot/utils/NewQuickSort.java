package com.qiyu.boot.utils;

/**
 * @author qiyu
 * @date 2018/11/8
 */
public class NewQuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 6, 9, 4};

        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    static void quickSort(int[] arr, int left, int right) {
        int key = arr[left];
        int i = left;
        int j = right;
        while (i < j) {
            // 先从j开始
            while (i < j && arr[j] >= key) {
                j--;
            }
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            // 再看i
            while (i < j && arr[i] <= key) {
                i++;
            }
            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        //哨兵相遇跳出while，此时i=j
        if (i > left) {
            quickSort(arr, left, i - 1);
        }
        if (j < right) {
            quickSort(arr, j + 1, right);
        }
    }

}
