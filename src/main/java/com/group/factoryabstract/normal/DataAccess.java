package com.group.factoryabstract.normal;

/**
 * 简单工厂改造抽象工厂
 * 使用DataAccess取代IFactory,SqlserverFactory,AccessFactory
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 16:31
 * @version: 1.1.0
 */
public class DataAccess {
    private static final String db = "sqlserver";

    public static UserDao createUserDao() {
        UserDao userDao;
        switch (db) {
            case "sqlserver":
                userDao = new SqlserverUserDao();
                break;
            case "access":
                userDao = new AccessUserDao();
                break;
            default:
                throw new RuntimeException();
        }
        return userDao;
    }

    public static DepartmentDao createDepartmentDao() {
        DepartmentDao departmentDao;
        switch (db) {
            case "sqlserver":
                departmentDao = new SqlserverDepartmentDao();
                break;
            case "access":
                departmentDao = new AccessDepartmentDao();
                break;
            default:
                throw new RuntimeException();
        }
        return departmentDao;
    }
}
