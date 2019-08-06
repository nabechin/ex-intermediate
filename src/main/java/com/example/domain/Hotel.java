package com.example.domain;

/**
 * ホテル情報を表すクラス.
 * 
 * @author yuma.watanabe
 *
 */
public class Hotel {

	/**
	 * ホテルのid
	 */
	private Integer id;
	/**
	 * ホテルの地域圏
	 */
	private String areaName;
	/**
	 * ホテルの名前
	 */
	private String hotelName;
	/**
	 * ホテルの住所
	 */
	private String address;
	/**
	 * ホテルの最寄駅
	 */
	private String nearestStation;
	/**
	 * ホテル一泊の値段
	 */
	private Integer price;
	/**
	 * ホテルの駐車場の有無
	 */
	private String parking;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNearestStation() {
		return nearestStation;
	}

	public void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

}
