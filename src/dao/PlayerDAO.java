package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO{
	static List<Player> list = new ArrayList<Player>();
	public List<Player> getAllPlayers() throws Exception{
		String sql = "SELECT * FROM PLAYER";
		Connection con = ConnectionManager.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		Skill skill = null;
		while(rs.next()){			
				long playerId = rs.getLong(1);
				String playerName = rs.getString(2);
				String playerCountry = rs.getString(3);	
				long skillID = rs.getLong(4);
				SkillDAO skilldao = new SkillDAO();
				skill = skilldao.getSkillBylD(skillID);
				Player player = new Player(playerId,playerName,playerCountry,skill);
				list.add(player);  
		    }
		return list;	
	}	
}
