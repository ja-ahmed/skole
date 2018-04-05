/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glarmester.data;

import glarmester.logic.FrameType;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class DataAccessorN implements DataAccessor{

  
 
    
    
    
    public double getGlassprice() {
           double glassprice = 0;
            Frame2 _glassprice = new Frame2();
        try {
            DBConnector connector = new DBConnector();
           
             String sql = "SELECT glassprice FROM glarmester.framesdb;" ;
            Statement stmt = connector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
               
                
                double price = rs.getDouble("glassprice");
                
                _glassprice.setGlassPrice(price);
                glassprice = _glassprice.getGlassPrice();
              
               
             }
            
            
        } catch (Exception e) {
        }
 
       return glassprice;
    }

    @Override
    public double getFramePrice(FrameType type) {
        double result = 0.0;
      
        
        try {
            DBConnector connector = new DBConnector();
            String sql = "SELECT * FROM glarmester.framesdb where frametype = "+"'"+type+"'";
            
            Statement stmt = connector.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {  
                double framePrice = rs.getDouble("frameprice");
                double glassPrice = rs.getDouble("glassprice");
           
                
                Frame2 frame = new Frame2();
                
                frame.setFramePrice(framePrice);
                
                frame.setFrametype(type);
                frame.setGlassPrice(glassPrice);
                
                result =  frame.getFramePrice();
            }
            
        } catch (Exception e) {
        }   
        return result;
    }
    
}
