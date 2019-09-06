package com.group.state;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 18:43
 * @version: 1.1.0
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println(String.format("当前时间：%s点，中午饿了，午饭：犯困，午休！", work.getHour()));
        }else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
