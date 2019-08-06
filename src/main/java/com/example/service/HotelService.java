package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.domain.Hotel;
import com.example.repository.HotelRepository;

/**
 * Hotel情報を操作するサービスクラス.
 * @author yuma.watanabe
 *
 */
public class HotelService {

	@Autowired
	private HotelRepository repository;
	
	
	/**
	 * ホテル価格に応じたホテル情報の検索
	 * @param price ホテル一泊の価格
	 * @return　ホテル価格で検索したホテル情報
	 */
	public List<Hotel> findByPrice(int price) {
		return repository.findByPrice(price);
	}
}
