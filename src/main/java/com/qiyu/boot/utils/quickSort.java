package com.qiyu.boot.utils;

import com.google.common.primitives.Ints;

import java.util.Collections;
import java.util.List;

/**
 * @author qiyu
 * @date 2018/10/17
 */
public class QuickSort {

    public static void main(String[] agrs) {
        int[] arr = {2, 5, 1, 7, 3, 9, 6, 12,1, 3};
        quickSort(arr, 0, arr.length - 1);
        List<Integer> arrList = Ints.asList(arr);
        Collections.sort(arrList);
        for (int e : arrList){
            System.out.print(e + " ");
        }
    }

    /**
     * 快排，起始值为key=arr[i]
     * 哨兵i和哨兵j从左右往中间跑，j遇到比key小的和arr[i]交换位置，i遇到比key大的和arr[j]交换位置
     */
    public static void quickSort(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int key = arr[i];
        while (i < j) {
            //查找右侧比key小的arr[j]
            while (i < j && arr[j] >= key) {
                j--;
            }
            if (i < j) {
                //交换
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                i++;//这个只是优化，a[i]已经是小于key，所以可以不考虑
            }
            //处理左侧比key大
            while (i < j && arr[i] <= key) {
                i++;
            }
            if (i < j) {
                //交换
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                j--;//这个只是优化，a[j]已经是大于key，所以可以不考虑
            }
        }
        //此处必然i=j了，即arr[左边]<arr[i]=arr[j]<arr[右边]，判断左右是否还需要比较
        if (i > left) {
            quickSort(arr, left, i - 1);
        }
        if (j < right) {
            quickSort(arr, j + 1, right);
        }
    }
}
