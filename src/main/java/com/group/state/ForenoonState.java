package com.group.state;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 18:42
 * @version: 1.1.0
 */
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12){
            System.out.println(String.format("当前时间：%s点，上午工作， 精神百倍！", work.getHour()));
        }else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
