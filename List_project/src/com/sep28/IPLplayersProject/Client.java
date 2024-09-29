package com.sep28.IPLplayersProject;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MI m1 = new MI();
		CSK c1 = new CSK();
		RCB r1 = new RCB();
		
		System.out.println("Batsmen of the MI team are:");
		System.out.println("---------------------------");
		m1.allBatters();
		System.out.println("***************************");
		System.out.println("All-rounders of CSK team are: ");
		System.out.println("-----------------------------");
		c1.allAllRounders();
		System.out.println("************************");
		System.out.println("Bowlers of RCB team are: ");
		System.out.println("------------------------");
		r1.allBowlers();
		System.out.println("************************");
		System.out.println("Best Batters of MI team are: ");
		System.out.println("------------------------");
		m1.bestBatsmen();
		System.out.println("************************");
		System.out.println("Best Bowlers of RCB team are: ");
		System.out.println("------------------------");
		r1.bestBowlers();
		System.out.println("************************");
		System.out.println("Best All-rounders of CSK team are: ");
		System.out.println("------------------------");
		c1.bestAllRounder();
		System.out.println("************************");
		System.out.println("Indian players of MI team are: ");
		System.out.println("------------------------");
		m1.IndianPlayers();
		System.out.println("************************");
		System.out.println("Please enter Letter: ");
		String s=sc.next();
		System.out.println("MI players whose name starts with "+s+" are: ");
		m1.nameStartsWith(s);
	}

}
