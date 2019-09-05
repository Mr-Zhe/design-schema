package com.group.factoryabstract.normal;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 15:40
 * @version: 1.1.0
 */
public class FactoryAbstractTest {
    public static void main(String[] args) {
        UserEntity user = new UserEntity(111, "beijing");
        UserDao userDao;
        IFactory sqlserverFactory = new SqlserverFactory();
        userDao = sqlserverFactory.createUserDao();
        userDao.insert(user);

        IFactory accessFactory = new AccessFactory();
        userDao = accessFactory.createUserDao();
        userDao.insert(user);

        DepartmentEntity department = new DepartmentEntity(111, "tianjin");
        DepartmentDao departmentDao;
        departmentDao = sqlserverFactory.createDepartmentDao();
        departmentDao.insert(department);

        departmentDao = accessFactory.createDepartmentDao();
        departmentDao.insert(department);

        userDao = DataAccess.createUserDao();
        userDao.getUser(33333);
        departmentDao = DataAccess.createDepartmentDao();
        departmentDao.getDepartment(55555);
    }
}
