package com.group.decorator;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/8/30 17:15
 * @version: 1.1.0
 */
public class FineryDecorator extends Person {
    private Person person;

    public FineryDecorator() {
    }

    public FineryDecorator(String name) {
        super(name);
    }

    public void decorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
