package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Team;
import com.example.repository.TeamRepository;

/**
 * Team情報を操作するクラス.
 * 
 * @author yuma.watanabe
 *
 */
@Service
@Transactional
public class TeamService {

	@Autowired
	private TeamRepository repository;

	/**
	 * チーム情報の全件検索.
	 * 
	 * @return チーム情報一覧
	 */
	public List<Team> findAll() {
		return repository.findAll();
	}
	/**
	 * 一件のチーム情報の検索.
	 * 
	 * @param id チームId
	 * @return 1件のチーム情報
	 */
	public Team findBy(int id) {
		return repository.findby(id);
	}
}
