/**
 * 
 */
package com.coolteam.fruitmgr.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

/**
 * @author liufeng23
 *
 */
public class DataConnection {
	private static BasicDataSource dataSource = null;
    /**
     * ��ʼ�����ݿ����ӳ�
     */
    public static void init() 
    {
    	if (dataSource != null)
        {
            try
            {
                dataSource.close();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            dataSource = null;
        }
        //ʹ��Properties���������ݿ����ӳ���Ϣ
        try {
            Properties p = new Properties();
            p.setProperty("driverClassName", "com.mysql.jdbc.Driver");
            p.setProperty("url", "jdbc:mysql://localhost:3306/fruitgoodsmgr");
            p.setProperty("username", "root");
            p.setProperty("password", "123456");
            p.setProperty("maxActive", "300");
            p.setProperty("maxIdle", "100");
            p.setProperty("maxWait", "1000");
           //��ָ����Ϣ��������Դ
            dataSource = (BasicDataSource) BasicDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * �����ӳ��л�ȡ����
     * @return
     * @throws SQLException
     */
    public static synchronized Connection getConnection() throws  SQLException {
        if (dataSource == null) {
            init();
        }
        Connection conn = null;
        if (dataSource != null) {
            conn = dataSource.getConnection();
        }
        return conn;
    }
    
    /**
     * ��ʾ���������ݿ�����֣�����ȷʵ�����Ƿ���ȷ
     */
    public static void ShowDbName(){
    	
    	try {
			System.out.println("���������ݿ������Ϊ��"+getConnection().getCatalog());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
