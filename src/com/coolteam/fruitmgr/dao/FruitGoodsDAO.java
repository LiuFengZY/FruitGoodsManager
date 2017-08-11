package com.coolteam.fruitmgr.dao;

import java.util.List;
import com.coolteam.fruitmgr.bean.*;

public interface FruitGoodsDAO {

	public List<FruitGoods> getAllMainFruitGoods(); //��ȡ��Ҫˮ����Ʒ

	public List<FruitGoods> getAllFruitGoods();

	public List<FruitGoods> getFruitGoodsForType(int type);

	public FruitGoods getFruitGoodForId(int id);//ͨ��ID��ȡ��Ʒ

	public List<FruitGoods> searchFruitGoodsByNameFuzzy(String name);

	public String getGoodsCategoryName(int id);//ͨ�����id����ȡ��Ʒ�ķ�������
}
