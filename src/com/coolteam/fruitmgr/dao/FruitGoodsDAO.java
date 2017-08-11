package com.coolteam.fruitmgr.dao;

import java.util.List;
import com.coolteam.fruitmgr.bean.*;

public interface FruitGoodsDAO {

	public List<FruitGoods> getAllMainFruitGoods(); //获取主要水果商品

	public List<FruitGoods> getAllFruitGoods();

	public List<FruitGoods> getFruitGoodsForType(int type);

	public FruitGoods getFruitGoodForId(int id);//通过ID获取商品

	public List<FruitGoods> searchFruitGoodsByNameFuzzy(String name);

	public String getGoodsCategoryName(int id);//通过编号id来获取商品的分类名称
}
