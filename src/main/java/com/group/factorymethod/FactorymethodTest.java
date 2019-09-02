package com.group.factorymethod;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/2 14:06
 * @version: 1.1.0
 */
public class FactorymethodTest {
    public static void main(String[] args) {
        Undergraduate undergraduate= new Undergraduate();
        undergraduate.sweep();

        Volunteer volunteer = new Volunteer();
        volunteer.wash();

        UndergraduateFactory undergraduateFactory = new UndergraduateFactory();
        AbstractLeiFeng undergraduate2 = undergraduateFactory.createLeiFeng();
        undergraduate2.buyRice();


        VolunteerFactory volunteerFactory = new VolunteerFactory();
        AbstractLeiFeng volunteer1 = volunteerFactory.createLeiFeng();
        volunteer1.wash();
    }
}
