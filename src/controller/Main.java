package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import model.Player;


public class Main{
	public static void main(String args[]){   
		System.out.println("The code has started");
		PlayerDAO playerdao =  new PlayerDAO();
		System.out.println("The problem is not with playerdao");
		List<Player> list = new ArrayList<Player>();
		System.out.println("The problem is not with list object generation");
		try {
			list = playerdao.getAllPlayers();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nThe list has been prepared");
		System.out.println("\n");
		for(Player p : list){
			System.out.println(p.getPlayerld()+"\t"+"\t"+p.getName()+"\t"+"\t"+p.getCountry()+"\t"+"\t"+p.getSkill().getSkillName());
		}
		System.out.println("The code has ended");
	}
}
