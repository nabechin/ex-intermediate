package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Hotel;
import com.example.repository.HotelRepository;

/**
 * Hotel情報を操作するサービスクラス.
 * @author yuma.watanabe
 *
 */
@Service
@Transactional
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
	/**
	 * ホテル情報の全件検索
	 * @return 全ホテル情報
	 */
	public List<Hotel> findAll(){
		return repository.findAll();
	}
} 
