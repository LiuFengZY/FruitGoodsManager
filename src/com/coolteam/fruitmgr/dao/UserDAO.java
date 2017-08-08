package com.coolteam.fruitmgr.dao;

import com.coolteam.fruitmgr.bean.User;;

public interface UserDAO {

	public Boolean CheckUserLogin(User oneUser);
	
	public Boolean RegisterOneUser(User oneUser);
}
