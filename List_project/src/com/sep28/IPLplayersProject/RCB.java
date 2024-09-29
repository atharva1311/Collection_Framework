package com.sep28.IPLplayersProject;

import java.util.ArrayList;
import java.util.List;

public class RCB {
	List<Players> rcbPlayers = new ArrayList<Players>();

	public void rcb_player_info() {

		// Batters
		rcbPlayers.add(new Players("Faf du Plessis", "South African", "Batter", 2012, 145, 4571, 0));
		rcbPlayers.add(new Players("Rajat Patidar", "Indian", "Batter", 2021, 27, 799, 0));
		rcbPlayers.add(new Players("Virat Kohli", "Indian", "Batter", 2008, 252, 8004, 4));
		rcbPlayers.add(new Players("Anuj Rawat", "Indian", "Wicketkeeper Batter", 2021, 24, 318, 0));
		rcbPlayers.add(new Players("Dinesh Karthik", "Indian", "Wicketkeeper Batter", 2008, 257, 4842, 0));
		rcbPlayers.add(new Players("Suyash S Prabhudessai", "Indian", "Batter", 2022, 11, 126, 0));
		rcbPlayers.add(new Players("Will Jacks", "England", "Batter", 0, 8, 230, 2));
		rcbPlayers.add(new Players("Saurav Chuahan", "Indian", "Batter", 0, 3, 18, 0));
		// All-rounders
		rcbPlayers.add(new Players("Glenn Maxwell", "Australian", "All-rounder", 2012, 134, 2771, 37));
		rcbPlayers.add(new Players("Mahipal Lomror", "Indian", "All-rounder", 2018, 40, 527, 1));
		rcbPlayers.add(new Players("Karn Sharma", "Indian", "All-rounder", 2013, 84, 350, 76));
		rcbPlayers.add(new Players("Cameron Green", "Australia", "All-rounder", 2023, 29, 707, 16));
		rcbPlayers.add(new Players("Swapnil Singh", "Indian", "Bowling all-rounder", 2023, 14, 39, 6));
		rcbPlayers.add(new Players("Mayank Dagar", "Indian", "All-rounder", 2023, 8, 0, 2));
		rcbPlayers.add(new Players("Manoj Bhandage", "Indian", "All-rounder", 0, 0, 0, 0));
		// Bowler
		rcbPlayers.add(new Players("Akash Deep", "Indian", "Bowler", 2022, 8, 19, 7));
		rcbPlayers.add(new Players("Alzarri Joseph", "West Indian", "Bowler", 2019, 22, 27, 21));
		rcbPlayers.add(new Players("Lockie Ferguson", "New Zealander", "Bowler", 2017, 45, 68, 46));
		rcbPlayers.add(new Players("Mohammed Siraj", "Indian", "Bowler", 2017, 93, 109, 93));
		rcbPlayers.add(new Players("Yash Dayal", "Indian", "Bowler", 2022, 28, 0, 28));
		rcbPlayers.add(new Players("Tom Curran", "English", "Bowler", 2018, 13, 127, 13));
		rcbPlayers.add(new Players("Reece Topley", "England", "Bowler", 2023, 5, 3, 5));
		rcbPlayers.add(new Players("Himanshu Sharma", "Indian", "Bowler", 2023, 2, 0, 0));
		rcbPlayers.add(new Players("Rajan Kumar", "Indian", "Bowler", 0, 0, 0, 0));
		rcbPlayers.add(new Players("Vyshak Vijay Kumar", "Indian", "Bowler", 0, 11, 14, 13));

	}

	public RCB() {
		rcb_player_info();
	}

	public void allPlayers() {
		for (Players p1 : rcbPlayers) {
			System.out.println(p1);
		}
	}

	public void allBatters() {
		for (Players p1 : rcbPlayers) {
			if (p1.getSpecialization() == "Batter") {
				System.out.println(p1.getName());
			}
		}
	}

	public void allBowlers() {
		for (Players p1 : rcbPlayers) {
			if (p1.getSpecialization() == "Bowler") {
				System.out.println(p1.getName());
			}
		}
	}

	public void allAllRounders() {
		for (Players p1 : rcbPlayers) {
			if (p1.getSpecialization() == "All-rounder") {
				System.out.println(p1.getName());
			}
		}
	}

	public void bestBatsmen() {
		for (Players p1 : rcbPlayers) {
			if ((p1.getSpecialization() == "Batter" || p1.getSpecialization() == "All-rounder")
					&& p1.getTotal_runs() > 1000) {
				System.out.println(p1.getName());
			}
		}
	}

	public void IndianPlayers() {
		for (Players p1 : rcbPlayers) {
			if (p1.getNationality() == "Indian") {
				System.out.println(p1.getName());
			}
		}
	}
	
	public void bestBowlers() {
		for (Players p1 : rcbPlayers) {
			if (p1.getSpecialization() == "Bowler"&& p1.getTotal_wickets() > 50) {
				System.out.println(p1.getName());
			}
		}
	}
	public void nameStartsWith(String s)
	{
		for(Players p1:rcbPlayers)
		{
			if(p1.getName().startsWith(s))
			{
				System.out.println(p1.getName());
			}
		}
	}

}
