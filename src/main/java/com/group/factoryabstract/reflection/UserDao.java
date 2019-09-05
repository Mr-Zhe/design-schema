package com.group.factoryabstract.reflection;


/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 15:17
 * @version: 1.1.0
 */
public interface UserDao {
    void insert(UserEntity user);
    void getUser(int userId);
}
