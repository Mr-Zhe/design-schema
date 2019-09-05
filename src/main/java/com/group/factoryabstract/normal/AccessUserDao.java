package com.group.factoryabstract.normal;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 15:46
 * @version: 1.1.0
 */
public class AccessUserDao implements UserDao {
    @Override
    public void insert(UserEntity user) {
        System.out.println(String.format("Access数据库添加User|{id:%s,name:%s}", user.getId(), user.getName()));

    }

    @Override
    public void getUser(int userId) {
        UserEntity user = new UserEntity(userId, "wang");
        System.out.println(String.format("Access数据库获取User:%s", user));
    }
}
