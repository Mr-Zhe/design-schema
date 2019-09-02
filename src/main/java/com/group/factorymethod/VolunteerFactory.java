package com.group.factorymethod;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/2 14:20
 * @version: 1.1.0
 */
public class VolunteerFactory implements LeiFengFactory {
    @Override
    public Volunteer createLeiFeng() {
        return new Volunteer();
    }
}
