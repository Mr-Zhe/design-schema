package com.group.state;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 10:31
 * @version: 1.1.0
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getFinish()){
            work.setState(new RestState());
            work.writeProgram();
        }else {
            if (work.getHour() < 21){
                System.out.println(String.format("当前时间：%s点，加班中， 疲劳至极！", work.getHour()));
            }else {
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
