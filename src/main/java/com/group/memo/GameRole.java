package com.group.memo;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 14:30
 * @version: 1.1.0
 */
public class GameRole {
    private int vitality;
    private int attack;
    private int defense;

    public void stateDisplay() {
        System.out.println("当前角色状态：");
        System.out.println(String.format("体力：%s", this.getVitality()));
        System.out.println(String.format("攻击力：%s", this.getAttack()));
        System.out.println(String.format("防御力：%s", this.getDefense()));
    }

    public void getInitState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(this.getVitality(), this.getAttack(), this.getDefense());
    }

    public void recoveryState(RoleStateMemento memento) {
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
