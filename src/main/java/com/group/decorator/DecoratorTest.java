package com.group.decorator;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/30 17:26
 * @version: 1.1.0
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Person person = new Person("wang");
        TShirtsDecorator tShirts = new TShirtsDecorator();
        BigTrouserDecorator bigTrouser = new BigTrouserDecorator();
        SneakersDecorator sneakers = new SneakersDecorator();

        tShirts.decorator(person);
        bigTrouser.decorator(tShirts);
        sneakers.decorator(bigTrouser);
        sneakers.show();
    }
}
