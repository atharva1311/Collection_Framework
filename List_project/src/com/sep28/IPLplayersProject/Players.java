package com.sep28.IPLplayersProject;

public class Players {
	private String name;
	private String nationality;
	private String specialization;
	private int debut;
	private int matches;
	private int total_runs;
	private int total_wickets;
	public Players() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Players(String name, String nationality, String specialization, int debut, int matches, int total_runs, int total_wickets) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.specialization = specialization;
		this.debut = debut;
		this.matches = matches;
		this.total_runs = total_runs;
		this.total_wickets = total_wickets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getDebut() {
		return debut;
	}
	public void setDebut(int debut) {
		this.debut = debut;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getTotal_runs() {
		return total_runs;
	}
	public void setTotal_runs(int total_runs) {
		this.total_runs = total_runs;
	}
	public int getTotal_wickets() {
		return total_wickets;
	}
	public void setTotal_wickets(int total_wickets) {
		this.total_wickets = total_wickets;
	}
	@Override
	public String toString() {
		return "Players [name=" + name + ", nationality=" + nationality + ", specialization=" + specialization
				+ ", debut=" + debut + ", matches=" + matches + ", total_runs=" + total_runs + ", total_wickets="
				+ total_wickets + "]";
	}
	
	
	
}
