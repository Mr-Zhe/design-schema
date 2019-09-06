package com.group.memo;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/6 14:39
 * @version: 1.1.0
 */
public class MementoTest {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.stateDisplay();

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(gameRole.saveState());

        gameRole.fight();
        gameRole.stateDisplay();

        gameRole.recoveryState(caretaker.getMemento());
        gameRole.stateDisplay();

    }
}
