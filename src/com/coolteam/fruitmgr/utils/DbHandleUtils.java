/**
 * 
 */
package com.coolteam.fruitmgr.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author liufeng23
 * DataBase 增、删、改、查
 */
public class DbHandleUtils {

	static Statement stmt=null;
	
	/**往数据库添加数据
	 * @param sql SQL语句
	 * @return 返回受影响的行数
	 */
	public static int Add(String sql){
		try {
			stmt=DataConnection.getConnection().createStatement();
			return stmt.executeUpdate(sql);//executeUpdate( ) 用于执行insert、delete和update语句，返回int
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**从数据库中删除数据
	 * @param sql	SQL语句
	 * @return 	返回受影响的行数
	 */
	public static int Delete(String sql){
		try {
			stmt=DataConnection.getConnection().createStatement();
			return stmt.executeUpdate(sql);//executeUpdate( ) 用于执行insert、delete和update语句，返回int
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**更新数据库数据
	 * @param sql	SQL语句
	 * @return	返回受影响的行数
	 */
	public static int Update(String sql){
		try {
			stmt=DataConnection.getConnection().createStatement();
			return stmt.executeUpdate(sql);//executeUpdate( ) 用于执行insert、delete和update语句，返回int
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**查询数据库数据
	 * @param sql	SQL语句
	 * @return	返回结果集
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
