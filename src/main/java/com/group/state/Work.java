package com.group.state;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 18:43
 * @version: 1.1.0
 */
public class Work {
    private State state;
    private int hour;
    private boolean finish;

    public Work() {
        this.state = new ForenoonState();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean getFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void writeProgram(){
        state.writeProgram(this);
    }
}
