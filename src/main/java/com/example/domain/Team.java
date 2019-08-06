package com.example.domain;



/**
 * チーム情報一覧を表すクラス.
 * 
 * @author yuma.watanabe
 *
 */
public class Team {

	/**
	 * チームid
	 */
	private Integer id;
	/**
	 * リーグ名
	 */
	private String leagueName;
	/**
	 * チーム名
	 */
	private String teamName;
	/**
	 * チームの本拠地
	 */
	private String headquaters;
	/**
	 * チームの発足日
	 */
	private String inauguration;
	/**
	 * チームの歴史
	 */
	private String history;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getHeadquaters() {
		return headquaters;
	}

	public void setHeadquaters(String headquaters) {
		this.headquaters = headquaters;
	}

	public String getInauguration() {
		return inauguration;
	}

	public void setInauguration(String inauguration) {
		this.inauguration = inauguration;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", leagueName=" + leagueName + ", teamName=" + teamName + ", headquaters="
				+ headquaters + ", inauguration=" + inauguration + ", history=" + history + "]";
	}
	

}
