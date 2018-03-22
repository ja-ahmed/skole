/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamwork;

import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class NewMain {
      private static DataAccessObject_impl dao;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
         Team team = dao.getTeam(1);
         System.out.println(team.getName());
    }
    
}
