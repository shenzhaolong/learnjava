package com.tencent.algotithm1;

import java.util.Arrays;
import java.util.Comparator;

public class Algo1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 9, -1, 98, 2};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // 如果不存在则返回插入点的负值
        System.out.println(Arrays.binarySearch(a, 3));
        // 超过长度会补默认值
        int[] b = Arrays.copyOf(a, 20);
        // 填充
        Arrays.fill(b, 100);

        Integer[] d = {2,4,-1,4,0};
        Arrays.sort(d, new Comparator<Integer>() {
            // 插入+二分，排序时，返回负数，A和前面的比较；0和正数和后面的比较
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        // lambda表达式，只能用于简化有且只有一个抽象方法的接口类的实现
        Arrays.sort(d, (Integer o1, Integer o2) -> {
            return o1 - o2;
        });
        // 只有一行可以大括号不写
        // 只有一个参数可以（）不写
        Arrays.sort(d, (Integer o1, Integer o2) -> o1 - o2);
        System.out.println(Arrays.toString(d));
    }
}
