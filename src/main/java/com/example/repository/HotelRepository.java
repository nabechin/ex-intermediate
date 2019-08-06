package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Hotel;

/**
 * hotelsテーブルを操作するRepositoryクラス
 * 
 * @author yuma.watanabe
 *
 */
@Repository
public class HotelRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	private final static RowMapper<Hotel> HOTEL_ROW_MAPPER = (rs, i) -> {
		Hotel hotel = new Hotel();
		hotel.setId(rs.getInt("id"));
		hotel.setAreaName(rs.getString("area_name"));
		hotel.setHotelName(rs.getString("hotel_name"));
		hotel.setAddress(rs.getString("address"));
		hotel.setNearestStation(rs.getString("nearest_station"));
		hotel.setPrice(rs.getInt("price"));
		hotel.setParking(rs.getString("parking"));
		return hotel;
	};

	/**
	 * ホテル価格に応じたホテル情報の検索
	 * @param price　ホテルの料金
	 * @return　ホテルの情報
	 */
	public List<Hotel> findByPrice(int price) {
		String findByPriceSql = "SELECT id,area_name,hotel_name,address,nearest_station,price,parking FROM hotels WHERE price<=:price";
		SqlParameterSource param = new MapSqlParameterSource().addValue("price", price);
		List<Hotel> hotelList = template.query(findByPriceSql, param, HOTEL_ROW_MAPPER);
		return hotelList;
	}
	
	public List<Hotel> findAll(){
		String findAllSql = "SELECT id,area_name,hotel_name,address,nearest_station,price,parking FROM hotels";
		List<Hotel> hotelList = template.query(findAllSql,HOTEL_ROW_MAPPER);
		return hotelList;
	}

}
