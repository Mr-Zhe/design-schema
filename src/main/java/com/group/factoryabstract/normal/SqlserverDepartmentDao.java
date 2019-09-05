package com.group.factoryabstract.normal;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 15:58
 * @version: 1.1.0
 */
public class SqlserverDepartmentDao implements DepartmentDao {
    @Override
    public void insert(DepartmentEntity department) {
        System.out.println(String.format("SQLserver数据库添加Department|{id:%s,name:%s}", department.getId(), department.getName()));
    }

    @Override
    public void getDepartment(int id) {
        DepartmentEntity department = new DepartmentEntity(id, "wang");
        System.out.println(String.format("SQLserver数据库获取Department:%s", department));
    }
}
