/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glarmester.data;

import glarmester.logic.FrameType;

/**
 *
 * @author Admin
 */
public class Frame2 {
    private FrameType frametype;
    private double framePrice;
    private double glassPrice;

  
    

    public FrameType getFrametype() {
        return frametype;
    }

    public void setFrametype(FrameType frametype) {
        this.frametype = frametype;
    }

    public double getFramePrice() {
        return framePrice;
    }

    public void setFramePrice(double framePrice) {
        this.framePrice = framePrice;
    }

    public double getGlassPrice() {
        return glassPrice;
    }

    public void setGlassPrice(double glassPrice) {
        this.glassPrice = glassPrice;
    }
    
    
}
