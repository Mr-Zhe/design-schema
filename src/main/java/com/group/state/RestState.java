package com.group.state;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 18:43
 * @version: 1.1.0
 */
public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s点，下班回家了！", work.getHour()));
    }
}
