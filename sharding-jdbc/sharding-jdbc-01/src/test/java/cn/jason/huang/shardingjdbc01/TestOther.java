package cn.jason.huang.shardingjdbc01;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * DESC:
 *
 * @author: huangxinquan
 * DATE: 2020/7/21 11:23
 **/
public class TestOther {

    @Test
    public void test1(){

//        spring.datasource.type=com.alibaba.druid.pool.DruidDataSource
//        spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
//        spring.datasource.url=jdbc:mysql://localhost:3307/sharding_db?serverTimezone=GMT%2B8
//        spring.datasource.username=root
//        spring.datasource.password=root

        String driverClass = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3307/sharding_db";
        String userName = "root";
        String password = "root";

        try {
            Class.forName(driverClass);
            Connection conn = DriverManager.getConnection(url, userName, password);
            System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
