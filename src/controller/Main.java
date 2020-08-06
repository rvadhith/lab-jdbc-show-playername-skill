package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import model.Player;


public class Main{
	public static void main(String args[]) throws Exception{   
		PlayerDAO playerdao =  new PlayerDAO();
		List<Player> list = new ArrayList<Player>();
		try {
			list = playerdao.getAllPlayers();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Player p : list){
			System.out.println(p.getPlayerld()+ " " +p.getName()+ " " +p.getCountry()+ " " +p.getSkill().getSkillName());
		}
	}
}
