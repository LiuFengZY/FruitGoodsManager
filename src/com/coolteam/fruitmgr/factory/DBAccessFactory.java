/**
 * 
 */
package com.coolteam.fruitmgr.factory;

import com.coolteam.fruitmgr.dao.*;
import com.coolteam.fruitmgr.daoimpl.*;
/**
 * @author liufeng23
 *
 */
public class DBAccessFactory {
	
	public static UserDAO getUserDAOInstance() {
		return new HandleUserDaoImpl();
	}
	
	public static FruitGoodsDAO getFruitGoodDAOInstance() {
		return new HandleGetFruitDaoImpl();
	}

}
