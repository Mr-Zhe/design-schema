package com.group.adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 11:34
 * @version: 1.1.0
 */
public class AdapterTest {
    public static void main(String[] args) throws ParseException {
        Instant instant = LocalDate.of(2020, 3, 12).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        LocalDate localDate = new SimpleDateFormat("yyyy-MM-dd").parse("2020-03-12").toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(Date.from(instant));
        System.out.println(localDate);

        Player forwards = new Forwards("巴蒂+" +
                "" +
                "尔");
        forwards.attack();
        forwards.defense();
        Translator translator = new Translator("姚明");
        translator.attack();
        translator.defense();
    }
}
