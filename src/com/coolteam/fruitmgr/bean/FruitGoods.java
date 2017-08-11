/**
 * 
 */
package com.coolteam.fruitmgr.bean;

/**
 * @author liufeng23
 *
 */
public class FruitGoods {

	int goodid;
	int categoryid;
	String fruitname;
	String price;
	String label;
	String addressfruit;
	String expirationdate;
	String usercomment;
	boolean ifmainfruit;
	String mainphotopath;
	
	public int getGoodId() {
		return this.goodid;
	}
	
	public void setGoodId(int id) {
		this.goodid = id;
	}
	
	public int getCategoryId() {
		return this.categoryid;
	}
	
	public void setCategoryId(int cateid) {
		this.categoryid = cateid;
	}
	
	public String getFruitName() {
		return this.fruitname;
	}
	
	public void setFruitName(String frname) {
		this.fruitname = frname;
	}

	public String getPrice() {
		return this.price;
	}
	
	public void setPrice(String oneprice) {
		this.price = oneprice;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public void setLabel(String onelabel) {
		this.label = onelabel;
	}
	
	public String getFruitAddress() {
		return this.addressfruit;
	}
	
	public void setFruitAdderss(String fruitaddr) {
		this.addressfruit = fruitaddr;
	}
	
	public void setExpirationDate(String expirationD) {
		this.expirationdate =expirationD;
	}
	
	public String getExpirationDate() {
		return this.expirationdate;
	}

	public void setUserComment(String ucomment) {
		this.usercomment = ucomment;
	}
	
	public String getUserComment() {
		return this.usercomment;
	}

	public void setIfMainFruit(boolean ifmain) {
		this.ifmainfruit = ifmain;
	}
	
	public boolean getIfMainFruit() {
		return this.ifmainfruit;
	}
	
	public void setMainPhotoPath(String path) {
		this.mainphotopath = path;
	}
	
	public String getMainPhotoPath() {
		return this.mainphotopath;
	}
	
}
