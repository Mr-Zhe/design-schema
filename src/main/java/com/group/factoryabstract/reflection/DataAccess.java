package com.group.factoryabstract.reflection;


/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 18:01
 * @version: 1.1.0
 */
public class DataAccess {
    private String db;

    public UserDao createUserDao() throws Exception {
        if (db != null && !"".equals(db)) {
            Class<?> clazz = Class.forName("com.group.factoryabstract.reflection.User" + db + "Impl");
            return (UserDao) clazz.newInstance();
        }
        return null;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}
