package com.group.decorator;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/30 17:24
 * @version: 1.1.0
 */
public class SneakersDecorator extends FineryDecorator {
    public SneakersDecorator(String name) {
        super(name);
    }

    public SneakersDecorator() {
    }

    @Override
    public void show() {
        System.out.println("装扮球鞋....");
        super.show();
    }
}
