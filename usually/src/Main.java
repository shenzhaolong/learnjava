import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 7方便时间的修改操作
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());
        // 0:纪元 1，2：年 月，3一年中的第几周 ，4一个月中的第几周，5一个月中的第几日
        // get(int field)获取日期中某个字段信息
        // set(int field)设置
        // add(int field, int amount)为某个字段增加某值
        System.out.println(calendar1);
        // JDK8新增相关类更好判断时间大小，不可变
        // 时区 ZoneId 时间戳 Instant now()不带时区标准时间 asZone(ZoneId zone)时区标准时间
        // ZoneDateTime
        // 获得系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        // 格式化 SimpleDateFormat ofPattern(格式) format()指定方法格式化
        // Calendar日历类 LocalDate: 年 月 日；LocalTime：时 分 秒
        // LocalDateTime 包含上面六个

        /*
        Duration 两个时间的间隔 (秒 纳秒)
        Period 两个日期的间隔（年 月 日）
        ChronoUnit计算两个日期的间隔
         */
        /*
        包装类
        Integer new和valueOf两种方式
        new不会用到缓冲池
        valueOf -128 - 127
        intValue()得到拆箱
        JDK5以后存在自动装箱和拆箱 基本数据类型和包装类自动进行转换
        不需要new和valueOf操作
         */
        Integer integer1 = Integer.valueOf(127);
        Integer integer2 = Integer.valueOf(127);
        System.out.println(integer1 == integer2);

        Integer integer3 = Integer.valueOf(128);
        Integer integer4 = Integer.valueOf(128);
        System.out.println(integer3 == integer4);
        System.out.println(Integer.toHexString(integer4));
        System.out.println(Integer.parseInt("19876"));
    }
}