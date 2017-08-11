/**
 * 
 */
package com.coolteam.fruitmgr.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.coolteam.fruitmgr.bean.FruitGoods;
import com.coolteam.fruitmgr.dao.FruitGoodsDAO;
import com.coolteam.fruitmgr.utils.DbHandleUtils;
import com.coolteam.fruitmgr.utils.SQLCommonUtils;

/**
 * @author liufeng23
 *
 */
public class HandleGetFruitDaoImpl implements FruitGoodsDAO {

	@Override
	public List<FruitGoods> getAllMainFruitGoods() {
		// TODO Auto-generated method stub
		ResultSet rs = DbHandleUtils.Query(SQLCommonUtils.makeGetAllFruitGoodsSql(true));
		if(rs==null)
			return null;
		List<FruitGoods> list=new ArrayList<FruitGoods>();
        try {
            while(rs.next()) {
                FruitGoods onegoods=new FruitGoods();
                //id categoryId name price label address manufacturer dateBegin shelfLife mainMaterial
                onegoods.setGoodId(rs.getInt(1));
                onegoods.setCategoryId(rs.getInt(2));
                onegoods.setFruitName(rs.getString(3));
                onegoods.setPrice(rs.getString(4));
                onegoods.setLabel(rs.getString(5));
                onegoods.setFruitAdderss(rs.getString(6));
                onegoods.setExpirationDate(rs.getString(7));
                onegoods.setUserComment(rs.getString(8));
                onegoods.setIfMainFruit(rs.getBoolean(9));
                onegoods.setMainPhotoPath(rs.getString(10));
                list.add(onegoods);
            }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			    rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public List<FruitGoods> getAllFruitGoods() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FruitGoods> getFruitGoodsForType(int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FruitGoods getFruitGoodForId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FruitGoods> searchFruitGoodsByNameFuzzy(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGoodsCategoryName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
