package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Hotel;
import com.example.form.HotelForm;
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
	
	
	@ModelAttribute
	public HotelForm setUpPrice() {
		return new HotelForm();
	}
	
	/**
	 * ホテル検索画面の表示
	 * @return ホテル検索画面
	 */
	@RequestMapping("")
	public String hotelSearch() {
		return "hotelSearch";
	}
	@RequestMapping("/searchResult")
	public String searchResult(String price) {
		if(price=="null") {
			Hotel hotel = new Hotel();
		int hotelPrice = hotel.getIntegerPrice();
			
		}
		List<Hotel> listHotel = service.
	}
	

}
