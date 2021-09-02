package com.tianhai.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Pang-Lin
 * @version 1.0
 * @description: TODO
 * @date 2021/9/1 17:20
 */
public class THBYutil {

    /** 将String类型  yyyy-mm-dd 转换为date对象
     * @description: 将String类型  yyyy-mm-dd 转换为date对象
     * @param: * @param dateStr
     * @return: java.util.Date
     * @author Pang-Lin
     * @date: 2021/9/1 17:23
     */
    public static Date StringParseDate(String dateStr) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        try {
            date=ft.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    /** 将字符串拆分并拼接
     * @description: 将字符串拆分并拼接
     * @param: * @param str
     * @return: java.lang.String
     * @author Pang-Lin
     * @date: 2021/9/1 18:25
     */
    public static String StringSpilt(String str){
        StringBuilder string = new StringBuilder();
        //长度5 下标从0开始 到4
        String substring = str.substring(0, str.length());
        //以逗号分割，得出的数据存到 result 里面
        String[] result = substring.split(",");
        for (String r : result) {
            string.append(r);
        }
        return string.toString();
    }



}
