package com.group.factoryabstract.normal;

/**
 * 生产工厂的抽象
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 15:49
 * @version: 1.1.0
 */
public interface IFactory {
    UserDao createUserDao();
    DepartmentDao createDepartmentDao();
}
