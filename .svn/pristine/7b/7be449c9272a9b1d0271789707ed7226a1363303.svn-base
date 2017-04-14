package com.edp.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * ClassName: SequenceManage <br/>
 * date: 2014年10月29日 下午3:08:55 <br/>
 * 
 * @author st-ln2633
 * @version
 * @since JDK 1.7
 */
public class SequenceManage {
    /**
     * SUBLENGTH 8位毫秒
     */
    public static final int SUBLENGTH = 8; //8位毫秒
    /**
     * NUMLENGTH 6位自增
     */
    public static final int NUMLENGTH = 4; //4位自增
    /**
     * NUM
     */
    private static long num = 1;

    /**
     * 
     * getSequence:(流水号生成). <br/>
     * 
     * @author st-ln2633
     * @param module
     *            前缀
     * @return 流水号
     * @since JDK 1.7
     */
    public static String getSequence(String module) {
        StringBuilder sequence = new StringBuilder();
        StringBuilder prefix = new StringBuilder(module);
        String today = SequenceManage.getSystemDateStr();
        today = today.substring(4);
        String currentTimeMillis = String.valueOf(System.currentTimeMillis());
        currentTimeMillis = currentTimeMillis.substring(currentTimeMillis.length() - SUBLENGTH);
        String subfix = SequenceManage.getSubfix();
        sequence.append(prefix).append(today).append(currentTimeMillis).append(subfix);
        return sequence.toString();
    }

    /**
     * 
     * getSubfix:(流水号后缀生成). <br/>
     * 
     * @author st-ln2633
     * @return string
     * @since JDK 1.7
     */
    private static synchronized String getSubfix() {
        String numstr = String.valueOf(num);
        StringBuilder subfix = new StringBuilder();
        for (int i = 0; i < NUMLENGTH - numstr.length(); i++) {
            subfix.append('0');
        }
        subfix.append(num);
        num++;
        if (num == 9999) {
            num = 0;
        }

        return subfix.toString();
    }

    /**
     * 
     * getSystemDateStr:(系统日期). <br/>
     * 
     * @author st-ln2633
     * @return string
     * @since JDK 1.7
     */
    public static String getSystemDateStr() {
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        return df.format(today);
    }

    /**
     * 
     * getSystemDateStr:(系统日期). <br/>
     * 
     * @author st-ln2633
     * @param format
     *            格式
     * @return string
     * @since JDK 1.7
     */
    public static String getSystemDateStr(String format) {
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat(format);
        return df.format(today);
    }

    public static void main(String[] args){

        System.out.println( SequenceManage.getSequence(""));
    }
}
