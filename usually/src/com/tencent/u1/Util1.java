package com.tencent.u1;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util1 {

    public static void quickSort(int[] array, int l, int r) {
        if (l >= r) return;
        int len = array.length, i = l - 1, j = r + 1, a = array[l];
        while (i < j) {
            do i++; while (array[i] < a);
            do j--; while (array[j] > a);
            if (i < j) {
                int k = array[i];
                array[i] = array[j];
                array[j] = k;
            }
        }
        quickSort(array, l, j);
        quickSort(array, j + 1, r);
    }
    public static void main(String[] args) throws IOException {
        // 当前系统事件的毫秒值
        System.currentTimeMillis();
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {7, 8, 9, 10, 11};
        // 如果是基础类型，那么必须类型一致
        // 引用类型是地址
        System.arraycopy(array1, 1, array2, 2, 3);     // 数组拷贝
        System.out.println("array2:");
        for (int i: array2) {
            System.out.print(i);
        }
        System.out.println();

        // Runtime
        Runtime runtime = Runtime.getRuntime();
        System.out.println("CPU线程数：" + runtime.availableProcessors());
        System.out.println("JVM可获取总内存大小：" + runtime.maxMemory());
        System.out.println("JVM已获取内存：" + runtime.totalMemory());
        System.out.println("剩余JVM内存：" + runtime.freeMemory());
        // System.out.println(runtime.exec("ls")); // 运行cmd命令

        int[] array3 = {5, 5, 3, 1, 2, 2, 9, 8, -1, 5};
        quickSort(array3, 0, array3.length - 1);
        System.out.println("array3:");
        for (int i: array3) {
            System.out.print(i + ",");
        }
        System.out.println();

        // Objects.equals(Object a, Object b)先判空再判断
        // Objects.isNull(Object a) nonNull(Object a)

        BigInteger bigInteger1 = new BigInteger("498564564132221431431334114331441343413431");
        bigInteger1 = bigInteger1.add(new BigInteger("1111"));
        System.out.println(bigInteger1.toString());
        BigDecimal bigDecimal1 = BigDecimal.valueOf(6.6666);

        /*
        正则表达式
        []限定出现范围
        [abc12]只能是abc12中的一个[^abc12]不能是这五个里任何一个
        [a-zA-Z]：a-z和A-Z范围内都可以 [a-d[m-p]]a-d或者m-p范围内都可以
        [a-z&&[def]]， [a-z&&[^m-p]]两个集合的交集
         */
        System.out.println("a".matches("[abc12]")); // true
        System.out.println("a12".matches("[abc12]")); // false
        System.out.println("a12".matches("[abc12][abc12][abc12]")); // true
        System.out.println("adef".matches("[^abc]"));
        System.out.println("adef".matches("[^abc &&[abc]]"));
        /*
        .匹配任意字符
        \d一个数字 \D非数字 \s一个空白字符[\t\n\x0B\f\r] \S非空白字符 \w英文数字下划线[a-zA-Z_0-9] \W非

        X?出现一次或0次 X*0次或多次 X+一次或多次 X{n}n次 X{n,}至少n次 X{n,m}n到m次
        */
        // 手机号 18655620010
        System.out.println("18655620010".matches("1\\d{10}"));

        /*
        正则表达式查找文本
        Pattern:正则表达式
        Matcher:匹配器
         */
        Pattern pattern1 = Pattern.compile("Java\\d{1,2}");
        Matcher matcher1 = pattern1.matcher("Java8111312432Java17");
        while (matcher1.find()) {  // 实际做查找
            String s1 = matcher1.group();
            System.out.println(s1);
        }
    }
}
