/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.Label;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jamal_ahmed
 */
public class Dice {

    private double result;

    public int rollDice() {
        Random rb = new Random();
        int roll = rb.nextInt(6) + 1;

        return roll;

    }

    public void play(JTextField guess1, JTextField guess2, JTextField result1, JTextField result2,JTextField totalScore,JTextField bet, Player p1, Label balance, Gamestats gamestats, JFrame frame, ArrayList<Double> moneyWon) {
        
      
        
       double _result1 = Double.parseDouble(result1.getText());
       double _result2 = Double.parseDouble(result2.getText());
       double _guess1 = Double.parseDouble(guess1.getText());
       double _guess2 = Double.parseDouble(guess2.getText());
       double _totalScore = Double.parseDouble(totalScore.getText());
       double _bet = Double.parseDouble(bet.getText());
       double won = 0;
       
       
           
         p1.setBank(p1.getBank()-_bet);
         
         if(p1.getBank() > 0){
         
             balance.setText(String.valueOf(p1.getBank()));
        
         
        if (_guess1 == _result1 || _guess2 == _result2 && _guess1 == _result2 || _guess2 == _result1) {
            
            gamestats.setAmountWon(gamestats.getAmountWon()+1);
            
            if (_totalScore == 2 || _totalScore == 3 || _totalScore == 11 || _totalScore == 12) {

              p1.setBank(p1.getBank()+(_bet*1.50));
              balance.setText(String.valueOf(p1.getBank()));
              
               won = _bet*1.50;
              
              
              
              JOptionPane.showMessageDialog(frame, "You won "+won+"kr.");
          
            }
            if (_totalScore == 4 || _totalScore == 5 || _totalScore == 9 || _totalScore == 10) {

              p1.setBank(p1.getBank()+(_bet*2));
              balance.setText(String.valueOf(p1.getBank()));
              won = _bet*2;
                
              JOptionPane.showMessageDialog(frame, "You won "+won+"kr.");
          
              
            }
            if (_totalScore == 6 || _totalScore == 7 || _totalScore == 8 ) {

              p1.setBank(p1.getBank()+(_bet*3));
              balance.setText(String.valueOf(p1.getBank()));
               won = _bet*3;
             
              JOptionPane.showMessageDialog(frame, "You won "+won+"kr.");
          
              
            }
           moneyWon.add(won);
        }
        else {         
        gamestats.setAmountLost(gamestats.getAmountLost()+1);
        moneyWon.add(won);
                
              JOptionPane.showMessageDialog(frame, "You lost "+_bet+"kr.");
          
        }
       
         } else {
         
             System.exit(0);
             
         }
        
    
        
        
        
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
