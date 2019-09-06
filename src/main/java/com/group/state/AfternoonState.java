package com.group.state;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 18:43
 * @version: 1.1.0
 */
public class AfternoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17){
            System.out.println(String.format("当前时间：%s点，下午状态还不错， 继续努力！", work.getHour()));
        }else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
