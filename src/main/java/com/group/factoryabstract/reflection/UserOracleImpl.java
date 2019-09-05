package com.group.factoryabstract.reflection;


/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 16:42
 * @version: 1.1.0
 */
public class UserOracleImpl implements UserDao {
    @Override
    public void insert(UserEntity user) {
        System.out.println("User: Oracle实现插入一条记录：" + user.toString());
    }

    @Override
    public void getUser(int userId) {
        System.out.println("User: Oracle实现查询 ：id = " + userId);
    }
}
