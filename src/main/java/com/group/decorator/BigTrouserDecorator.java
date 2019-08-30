package com.group.decorator;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/30 17:22
 * @version: 1.1.0
 */
public class BigTrouserDecorator extends FineryDecorator {
    public BigTrouserDecorator(String name) {
        super(name);
    }

    public BigTrouserDecorator() {
    }

    @Override
    public void show() {
        System.out.println("装扮垮裤.....");
        super.show();
    }
}
