package com.group.factoryabstract.reflection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/9/5 18:09
 * @version: 1.1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactoryTest test = new AbstractFactoryTest();
        Properties properties = test.getProperties();
        String db = properties.getProperty("db");
        DataAccess dataAccess = new DataAccess();
        dataAccess.setDb(db);
        try {
            UserDao userDao = dataAccess.createUserDao();
            UserEntity user = new UserEntity(233, "ddddddddddd");
            userDao.insert(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Properties getProperties() {
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("db.properties");
        Properties properties;
        try {
            properties = new Properties();
            properties.load(resourceAsStream);
        } catch (IOException e) {
            properties = null;
            e.printStackTrace();
        }
        return properties;
    }
}
