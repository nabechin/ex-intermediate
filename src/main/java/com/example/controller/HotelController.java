package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.HotelService;

/**
 * ホテル情報を操作するコントローラクラス.
 * @author yuma.watanabe
 *
 */
@Controller
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelService service;
	
	/**
	 * ホテル検索画面の表示
	 * @return ホテル検索画面
	 */
	@RequestMapping("")
	public String hotelSearch() {
		return "hotelSearch";
	}
	

}
