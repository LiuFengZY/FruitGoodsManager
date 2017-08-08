/**
 * 
 */
package com.coolteam.fruitmgr.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.coolteam.fruitmgr.bean.User;
import com.coolteam.fruitmgr.dao.UserDAO;
import com.coolteam.fruitmgr.utils.DbHandleUtils;
import com.coolteam.fruitmgr.utils.SQLCommonUtils;

/**
 * @author liufeng23
 *
 */
public class HandleUserDaoImpl implements UserDAO{

	@Override
	public Boolean CheckUserLogin(User oneUser) {
		// TODO Auto-generated method stub
		try {
		    ResultSet rs = DbHandleUtils.Query(SQLCommonUtils.makeUserCheckLoginSql(
			    	oneUser.getUserName(), oneUser.getUserPwd()));
		    if (rs.next()) {
			    System.out.println(rs.getString(1) + "." + rs.getString(2));
			    return true;
		    }
		    System.out.println("this user is not registered..");
		    return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQL data base exception..");
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean RegisterOneUser(User oneUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
