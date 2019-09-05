package com.group.factoryabstract.normal;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 15:49
 * @version: 1.1.0
 */
public class SqlserverFactory implements IFactory {
    @Override
    public UserDao createUserDao() {
        return new SqlserverUserDao();
    }

    @Override
    public DepartmentDao createDepartmentDao() {
        return new SqlserverDepartmentDao();
    }
}
