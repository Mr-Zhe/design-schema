package com.group.factoryabstract.normal;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 15:50
 * @version: 1.1.0
 */
public class AccessFactory implements IFactory {
    @Override
    public UserDao createUserDao() {
        return new AccessUserDao();
    }

    @Override
    public DepartmentDao createDepartmentDao() {
        return new AccessDepartmentDao();
    }
}
