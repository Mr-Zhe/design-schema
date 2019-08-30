package com.group.decorator;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/30 17:20
 * @version: 1.1.0
 */
public class TShirtsDecorator extends FineryDecorator {

    public TShirtsDecorator(String name) {
        super(name);
    }

    public TShirtsDecorator() {
    }

    @Override
    public void show() {
        System.out.println("装扮TShirts.....");
        super.show();
    }
}
