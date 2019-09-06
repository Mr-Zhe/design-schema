package com.group.adapter;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 11:34
 * @version: 1.1.0
 */
public class AdapterTest {
    public static void main(String[] args) {
        Player forwards = new Forwards("巴蒂尔");
        forwards.attack();
        forwards.defense();
        Translator translator = new Translator("姚明");
        translator.attack();
        translator.defense();
    }
}
