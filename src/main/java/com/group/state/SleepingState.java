package com.group.state;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 18:43
 * @version: 1.1.0
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s点，不行了，睡着了！", work.getHour()));
    }
}
