/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glarmester.presentation;

import glarmester.logic.FrameType;
import static glarmester.logic.FrameType.Lavish;
import static glarmester.logic.FrameType.Ornate;
import static glarmester.logic.FrameType.Simple;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TUI implements UI {

    
    
    private double getInput(String msg) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println(msg);
        double num = userInput.nextDouble();
        return num/100;
    };
    
    
    private FrameType frameMessage(){
        //Simple, Ornate, Lavish;
        Scanner type = new Scanner(System.in);
        
        System.out.println("choose between 3 Frames");
        System.out.println("Press 1 for Simple");
        System.out.println("Press 2 for Ornate");
        System.out.println("Press 3 for Lavish");
        int t = type.nextInt();
         switch(t){
            case 1: return Simple;
            case 2: return Ornate;
            case 3: return Lavish;
        }
        return null;
    }
    
    
    @Override
    public double getFrameHeight() {
        String s = "Get frame height";
        
        return getInput(s);
    }

    @Override
    public double getFrameWidth() {
        String s = "Your frame width";
        return getInput(s);
    }

    @Override
    public FrameType getFrameType() {
        return frameMessage();
    }

    @Override
    public void displayPrice(double price) {
        System.out.println("Your price is "+price);
    }
    
    
    
    
}
