import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        /*
         * 基本数据类型
         * 整数：int 32 long 64 short 16 byte 8
         * 浮点数：float 32 double 64
         * 字符：char 16
         * 布尔 boolean 1
         * 字面量默认为int, double
         * 10000L, 1.5F
         */
        // 小驼峰：变量 方法
        // 大驼峰：类名
        System.out.println("input a number:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }
}
