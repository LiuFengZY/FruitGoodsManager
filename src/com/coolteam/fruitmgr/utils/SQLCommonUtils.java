/**
 * 
 */
package com.coolteam.fruitmgr.utils;

/**
 * @author liufeng23
 *
 */
public class SQLCommonUtils {

	public static String makeUserCheckLoginSql(String username, String pwd) {
		String sql="SELECT * FROM fguserinfo where name='" + username + "' and pwd='" + pwd + "'";
		return sql;
	}
	
	public static String makeRegisterUserSql(String username, String pwd) {
		return "";
	}
}
