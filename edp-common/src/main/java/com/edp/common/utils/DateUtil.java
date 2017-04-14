package com.edp.common.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;


/**
 * DateUtils.java 日期时间工具
 * 
 * @version 1.0
 * @author SUNY Written Date: 2007-7-18
 * 
 *         Modified By: Modified Date:
 */
public class DateUtil {
    
    /** 日志 */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(DateUtil.class.getSimpleName());
    /** 缺省日期格式 */
    public static final String DEFAULT_DATE_FMT = "yyyy-MM-dd";

    /** 缺省时间格式 */
    public static final String DEFAULT_TIME_FMT = "yyyy-MM-dd HH:mm:ss";

    /** 缺省时间格式 */
    public static final String NULL_TIME_FMT = "yyyyMMddHHmmss";

    /** 全部时区名字 */
    private static final List TIME_ZONE_IDS = Arrays.asList(TimeZone.getAvailableIDs());

    /** 自定义时区缓存 */
    private static final Map TIME_ZONE_CACHE = new HashMap();

    /** 北京时区 */
    public static final TimeZone TIME_ZONE_BEIJING = TimeZone.getTimeZone("Asia/Shanghai");
    /** 缺省时分秒格式 */
    public static final String DEFAULT_TIME_HH24MISS = "HHmmss";

    /**
     * 转换日期毫秒数为缺省日期格式字符串
     * 
     * @param date
     *            long
     * @return String
     */
    public static String date2String(long date) {
        return date2String(new Date(date), DEFAULT_DATE_FMT, null);
    }

    /**
     * 转换日期毫秒数为缺省日期格式字符串
     * 
     * @param date
     *            long
     * @param timeZone
     *            TimeZone
     * @return String
     */
    public static String date2String(long date, TimeZone timeZone) {
        return date2String(new Date(date), DEFAULT_DATE_FMT, timeZone);
    }

    /**
     * 转换日期为缺省日期格式字符串
     * 
     * @param date
     *            Date
     * @return String
     */
    public static String date2String(Date date) {
        return date2String(date, DEFAULT_DATE_FMT, null);
    }

    /**
     * 转换日期为缺省日期格式字符串
     * 
     * @param date
     *            Date
     * @param timeZone
     *            TimeZone
     * @return String
     */
    public static String date2String(Date date, TimeZone timeZone) {
        return date2String(date, DEFAULT_DATE_FMT, timeZone);
    }

    /**
     * 转换日期毫秒数为缺省日期格式字符串
     * 
     * @param date
     *            long
     * @return String
     */
    public static String time2String(long date) {
        return date2String(new Date(date), DEFAULT_TIME_FMT, null);
    }

    /**
     * 转换日期毫秒数为缺省日期格式字符串
     * 
     * @param date
     *            long
     * @param timeZone
     *            TimeZone
     * @return String
     */
    public static String time2String(long date, TimeZone timeZone) {
        return date2String(new Date(date), DEFAULT_TIME_FMT, timeZone);
    }

    /**
     * 转换日期为缺省日期格式字符串
     * 
     * @param date
     *            Date
     * @return String
     */
    public static String time2String(Date date) {
        return date2String(date, DEFAULT_TIME_FMT, null);
    }

    /**
     * 转换日期为缺省日期格式字符串
     * 
     * @param date
     *            Date
     * @param timeZone
     *            TimeZone
     * @return String
     */
    public static String time2String(Date date, TimeZone timeZone) {
        return date2String(date, DEFAULT_TIME_FMT, timeZone);
    }

    /**
     * 转换日期为指定格式字符串
     * 
     * @param date
     *            Date
     * @param format
     *            String
     * @return String
     */
    public static String date2String(Date date, String format) {
        return date2String(date, format, null);

    }

    /**
     * 转换日期为指定格式字符串
     * 
     * @param date
     *            Date
     * @param format
     *            String
     * @param timeZone
     *            TimeZone
     * @return String
     */
    public static String date2String(Date date, String format, TimeZone timeZone) {
        if (date == null || format == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        if (timeZone != null) {
            sdf.setTimeZone(timeZone);
        }
        return sdf.format(date);

    }

    /**
     * 解析当前时间的时分秒，格式如：HH24MISS
     * 
     * @param date
     *            Date
     * @return String
     */
    public static String timeHH24MISS(Date date) {
        return date2String(date, DEFAULT_TIME_HH24MISS, null);
    }

    /**
     * 解析日期时间字符串,支持 yyMMdd,yyyyMMdd, yyyy-MM-dd, yyyy/MM/dd, yyyyMMddHHmm,
     * yyyyMMddHHmmss, yyyyMMddHHmmssSSS, yyyy-MM-dd HH:mm:ss, yyyy-MM-dd
     * HH:mm:ss.SSS 格式, 其它方式结果不保证正确
     * 
     * @param str
     *            String
     * @return date Date
     */
    public static Date string2Date(String str) {
        return string2Date(str, (TimeZone) null);
    }

    /**
     * 解析日期时间字符串,支持 yyMMdd,yyyyMMdd, yyyy-MM-dd, yyyy/MM/dd, yyyyMMddHHmm,
     * yyyyMMddHHmmss, yyyyMMddHHmmssSSS, yyyy-MM-dd HH:mm:ss, yyyy-MM-dd
     * HH:mm:ss.SSS, yyyyMMdd HH:mm:ss(add by zhongcf 20120220)格式, 其它方式结果不保证正确
     * 
     * @param str1
     *            String
     * @param timeZone
     *            TimeZone
     * @return date Date
     */
    public static Date string2Date(String str1, TimeZone timeZone) {
        if (str1 == null) {
            return null;
        }
        String str = str1.trim();
        if (str.length() == 6) {
            return string2Date(str, "yyMMdd", timeZone);
        }
        if (str.length() == 8) {
            return string2Date(str, "yyyyMMdd", timeZone);
        }
        if (str.length() == 10) {
            if (str.indexOf("-") != -1) {
                return string2Date(str, "yyyy-MM-dd", timeZone);
            }

            if (str.indexOf("/") != -1) {
                return string2Date(str, "yyyy/MM/dd", timeZone);
            }
        }
        if (str.length() == 12) {
            return string2Date(str, "yyyyMMddHHmm", timeZone);
        }
        if (str.length() == 14) {
            return string2Date(str, "yyyyMMddHHmmss", timeZone);
        }
        if (str.length() == 17) {
            if (str.indexOf(":") != -1) {
                return string2Date(str, "yyyyMMdd HH:mm:ss", timeZone);
            } else {
                return string2Date(str, "yyyyMMddHHmmssSSS", timeZone);
            }
        }
        if (str.length() == 19) {
            if (str.indexOf("-") != -1) {
                return string2Date(str, "yyyy-MM-dd HH:mm:ss", timeZone);
            }
            if (str.indexOf("/") != -1) {
                return string2Date(str, "yyyy/MM/dd HH:mm:ss", timeZone);
            }
        }
        if (str.length() == 23) {
            if (str.indexOf("-") != -1) {
                return string2Date(str, "yyyy-MM-dd HH:mm:ss.SSS", timeZone);
            }
            if (str.indexOf("/") != -1) {
                return string2Date(str, "yyyy/MM/dd HH:mm:ss.SSS", timeZone);
            }
        }
        try {
            return new SimpleDateFormat().parse(str);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 解析日期字符串,支持 yyyyMMdd
     * 
     * @param str
     *            String
     * @return String
     * @throws ParseException
     *             Exception
     */
    public static String stringDate2Str(String str) throws ParseException {
        if (str == null || "".equals(str)) {
            return null;
        }
        SimpleDateFormat slf = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(slf.parse(str));
    }

    /**
     * 按指定方式解析日期时间
     * 
     * @param str
     *            String
     * @param format
     *            String
     * @return Date
     */
    public static Date string2Date(String str, String format) {
        return string2Date(str, format, null);
    }

    /**
     * 按指定方式解析日期时间
     * 
     * @param str
     *            String
     * @param format1
     *            String
     * @param timeZone
     *            TimeZone
     * @return Date
     */
    public static Date string2Date(String str, String format1, TimeZone timeZone) {
        if (str == null) {
            return null;
        }
        String format=format1;
        if (format1 == null) {
            format = DEFAULT_DATE_FMT;
        }
        SimpleDateFormat fmt = new SimpleDateFormat(format);
        if (timeZone != null) {
            fmt.setTimeZone(timeZone);
        }
        try {
            return fmt.parse(str);
        } catch (ParseException e) {
            return null;
        }
    }




    /**
     * 循环调整时间
     * 
     * @param date
     *            Date
     * @param field
     *            int
     * @param amount
     *            int
     * @return Date
     */
    public static Date rollDate(Date date, int field, int amount) {
        return rollDate(date, field, amount, null);
    }

    /**
     * 循环调整时间
     * 
     * @param date
     *            Date
     * @param field
     *            int
     * @param amount
     *            int
     * @param timeZone
     *            TimeZone
     * @return Date
     */
    public static Date rollDate(Date date, int field, int amount, TimeZone timeZone) {
        Calendar cal = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        cal.setTime(date);
        cal.roll(field, amount);
        return cal.getTime();
    }

    /**
     * 调整时间
     * 
     * @param date
     *            Date
     * @param field
     *            int
     * @param amount
     *            int
     * @return Date
     */
    public static Date addDate(Date date, int field, int amount) {
        return addDate(date, field, amount, null);
    }

    /**
     * 调整时间
     * 
     * @param date
     *            Date
     * @param field
     *            int
     * @param amount
     *            int
     * @param timeZone
     *            TimeZone
     * @return Date
     */
    public static Date addDate(Date date, int field, int amount, TimeZone timeZone) {
        Calendar cal = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        cal.setTime(date);
        cal.add(field, amount);
        return cal.getTime();
    }

    /**
     * 比较2个同时区时间先后，注意:时间的格式必须在String2Date支持的格式范围内
     * 
     * @param date1
     *            String 时间1
     * @param date2
     *            String 时间2
     * @return int 如果时间1等于时间2，返回0，如果时间1小于时间2，返回负值，如果时间1大于时间2，返回正值
     */
    public static int compare(String date1, String date2) {
        return string2Date(date1).compareTo(string2Date(date2));
    }

    /**
     * 比较2个时间先后
     * 
     * @param date1
     *            Date 时间1
     * @param date2
     *            Date 时间2
     * @return int 如果时间1等于时间2，返回0，如果时间1小于时间2，返回负值，如果时间1大于时间2，返回正值
     */
    public static int compare(Date date1, Date date2) {
        return date1.compareTo(date2);
    }

    /**
     * 查询时区
     * 
     * @param timediff
     *            int
     * @return TimeZone
     */
    public static TimeZone findTimeZone(int timediff) {
        String[] ids = TimeZone.getAvailableIDs(timediff * 60000 + TimeZone.getDefault().getOffset(System.currentTimeMillis()));
//        if (ids == null) {
//            return new SimpleTimeZone(timediff * 60000, "UDT");
//        }
        return TimeZone.getTimeZone(ids[0]);
    }

    /**
     * 根据时区名字取得时区 如果非java已知标准名字，则必须为 GMT[+-]hh:mm 格式
     * 
     * @param id
     *            String
     * @return TimeZone
     */
    public static TimeZone getTimeZone(String id) {
        if (id == null) {
            return null;
        }
        if (TIME_ZONE_IDS.contains(id)) {
            return TimeZone.getTimeZone(id);
        }
        if (TIME_ZONE_CACHE.containsKey(id)) {
            return (TimeZone) TIME_ZONE_CACHE.get(id);
        }
        Pattern p = Pattern.compile("^GMT[+-](0[0-9]|1[01]):([0-5][0-9])$");
        Matcher m = p.matcher("id");
        if (!m.matches()) {
            return null;
        }
        int hh = Integer.parseInt(id.substring(4, 6));
        int mm = Integer.parseInt(id.substring(7));
        int sign = id.charAt(3) == '-' ? -1 : 1;
        TimeZone tz = new SimpleTimeZone((hh * 60 + mm) * 60000 * sign, id);
        TIME_ZONE_CACHE.put(id, tz);
        return tz;
    }

    /**
     * 
     * string2TimeStamp:(这里用一句话描述这个方法的作用). <br/>
     * 
     * @author st-lk3613
     * @param millions
     *            Object
     * @param nanos
     *            Object
     * @return Timestamp
     * @since JDK 1.6
     */
    public static Timestamp string2TimeStamp(Object millions, Object nanos) {
        try {
            Timestamp res = new Timestamp(Long.parseLong((String) millions));
            res.setNanos(Integer.parseInt((String) nanos));

            return res;
        } catch (NumberFormatException e) {
            return null;
        }

    }

    /**
     * 
     * date2Timestamp:把Date转为Timestamp. <br/>
     * 
     * @author st-lk3613
     * @param adate
     *            Date
     * @return Timestamp
     * @since JDK 1.6
     */
    public static Timestamp date2Timestamp(Date adate) {
        return new Timestamp(adate.getTime());
    }

    /**
     * <p>
     * 把用户当地时间转成网银时间。
     * </p>
     * 
     * @param date
     *            Date 待转换的时间。
     * @param dest
     *            TimeZone 用户所在时区。
     * @return Date转换后的时间。
     */
    public static Date transformDateFrom(Date date, TimeZone dest) {
        return transformDate(date, dest, TIME_ZONE_BEIJING);
    }

    /**
     * <p>
     * 把网银时间转成用户当地时间。
     * </p>
     * 
     * @param date
     *            Date 待转换的时间。
     * @param dest
     *            TimeZone 用户所在时区。
     * @return Date 转换后的时间。
     */
    public static Date transformDateInto(Date date, TimeZone dest) {
        return transformDate(date, TIME_ZONE_BEIJING, dest);
    }

    /**
     * 
     * transformDate:(这里用一句话描述这个方法的作用). <br/>
     * 
     * @author st-lk3613
     * @param dateSrc
     *            Date
     * @param src
     *            TimeZone
     * @param dest
     *            TimeZone
     * @return Date
     * @since JDK 1.6
     */
    private static Date transformDate(Date dateSrc, TimeZone src, TimeZone dest) {
        Calendar cal = Calendar.getInstance(dest);
        cal.setTimeInMillis(dateSrc.getTime());
        int yy = cal.get(Calendar.YEAR);
        int mm = cal.get(Calendar.MONTH);
        int dd = cal.get(Calendar.DATE);
        int hh = cal.get(Calendar.HOUR_OF_DAY);
        int mm1 = cal.get(Calendar.MINUTE);
        int ss = cal.get(Calendar.SECOND);
        int sss = cal.get(Calendar.MILLISECOND);
        Calendar calBJ = Calendar.getInstance(src);
        calBJ.set(Calendar.YEAR, yy);
        calBJ.set(Calendar.MONTH, mm);
        calBJ.set(Calendar.DATE, dd);
        calBJ.set(Calendar.HOUR_OF_DAY, hh);
        calBJ.set(Calendar.MINUTE, mm1);
        calBJ.set(Calendar.SECOND, ss);
        calBJ.set(Calendar.MILLISECOND, sss);
        return calBJ.getTime();
    }

    /**
     * 校验起始日期和结束日期的合法性
     * <p>
     * 例如：起始日期距当前日期不超过12个月，起始结束日期间隔不超过3个月，调用<br>
     * validateDateRange(startDate, endDate, currentDate, 3, 12)
     * 
     * @param startDate
     *            Date 起始日期
     * @param endDate
     *            Date 结束日期
     * @param currentDate
     *            Date 当前日期
     * @param maxInterval
     *            int 起始日期和结束日期的最大距离（单位为月）
     * @param amount
     *            int 起始日期和当前日期的最大距离（单位为月）
     * @return boolean
     */
    public static boolean validateDateRange(Date startDate, Date endDate, Date currentDate, int maxInterval, int amount) {
        if (startDate.after(endDate)) {
            return false;
        }

        if (currentDate.after(addDate(startDate, Calendar.MONTH, amount))) {
            return false;
        }

        if (endDate.after(addDate(startDate, Calendar.MONTH, maxInterval))) {
            return false;
        }
        return true;
    }

    /**
     * 把规定格式的日期转为毫秒数（如：2012/7/9，yyyy/MM/dd）
     * 
     * @param str
     *            String
     * @param format
     *            String
     * @return long
     */
    public static long getTimeStamp(String str, String format) {
        DateFormat df = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = df.parse(str);
        } catch (ParseException e) {
            LOGGER.info("getTimeStamp错误："+e.getMessage());
        }
        long time=0;
        if(null!=date){
            time=date.getTime();
        }
        return time;
    }

    /**
     * 构建时间戳 "20140314" +"075012"
     * 
     * @param date
     *            String
     * @param time
     *            String
     * @return long
     */
    public static long buildTimeStamp(String date, String time) {
        String tranTime = date + time;
        return DateUtil.getTimeStamp(tranTime, DateUtil.NULL_TIME_FMT);
    }

    /**
     * 取得当前时间的时间戳
     * 
     * 
     * @return long
     */
    public static long getCurrentTimeStamp() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal.getTimeInMillis();
    }

    /**
     * 获取当天日期零点时的毫秒数
     * 
     * @return long
     */
    public static long getTimeZero() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTimeInMillis();
    }

    /**
     * 获取指定日期24点时的毫秒数（默认format：yyyy-MM-dd HH:mm:ss）
     * 
     * @param date
     *            String
     * 
     * @return long
     */
    public static long get24TimeOfDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateTime;
        try {
            dateTime = sdf.parse(date + " 23:59:59");
            return dateTime.getTime();
        } catch (ParseException e) {
            LOGGER.info("get24TimeOfDate错误："+e.getMessage());
        }
        return 0;
    }

    /**
     * 时间转日期
     * 
     * @param time
     *            String
     * @return String
     */
    public static String millonTimeFormat(String time) {
        Date date;
        DateFormat df;
        if (time != null && !"".equals(time)) {
            date = new Date(Long.valueOf(time));
            df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return df.format(date);
        } else {
            return "";
        }
    }

    /**
     * 
     * millisToString:将毫秒数转换为日期. <br/>
     * 
     * 
     * @author st-lk3613
     * @param millis
     *            long
     * @param format
     *            String
     * @return String
     * @since JDK 1.6
     */
    public static String millisToString(long millis, String format) {
        Date date = new Date(millis);
        DateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }


}