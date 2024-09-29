package com.sep28.IPLplayersProject;


import java.util.ArrayList;
import java.util.List;

public class MI {
	
	List <Players> miPlayers = new ArrayList<Players>(); 
	
	public  void mi_player_info() {
		
		
		
		//Batters
		miPlayers.add(new Players("Rohit Sharma","Indian","Batter",2008,257,6628,15));
		miPlayers.add(new Players("Dewald Brevis","South African","Batter",2022,10,230,1));
		miPlayers.add(new Players("Suryakumar Yadav","Indian","Batter",2012,150,3594,0));
		miPlayers.add(new Players("Ishan Kishan","Indian","Wicketkeeper Batter",2016,105,2644,0));
		miPlayers.add(new Players("Harvik Desai","Indian","Wicketkeeper Batter",2024,0,0,0));
		miPlayers.add(new Players("N. Tilak Varma","Indian","Batter",2022,38,1156,0));
		miPlayers.add(new Players("Tim David","Singaporean","Batter",2021,38,659,0));
		miPlayers.add(new Players("Vishnu Vinod","Indian","Batter",2017,6,56,0));
		//All-rounders
		miPlayers.add(new Players("Hardik Pandya","Indian","All-rounder",2015,137,2525,64));
		miPlayers.add(new Players("Arjun Tendulkar","Indian","All-rounder",2023,5,13,3));
		miPlayers.add(new Players("Mohammad Nabi","Afghan","All-rounder",2017,24,215,15));
		miPlayers.add(new Players("Romario Shepherd","West Indian","All-rounder",2022,10,115,4));
		miPlayers.add(new Players("Shams Mulani","Indian","All-rounder",2024,2,1,0));
		miPlayers.add(new Players("Nehal Wadhera","Indian","All-rounder",2023,20,350,0));
		miPlayers.add(new Players("Gerald Coetzee","South Africa","All-rounder",0,10,14,13));
		miPlayers.add(new Players("Anshul Kamboj","Indian","All-rounder",0,3,2,2));
		miPlayers.add(new Players("Naman Dhir","Indian","All-rounder",0,7,140,0));
		miPlayers.add(new Players("Shivalik Sharma","Indian","All-rounder",0,0,0,0));
		//Bowler
		miPlayers.add(new Players("Kwena Maphaka","South Africa","Bowler",2024,2,0,1));
		miPlayers.add(new Players("Jasprit Bumrah","Indian","Bowler",2013,133,69,165));
		miPlayers.add(new Players("Kumar Kartikeya Singh","Indian","Bowler",2022,12,9,10));
		miPlayers.add(new Players("Piyush Chawla","Indian","Bowler",2008,192,624,192));
		miPlayers.add(new Players("Akash Madhwal","Indian","Bowler",2023,13,4,19));
		miPlayers.add(new Players("Luke Wood","England","Bowler",2024,2,9,1));
		miPlayers.add(new Players("Dilshan Madushanka","Sri Lanka","Bowler",0,0,0,0));
		miPlayers.add(new Players("Shreyas Gopal","Indian","Bowler",2023,52,180,52));
		miPlayers.add(new Players("Nuwan Thushara","Sri Lanka","Bowler",2023,7,0,8));
		
		
		

	}
	public MI()
	{
		mi_player_info();
	}
	
	public void allPlayers()
	{
		for(Players p1 : miPlayers)
		{
			System.out.println(p1);
		}
	}
	
	public void allBatters()
	{
		for(Players p1 : miPlayers)
		{
			if(p1.getSpecialization()=="Batter")
			{
				System.out.println(p1.getName());
			}
		}
	}
	public void allBowlers()
	{
		for(Players p1 : miPlayers)
		{
			if(p1.getSpecialization()=="Bowler")
			{
				System.out.println(p1.getName());
			}
		}
	}
	public void allAllRounders()
	{
		for(Players p1 : miPlayers)
		{
			if(p1.getSpecialization()=="All-rounder")
			{
				System.out.println(p1.getName());
			}
		}
	}
	
	public void bestBatsmen()
	{
		for(Players p1 : miPlayers)
		{
			if(p1.getSpecialization()=="Batter"  && p1.getTotal_runs()>1000)
			{
				System.out.println(p1.getName());
			}
		}
	}
	
	public void IndianPlayers()
	{
		for(Players p1:miPlayers)
		{
			if(p1.getNationality()=="Indian")
			{
				System.out.println(p1.getName());
			}
		}
	}
	
	public void nameStartsWith(String s)
	{
		for(Players p1:miPlayers)
		{
			if(p1.getName().startsWith(s))
			{
				System.out.println(p1.getName());
			}
		}
	}

	

}
