/**
 * 
 */
package com.coolteam.fruitmgr.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author liufeng23
 * DataBase ����ɾ���ġ���
 */
public class DbHandleUtils {

	static Statement stmt=null;
	
	/**�����ݿ��������
	 * @param sql SQL���
	 * @return ������Ӱ�������
	 */
	public static int Add(String sql){
		try {
			stmt=DataConnection.getConnection().createStatement();
			return stmt.executeUpdate(sql);//executeUpdate( ) ����ִ��insert��delete��update��䣬����int
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**�����ݿ���ɾ������
	 * @param sql	SQL���
	 * @return 	������Ӱ�������
	 */
	public static int Delete(String sql){
		try {
			stmt=DataConnection.getConnection().createStatement();
			return stmt.executeUpdate(sql);//executeUpdate( ) ����ִ��insert��delete��update��䣬����int
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**�������ݿ�����
	 * @param sql	SQL���
	 * @return	������Ӱ�������
	 */
	public static int Update(String sql){
		try {
			stmt=DataConnection.getConnection().createStatement();
			return stmt.executeUpdate(sql);//executeUpdate( ) ����ִ��insert��delete��update��䣬����int
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**��ѯ���ݿ�����
	 * @param sql	SQL���
	 * @return	���ؽ����
	 */
	public static ResultSet Query(String sql){
		try {
			stmt=DataConnection.getConnection().createStatement();
			return stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
