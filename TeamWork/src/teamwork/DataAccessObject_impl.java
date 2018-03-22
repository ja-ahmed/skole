package teamwork;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataAccessObject_impl {

    private DBConnector connector = null;

    DataAccessObject_impl(DBConnector connector) {
        this.connector = connector;
    }
    // getTeambers(int teamId) {

    public ArrayList<User> getTeamMembers(int team_id) {

        ArrayList<User> _teamMembers = new ArrayList<>();
        try {

            String sql = "SELECT user.*, team_member.team_id from user inner join team_member on user.user_id = team_member.user_id where team_id =" + team_id;
            Statement stmt = connector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                int _user_id = rs.getInt("user_id");
                String _user1 = rs.getString("username");
                String _pass = rs.getString("password");
                boolean _admin = rs.getBoolean("admin");

                // _admin skal være boolean / enten admin true eller ikke admin false
                User _newuser = new User(_user_id, _user1, _pass, _admin);
                _teamMembers.add(_newuser);
            }
        } catch (Exception e) {
        }
        return _teamMembers;
    }

    public ArrayList<Team> getTeams() {
        ArrayList<Team> teamList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM teamwork.team";
            Statement stmt = connector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                
                int _id = rs.getInt("team_id");
                String _name = rs.getString("teamname");
                
                 Team newTeam = new Team();
                
                 newTeam.setId(_id);
                 newTeam.setName(_name);
                
                 teamList.add(newTeam);
            }
            
            
        } catch (Exception e) {
        }
        return teamList;
    }

    public Team getTeam(int id) {
         Team _team = new Team();
        try { 
            String sql = "SELECT * FROM teamwork.team where team_id =" + id;
            Statement stmt = connector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
                    
            while (rs.next()) {                
                
                int _id = rs.getInt("team_id");
                String _name = rs.getString("teamname");
                
                _team.setId(_id);
                _team.setName(_name);
            }
            
            
        } catch (Exception e) {
        }
        return _team;
    }

    public Team getTeam(String teamname) {
        Team _team = new Team();
        try {
            String sql = "SELECT * FROM teamwork.team where teamname =" + teamname;
            Statement stmt = connector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
                    
            while (rs.next()) {                
                
                int _id = rs.getInt("team_id");
                String _name = rs.getString("teamname");
                
                _team.setId(_id);
                _team.setName(_name);
                
                
            }
            
            
        } catch (Exception e) {
        }
        return _team;
    }

    public ArrayList<User> getUsers() {
        ArrayList<User> _getUsers = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM teamwork.user;";
            Statement stmt = connector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                int _user_id = rs.getInt("user_id");
                String _user = rs.getString("username");
                String _password = rs.getString("password");
                boolean _admin = rs.getBoolean("admin");
                        
                User _newuser = new User(_user_id, _user, _password, _admin);
                _getUsers.add(_newuser);
            }
            
            
        } catch (Exception e) {
        }
        
        return _getUsers;
    }

    public User getUser(int id) {
        User nUser = new User();
        try {
            String sql = "SELECT * FROM user where user_id = " + id;
            Statement stmt = connector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
           
            while (rs.next()) {

                int _user_id = rs.getInt("user_id");
                String _user = rs.getString("username");
                String _password = rs.getString("password");
                boolean _admin = rs.getBoolean("admin");
                nUser.setUsername(_user);
                nUser.setPassword(_password);
                nUser.setId(_user_id);
                nUser.setAdmin(_admin);
                // _admin skal være boolean / enten admin true eller ikke admin false
                
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessObject_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
           return nUser;
    }

    public User getUser(String username) {
         User nUser = new User();
        try {
            String sql = "SELECT * FROM teamwork.user where username = " + username;
            Statement stmt = connector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
           
            while (rs.next()) {

                int _user_id = rs.getInt("user_id");
                String _user = rs.getString("username");
                String _password = rs.getString("password");
                boolean _admin = rs.getBoolean("admin");
                nUser.setUsername(_user);
                nUser.setPassword(_password);
                nUser.setId(_user_id);
                nUser.setAdmin(_admin);
                // _admin skal være boolean / enten admin true eller ikke admin false
                
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessObject_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
           return nUser;
    }

}
