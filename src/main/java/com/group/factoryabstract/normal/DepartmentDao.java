package com.group.factoryabstract.normal;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 15:26
 * @version: 1.1.0
 */
public interface DepartmentDao {
    void insert(DepartmentEntity department);
    void getDepartment(int id);
}
