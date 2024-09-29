package com.sep28.IPLplayersProject;

import java.util.ArrayList;
import java.util.List;

public class CSK {

	List<Players> cskPlayers = new ArrayList<Players>();

	public void csk_player_info() {

		// Batters
		cskPlayers.add(new Players("Ruturaj Gaikwad", "Indian", "Batter", 2020, 66, 2380, 0));
		cskPlayers.add(new Players("Devon Conway", "South African", "Batter", 2022, 23, 924, 0));
		cskPlayers.add(new Players("MS Dhoni", "Indian", "Wicketkeeper Batter", 2008, 264, 5243, 0));
		cskPlayers.add(new Players("Ajinkya Rahane", "Indian", "Batter", 2008, 185, 4642, 1));
		cskPlayers.add(new Players("Shaik Rasheed", "Indian", "Batter", 0, 0, 0, 0));
		cskPlayers.add(new Players("Sameer Rizvi", "Indian", "Batter", 2024, 8, 51, 0));
		cskPlayers.add(new Players("Avanish Rao Aravelly", "Indian", "Wicketkeeper Batter", 2023, 0, 0, 0));
		// All-rounders
		cskPlayers.add(new Players("Ravindra Jadeja", "Indian", "All-rounder", 2008, 240, 2959, 160));
		cskPlayers.add(new Players("Mitchell Santner", "New Zealander", "All-rounder", 2019, 18, 70, 15));
		cskPlayers.add(new Players("Moeen Ali", "English", "All-rounder", 2018, 67, 1162, 35));
		cskPlayers.add(new Players("Shivam Dube", "Indian", "All-rounder", 2019, 65, 1502, 5));
		cskPlayers.add(new Players("Nishant Sindhu", "Indian", "All-rounder", 0, 0, 0, 0));
		cskPlayers.add(new Players("Ajay Mandal", "Indian", "All-rounder", 0, 0, 0, 0));
		cskPlayers.add(new Players("Rachin Ravindra", "New Zealand", "All-rounder", 2024, 10, 222, 0));
		cskPlayers.add(new Players("Shardul Thakur", "Indian", "All-rounder", 2015, 95, 307, 94));
		cskPlayers.add(new Players("Daryl Mitchell", "New Zealander", "All-rounder", 2022, 15, 351, 1));
		// Bowler
		cskPlayers.add(new Players("Richard Gleeson", "English", "Bowler", 2024, 2, 2, 1));
		cskPlayers.add(new Players("Rajvardhan Hangargekar", "Indian", "Bowler", 2023, 2, 0, 3));
		cskPlayers.add(new Players("Deepak Chahar", "Indian", "Bowler", 2016, 81, 80, 77));
		cskPlayers.add(new Players("Maheesh Theekshana", "Sri Lankan", "Bowler", 2022, 27, 7, 25));
		cskPlayers.add(new Players("Mukesh Choudhary", "Indian", "Bowler", 2022, 14, 6, 16));
		cskPlayers.add(new Players("Mustafizur Rahman", "Bangladeshi", "Bowler", 2016, 57, 13, 61));
		cskPlayers.add(new Players("Prashant Solanki", "Indian", "Bowler", 2022, 2, 0, 2));
		cskPlayers.add(new Players("Simarjeet Singh", "Indian", "Bowler", 2022, 10, 7, 9));
		cskPlayers.add(new Players("Tushar Deshpande", "Indian", "Bowler", 2020, 36, 21, 42));
		cskPlayers.add(new Players("Matheesha Pathirana", "Sri Lankan", "Bowler", 2022, 20, 0, 34));

	}

	public CSK() {
		csk_player_info();
	}

	public void allPlayers() {
		for (Players p1 : cskPlayers) {
			System.out.println(p1);
		}
	}

	public void allBatters() {
		for (Players p1 : cskPlayers) {
			if (p1.getSpecialization() == "Batter") {
				System.out.println(p1.getName());
			}
		}
	}

	public void allBowlers() {
		for (Players p1 : cskPlayers) {
			if (p1.getSpecialization() == "Bowler") {
				System.out.println(p1.getName());
			}
		}
	}

	public void allAllRounders() {
		for (Players p1 : cskPlayers) {
			if (p1.getSpecialization() == "All-rounder") {
				System.out.println(p1.getName());
			}
		}
	}

	public void bestBatsmen() {
		for (Players p1 : cskPlayers) {
			if (p1.getSpecialization() == "Batter" 
					&& p1.getTotal_runs() > 1000) {
				System.out.println(p1.getName());
			}
		}
	}

	public void IndianPlayers() {
		for (Players p1 : cskPlayers) {
			if (p1.getNationality() == "Indian") {
				System.out.println(p1.getName());
			}
		}
	}
	
	public void bestAllRounder()
	{
		for(Players p1 : cskPlayers)
		{
			if(p1.getSpecialization()=="All-rounder" && p1.getTotal_runs()>500 && p1.getTotal_wickets()>30)
			{
				System.out.println(p1.getName());
			}
		}
	}
	public void nameStartsWith(String s)
	{
		for(Players p1:cskPlayers)
		{
			if(p1.getName().startsWith(s))
			{
				System.out.println(p1.getName());
			}
		}
	}

}
