package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO {
	public Skill getSkillBylD(Long id) throws Exception{
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement("SELECT * FROM SKILL");
		ResultSet rs = ps.executeQuery();
		// Skill skill = null;
		 
		while(rs.next()){
			 long checkid = rs.getLong(1);
			 if(checkid == id){
				 String name = rs.getString(2);
				 Skill skill = new Skill(checkid, name);
				 //skill.setSkillId(checkid);
				 //skill.setSkillName(name);
				 return skill;
			 }
			}
		return null;
	}
}
