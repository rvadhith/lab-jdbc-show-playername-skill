package model;


public class Player {
	Long playerld;
	String name;
	String country;
	Skill skill;
	
	//Constructor for Player class
	public Player(Long playerld, String name, String country, Skill skill) {
		this.playerld = playerld;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	
	//Getters and Setters for Player class fields
	public Long getPlayerld() {
		return playerld;
	}

	public void setPlayerld(Long playerld) {
		this.playerld = playerld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
}
