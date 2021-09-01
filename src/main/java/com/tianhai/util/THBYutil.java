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


}
