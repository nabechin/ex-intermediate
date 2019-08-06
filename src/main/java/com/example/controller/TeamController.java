package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Team;
import com.example.service.TeamService;

/**
 * チーム情報を操作するコントローラ.
 * 
 * @author yuma.watanabe
 * 
 *
 */
@Controller
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private TeamService service;

	/**
	 * チーム一覧画面を表示する.
	 * 
	 * @param model リクエストパラメータ
	 * @return チーム一覧画面
	 */
	@RequestMapping("")
	public String showList(Model model) {
		List<Team> teamList = service.findAll();
		model.addAttribute("teamList", teamList);
		return "showTeamlist";
	}

	/**
	 * チームの詳細画面を表示
	 * 
	 * @param id    チームId
	 * @param model リクエストスコープ
	 * @return チームの詳細情報画面
	 */
	@RequestMapping("/showTeamDetail")
	public String showTeamDetail(int id, Model model) {
		Team team = service.load(id);
		model.addAttribute("team", team);
		return "showTeamDetail";
	}

}
