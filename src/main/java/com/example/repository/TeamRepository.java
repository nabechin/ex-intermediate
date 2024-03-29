package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Team;

/**
 * teamsテーブルを操作するクラス.
 * 
 * @author yuma.watanabe
 *
 */
@Repository
public class TeamRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;

	private final static RowMapper<Team> TEAM_ROW_MAPPER = (rs, i) -> {
		Team team = new Team();
		team.setId(rs.getInt("id"));
		team.setLeagueName(rs.getString("league_name"));
		team.setTeamName(rs.getString("team_name"));
		team.setHeadquarters(rs.getString("headquarters"));
		team.setInauguration(rs.getString("inauguration"));
		team.setHistory(rs.getString("history"));
		return team;
	};
	
	/**
	 * 全チーム情報の取得.
	 * @return 全チーム情報一覧
	 */
	public List<Team> findAll() {
		String findAllSql = "SELECT id,league_name,team_name,headquarters,inauguration,history FROM teams ORDER BY inauguration";
		List <Team> teamList = template.query(findAllSql,TEAM_ROW_MAPPER);
		return teamList;
	}
	/**
	 * 一件のチーム情報を取得.
	 * @param id チームId
	 * @return 一件のチーム情報
	 */
	public Team load(int id){
		String loadSql = "SELECT id,league_name,team_name,headquarters,inauguration,history FROM teams WHERE id=:id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id",id);
		Team team = template.queryForObject(loadSql, param, TEAM_ROW_MAPPER);
		return team;
				
	}

}
