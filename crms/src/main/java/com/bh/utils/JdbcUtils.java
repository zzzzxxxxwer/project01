package com.bh.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

//jdbc工具类
public class JdbcUtils {
    private static DataSource dataSource = new ComboPooledDataSource();
    public static DataSource getDataSource() {
        return dataSource;
    }
    public static Connection getConnection() {
        try {
            return dataSource.getConnection();//获取连接
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

