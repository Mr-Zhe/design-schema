package com.group.state;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 10:36
 * @version: 1.1.0
 */
public class StateTest {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(18);
        work.writeProgram();
        work.setHour(19);
        work.setFinish(true);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();

    }
}
